package aca.hankook.final20202296

import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)
        title = "20202296 전채린"

        rButton1.setOnClickListener {
            var name: String = edName.text.toString()
            var rank: String = edRank.text.toString()
            var time: String = edTime.text.toString()
            var ratings: String = edRatings.text.toString()
            var grade: String = edGrade.text.toString()
            var desc : String = edDesc.text.toString()
            var myHelper: MyDBHelper = MyDBHelper(this)
            var sqlDB: SQLiteDatabase = myHelper.writableDatabase
            var insertSql: String =
                "insert into jcrTBL(movieNm, movieRank, movieTime, movieRatings, movieGrade, movieDesc) values ('" + name + "', '" + rank + "', '" + time + "', '" + ratings + "', '" + grade + "', '" + desc + "')"
            sqlDB.execSQL(insertSql)

            Toast.makeText(applicationContext, "insert ok " + name, Toast.LENGTH_LONG).show()
            sqlDB.close()
        }

        rButton2.setOnClickListener {

        }
    }
}