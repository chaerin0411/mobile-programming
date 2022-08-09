package aca.hankook.customermanagement

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class MyDBHelper (var context : Context) : SQLiteOpenHelper(context, "customerDB", null, 1) {
    override fun onCreate(p0: SQLiteDatabase?) {
        var tableCreSql = "create table customerTBL ( custId integer primary Key autoincrement, name varchar(20), sex varchar(20), phone varchar(20), email varchar(50), city varchar(20), grade varchar(20) );"
        p0!!.execSQL(tableCreSql)
        p0.execSQL("insert into customerTBL(name, sex, phone, email, city, grade) values('홍길동', '남', '010-1111-1111', '1@naver.com', '서울', 'VIP고객');")
        p0.execSQL("insert into customerTBL(name, sex, phone, email, city, grade) values('배수지', '여', '010-2222-2222', '2@naver.com', '서울', 'VIP고객');")
        p0.execSQL("insert into customerTBL(name, sex, phone, email, city, grade) values('한지민', '여', '010-3333-3333', '3@naver.com', '경기', 'VIP고객');")
        p0.execSQL("insert into customerTBL(name, sex, phone, email, city, grade) values('남주혁', '남', '010-4444-4444', '4@naver.com', '인천', 'VIP고객');")
        p0.execSQL("insert into customerTBL(name, sex, phone, email, city, grade) values('조정석', '남', '010-5555-5555', '5@naver.com', '부산', 'VIP고객');")
        p0.execSQL("insert into customerTBL(name, sex, phone, email, city, grade) values('유연석', '남', '010-6666-6666', '6@naver.com', '대구', 'VIP고객');")
        p0.execSQL("insert into customerTBL(name, sex, phone, email, city, grade) values('정경호', '남', '010-7777-7777', '7@naver.com', '대전', 'VIP고객');")
        p0.execSQL("insert into customerTBL(name, sex, phone, email, city, grade) values('양석형', '남', '010-8888-8888', '8@naver.com', '강원', 'VIP고객');")
        p0.execSQL("insert into customerTBL(name, sex, phone, email, city, grade) values('전미도', '여', '010-9999-9999', '9@naver.com', '대전', 'VIP고객');")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        p0!!.execSQL("drop table if exists customerTBL")
        onCreate(p0)
    }
}