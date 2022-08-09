package aca.hankook.customlistviewex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.jasehi.*

class JasehiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.jasehi)

        var intent1 : Intent = intent
        var name : String? = intent1.getStringExtra("name")
        var id : String? = intent1.getStringExtra("id")
        var hdong1 : String? = intent1.getStringExtra("hdong1")
        var hdong2 : String? = intent1.getStringExtra("hdong2")

        jid.text = id
        jName.text = name
        jHdong1.text = hdong1
        jHdong2.text = hdong2
    }
}
