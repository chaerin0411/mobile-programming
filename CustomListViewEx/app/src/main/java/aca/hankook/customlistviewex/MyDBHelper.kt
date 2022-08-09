package aca.hankook.customlistviewex

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class MyDBHelper(context: Context) : SQLiteOpenHelper(context, "studentDB", null, 1) {
    override fun onCreate(p0: SQLiteDatabase?) {
        var tableCreSql = "create table studentTBL (id char(4) primary key, name varchar(20), dept varchar(20), sajin varchar(5), hdong1 varchar(200), hdong2 varchar(600));"
        p0!!.execSQL(tableCreSql)
        p0!!.execSQL("insert into studentTBL values('2101', '배수지', '멀티미디어과', 's2101', '대한민국의 가수겸배우', 'missA 멤버로 데뷔, 영화<건축학개론>으로 스타덤에 오름')")
        p0!!.execSQL("insert into studentTBL values('2102', '한지민', '컴퓨터소프트웨어과', 's2102', '활동1', '활동2')")
        p0!!.execSQL("insert into studentTBL values('2103', '남주혁', '스타트업과', 's2103', '대한민국의 모델이자 배우', '경남중학교 농구선수로 활동하다 모델을 해보라고 말했던 걸 기억했고 모델이 됨')")
        p0!!.execSQL("insert into studentTBL values('2201', '조정석', '간담췌외과', 's2201', '대한민국의 뮤지컬 배우 출신', '연기가 본업, 예능방송, 음반활동')")
        p0!!.execSQL("insert into studentTBL values('2202', '유연석', '소아외과', 's2202', '대한민국배우', '활동2')")
        p0!!.execSQL("insert into studentTBL values('2203', '정경호', '흉부외과', 's2203', '활동1', '활동2')")
        p0!!.execSQL("insert into studentTBL values('2301', '김대명', '산부인과', 's2301', '활동1', '활동2')")
        p0!!.execSQL("insert into studentTBL values('2302', '전미도', '신경외과', 's2302', '활동1', '활동2')")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        p0!!.execSQL("drop table if exists studentTBL")
        onCreate(p0)
    }

}