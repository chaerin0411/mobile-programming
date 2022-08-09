package aca.hankook.project12_1

import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* 예제12-4 Kotlin 코드 3 */
        title = "가수 그룹 관리 DB"

        var myDBHelper = MyDBHelper(this)
        var sqlDB: SQLiteDatabase

        /* 예제12-5 Kotlin 코드 4 */
        btnInit.setOnClickListener {
            sqlDB = myDBHelper.writableDatabase
            myDBHelper.onUpgrade(sqlDB, 1, 2)
            sqlDB.close()
            btnSelect.callOnClick()
        }

        /* 예제12-6 Kotlin 코드 5 */
        btnInsert.setOnClickListener {
            sqlDB = myDBHelper.writableDatabase
            var name = edtName.text.toString()
            var number = edtNumber.text.toString().toInt()
            sqlDB.execSQL("insert into groupTBL values ('$name', $number);")
            sqlDB.close()
            Toast.makeText(applicationContext, "입력됨", Toast.LENGTH_LONG).show()
            edtName.setText("")
            edtNumber.setText("")
            btnSelect.callOnClick()
        }

        btnSelect.setOnClickListener {
            sqlDB = myDBHelper.readableDatabase
            var cursor = sqlDB.rawQuery("select * from groupTBL;", null)

            var strName : String = "그룹이름" + "\r\n" + "--------------------------------" + "\r\n"
            var strNumber : String = "인 원" + "\r\n" + "--------------------------------" + "\r\n"
            while (cursor.moveToNext()) {
                strName += cursor.getString(0) + "\r\n"
                strNumber += cursor.getString(1) + "\r\n"
            }

            edtNameResult.setText(strName)
            edtNumberResult.setText(strNumber)
            sqlDB.close()
        }
    }
}
