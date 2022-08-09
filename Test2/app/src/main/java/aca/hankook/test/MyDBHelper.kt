package aca.hankook.test

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class MyDBHelper(var context : Context) : SQLiteOpenHelper(context, "customerDB", null, 1) {
    override fun onCreate(p0: SQLiteDatabase?) {
        var tableCreSql = "create table customerTBL (custid integer primary key autoincrement, name varchar(20), sex varchar(2), phone varchar(20), email varchar(50), city varchar(20), grade varchar(20) );"
        p0!!.execSQL(tableCreSql)
        p0.execSQL("insert into customerTBL(name, sex, phone, email, city, grade) values('홍길동', '남', '010-1111-1111', '1111@naver.com', '서울', 'VIP고객');")
        p0.execSQL("insert into customerTBL(name, sex, phone, email, city, grade) values('한지민', '여', '010-2222-2222', '2222@naver.com', '경기', 'A등급고객');")
        p0.execSQL("insert into customerTBL(name, sex, phone, email, city, grade) values('남주혁', '남', '010-3333-3333', '3333@naver.com', '인천', 'A등급고객';")
        p0.execSQL("insert into customerTBL(name, sex, phone, email, city, grade) values('조정석', '남', '010-4444-4444', '4444@naver.com', '부산', 'S등급고객');")
        p0.execSQL("insert into customerTBL(name, sex, phone, email, city, grade) values('유연석', '남', '010-5555-5555', '5555@naver.com', '대구', 'S등급고객');")
        p0.execSQL("insert into customerTBL(name, sex, phone, email, city, grade) values('정경호', '남', '010-6666-6666', '6666@naver.com', '대전', '일반고객');")
        p0.execSQL("insert into customerTBL(name, sex, phone, email, city, grade) values('전미도', '여', '010-7777-7777', '7777@naver.com', '강원', '일반고객');")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        p0!!.execSQL("drop table if exists customerTBL")
        onCreate(p0)
    }

}