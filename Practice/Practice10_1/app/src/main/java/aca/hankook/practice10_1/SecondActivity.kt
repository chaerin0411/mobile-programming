package aca.hankook.practice10_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.second.*
import kotlinx.android.synthetic.main.third.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second)

        btnReturn1.setOnClickListener {
            this.finish()
        }
    }
}
