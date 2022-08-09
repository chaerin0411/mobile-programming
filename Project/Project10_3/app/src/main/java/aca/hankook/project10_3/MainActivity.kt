package aca.hankook.project10_3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* 예제10-23 Kotlin 코드 1 */
        title = "액티비티 테스트 예제"
        android.util.Log.i("액티비티 테스트", "onCreate()")

        btnDial.setOnClickListener {
            var uri = Uri.parse("tel:010-4604-5578")
            var intent1 = Intent(Intent.ACTION_DIAL, uri)
            startActivity(intent1)
        }

        btnFinish.setOnClickListener {
            finish()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        android.util.Log.i("액티비티 테스트", "onDestroy()")
    }

    override fun onPause() {
        super.onPause()
        android.util.Log.i("액티비티 테스트", "onPause()")
    }

    override fun onRestart() {
        super.onRestart()
        android.util.Log.i("액티비티 테스트", "onRestart()")
    }

    override fun onResume() {
        super.onResume()
        android.util.Log.i("액티비티 테스트", "onResume()")
    }

    override fun onStart() {
        super.onStart()
        android.util.Log.i("액티비티 테스트", "onStart()")
    }

    override fun onStop() {
        super.onStop()
        android.util.Log.i("액티비티 테스트", "onStop()")
    }
}
