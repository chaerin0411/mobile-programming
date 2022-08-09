package aca.hankook.practice10_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* 직접풀어보기 10-5 MainActivity.kt 코드 */
        btnNewActivity.setOnClickListener {
            var intent1 :Intent
            if(rdo2.isChecked) {
                intent1 = Intent(applicationContext, SecondActivity::class.java)
            } else {
                intent1 = Intent(applicationContext, ThirdActivity::class.java)
            }
            this.startActivity(intent1)
        }
    }
}
