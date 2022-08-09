package aca.hankook.project12_1

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

/* 예제12-2 Kotlin 코드 1 */
class MyDBHelper(context: Context) : SQLiteOpenHelper(context, "groupDB", null, 1) {

    /* 예제12-3 Kotlin 코드 2 */
    override fun onCreate(p0: SQLiteDatabase?) {
        var tableCreSql = "CREATE TABLE groupTBL(gName CHAR(20) PRIMARY KEY, gNumber INTEGER);"
        p0!!.execSQL(tableCreSql)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        p0!!.execSQL("DROP TABLE if EXISTS groupTBL")
        onCreate(p0)
    }
}
