package aca.hankook.customermanagement

import android.annotation.SuppressLint
import android.content.Intent
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.customerlist.*

@SuppressLint("Registered")
class CustomerlistActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.customerlist)
        var custList : ArrayList<CustomerC> = arrayListOf()
        var myHelper : MyDBHelper = MyDBHelper(this)

        var sqlDB: SQLiteDatabase = myHelper.readableDatabase
        var cursor : Cursor = sqlDB.rawQuery("select * from customerTBL", null)
        while(cursor.moveToNext()) {
            custList.add(CustomerC(cursor.getInt(0), cursor.getString(1), cursor.getString(2),
                cursor.getString(3), cursor.getString(4), cursor.getString(5), cursor.getString(6)))
        }
        cursor.close()
        sqlDB.close()

        var adapter1 = ListViewAdapter(custList)
        listView1.adapter = adapter1
        listView1.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(applicationContext, "선택 " + custList.get(i).name, Toast.LENGTH_LONG).show()

            var intent1 = Intent(applicationContext, JasehiActivity::class.java)

            intent1.putExtra("custId", custList.get(i).custId)
            intent1.putExtra("name", custList.get(i).name)
            intent1.putExtra("sex", custList.get(i).sex)
            intent1.putExtra("phone", custList.get(i).phone)
            intent1.putExtra("email", custList.get(i).email)
            intent1.putExtra("city", custList.get(i).city)
            intent1.putExtra("grade", custList.get(i).grade)
            startActivity(intent1)
        }
    }

}