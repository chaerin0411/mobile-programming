package aca.hankook.final20202296

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class MyDBHelper (var context : Context) : SQLiteOpenHelper(context, "jcrDB", null, 1) {
    override fun onCreate(p0: SQLiteDatabase?) {
        var tableCreSql = "create table jcrTBL ( movieId integer primary Key autoincrement, movieNm varchar(20), movieRank varchar(10), movieTime varchar(10), movieRatings varchar(10), movieGrade varchar(20), movieDesc varchar(200) );"
        p0!!.execSQL(tableCreSql)
        p0.execSQL("insert into jcrTBL(movieNm, movieRank, movieTime, movieRatings, movieGrade, movieDesc) values('타짜', '1', '139분', '9.2', '19', " +
                "'범죄 정치계에서 잔뼈가 굵은 타짜 이철희와 이제 막 정치계에 입문한 초짜들이 각종 현안에 대해 성역 없는 이야기를 나누는 프로그램');")

        p0.execSQL("insert into jcrTBL(movieNm, movieRank, movieTime, movieRatings, movieGrade, movieDesc) values('호빗:다섯군대전투', '2', '144분', '9.6', '모두', " +
                "'판타지 빌보 배긴스, 참나무 방패 소린, 난쟁이 족이 떠난 거대한 여정 끝, 난쟁이 족은 원래 자신들의 터전이던 에레보르에 있는 엄청난 보물을 되찾지만 이는 무시무시한 용 스마우그가 호수마을의 무기력한 주민들을 공격하게 되는 결과를 낳는다.');")
        p0.execSQL("insert into jcrTBL(movieNm, movieRank, movieTime, movieRatings, movieGrade, movieDesc) values('매트릭스', '3', '136분', '9.5', '모두', " +
                "'SF 키아누 리브스, 로렌스 피시번 출연');")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        p0!!.execSQL("drop table if exists customerTBL")
        onCreate(p0)
    }
}