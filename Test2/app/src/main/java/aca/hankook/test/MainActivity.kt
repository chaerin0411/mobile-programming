package aca.hankook.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 고객등록 액티비티 시작
        button1.setOnClickListener {
            var intent1 = Intent(applicationContext, RegisterActivity::class.java)
            startActivity(intent1)
        }

        // 고객현황 액티비티 시작
        button2.setOnClickListener {
            var intent1 = Intent(applicationContext, CustomerlistActivity::class.java)
            startActivity(intent1)
        }
    }
}
