package aca.hankook.project10_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* 예제10-5 MainActivity.kt 코드 */
        btnNewActivity.setOnClickListener {
            var intent = Intent(applicationContext, SecondActivity::class.java)
            this.startActivity(intent)
        }
    }
}
