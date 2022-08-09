package aca.hankook.final20202296

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detail.*
import kotlinx.android.synthetic.main.rowitem.view.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail)

        var intent1: Intent = intent

        var movieId: Int? = intent1.getIntExtra("movieId", 0)
        var name: String? = intent1.getStringExtra("name")
        var desc: String? = intent1.getStringExtra("desc")

        dName.text = "영화제목: " + name
        dDesc.text = "내용: " + desc
    }
}