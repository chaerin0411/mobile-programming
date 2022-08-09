package aca.dongyang.practice4_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var msg : String = "id:" + id.text + "pd:" + pwd.text

        // 로그인 버튼을 선택하면
        login.setOnClickListener {
            makeText(applicationContext, msg, LENGTH_SHORT).show()
        }
    }
}
