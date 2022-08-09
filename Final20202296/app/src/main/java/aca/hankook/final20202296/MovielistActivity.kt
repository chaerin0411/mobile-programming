package aca.hankook.final20202296

import android.content.Intent
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.movielist.*
import kotlinx.android.synthetic.main.rowitem.view.*

class MovielistActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.movielist)
        var movieList: ArrayList<MovieC> = arrayListOf()
        var myHelper: MyDBHelper = MyDBHelper(this)

        var sqlDB: SQLiteDatabase = myHelper.readableDatabase
        var cursor: Cursor = sqlDB.rawQuery("select * from jcrTBL", null)
        while (cursor.moveToNext()) {
            movieList.add(
                MovieC(
                    cursor.getInt(0),
                    cursor.getString(1),
                    cursor.getString(2),
                    cursor.getString(3),
                    cursor.getString(4),
                    cursor.getString(5),
                    cursor.getString(6)
                )
            )
        }
        cursor.close()
        sqlDB.close()

        var adapter1 = ListViewAdapter(movieList)
        listView1.adapter = adapter1
        listView1.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(applicationContext, "선택 " + movieList.get(i).movieNm, Toast.LENGTH_LONG)
                .show()

            var intent1 = Intent(applicationContext, DetailActivity::class.java)

            intent1.putExtra("movieId", movieList.get(i).movieId)
            intent1.putExtra("name", movieList.get(i).movieNm)
            intent1.putExtra("desc", movieList.get(i).movieDesc)
            startActivity(intent1)
        }
    }
}