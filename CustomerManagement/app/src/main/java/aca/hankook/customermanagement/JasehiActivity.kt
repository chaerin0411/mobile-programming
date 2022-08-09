package aca.hankook.customermanagement

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.jasehi.*

class JasehiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.jasehi)

        var intent1 : Intent = intent

        var custId : Int? = intent1.getIntExtra( "custId", 0)
        var name : String? = intent1.getStringExtra("name")
        var sex : String? = intent1.getStringExtra("sex")
        var phone : String? = intent1.getStringExtra("phone")
        var email : String? = intent1.getStringExtra("email")
        var city : String? = intent1.getStringExtra("city")
        var grade : String? = intent1.getStringExtra("grade")

        jCustId.text = "고객번호: " + custId
        jName.text = "이름/성별: " + name + "/" + sex
        jPhone.text = "연락처: " + phone
        jEmail.text = "이메일: " + email
        jCity.text = "지역: " + city
        jGrade.text = "고객등급: " + grade
    }
}
