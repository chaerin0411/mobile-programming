package aca.hankook.project10_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.second2.*

class Second2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second2)

        /* 예제10-4 Second2Activity.kt 코드  */
        btnReturn2.setOnClickListener {
            this.finish()
        }
    }
}
