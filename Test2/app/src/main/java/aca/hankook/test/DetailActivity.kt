package aca.hankook.test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detail.*
import android.content.Intent as Intent

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail)

        var intent1 : Intent = intent

        var custId : Int? = intent1.getIntExtra("custId", 0)
        var name : String? = intent1.getStringExtra("name")
        var sex : String? = intent1.getStringExtra("sex")
        var phone : String? = intent1.getStringExtra("phone")
        var email : String? = intent1.getStringExtra("email")
        var city : String? = intent1.getStringExtra("city")
        var grade : String? = intent1.getStringExtra("grade")

        dCustId.text = "고객번호 : " + custId
        dName.text = "이름/성별 : " + name + "/" + sex
        dPhone.text = "연락처 : " + phone
        dEmail.text = "이메일 : " + email
        dCity.text = "지역 : " + city
        dGrade.text = "고객등급 : " + grade
    }
}