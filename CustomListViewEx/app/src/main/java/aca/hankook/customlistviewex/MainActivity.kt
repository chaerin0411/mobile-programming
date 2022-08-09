package aca.hankook.customlistviewex

import android.content.Intent
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var studentList : ArrayList<StudentC> = arrayListOf<StudentC>()
        /*
        studentList.add(StudentC("2101", "배수지", "멀티미디어과", "s2101", "배우겸가수", "스타트업 드라마"))
        studentList.add(StudentC("2102", "한지민", "컴퓨터소프트웨어과", "s2101", "배우", "영화"))
        studentList.add(StudentC("2103", "남주혁", "스타트업과", "s2101", "배우", "영화 및 드라마"))
        */

        var myHelper = MyDBHelper(this)
        var sqlDB : SQLiteDatabase = myHelper.readableDatabase
        var cursor : Cursor = sqlDB.rawQuery("select * from studentTBL", null)
        while (cursor.moveToNext()) {
            studentList.add(StudentC(cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getString(5)))
        }
        cursor.close()
        sqlDB.close()

        var adapter1 = ListViewAdapter(studentList)
        listView1.adapter = adapter1

        listView1.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(applicationContext, studentList.get(i).name, Toast.LENGTH_LONG).show()

            var intent1 = Intent(applicationContext, JasehiActivity::class.java)

            intent1.putExtra("name", studentList.get(i).name)
            intent1.putExtra("id", studentList.get(i).id)
            intent1.putExtra("hdong1", studentList.get(i).hdong1)
            intent1.putExtra("hdong2", studentList.get(i).hdong2)
            startActivity(intent1)
        }
    }
}
