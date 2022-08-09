package aca.hankook.ex10_20

import android.app.SearchManager
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* 02 암시적 인텐트
        예제10-21 암시적 인텐트의 Kotlin 코드 */
        title = "암시적 인텐트 예제"

        btnDial.setOnClickListener {
            var uri = Uri.parse("tel:010-4604-5578")
            var intent1 = Intent(Intent.ACTION_DIAL, uri)
            startActivity(intent1)
        }

        btnWeb.setOnClickListener {
            var uri = Uri.parse("http://m.naver.com")
            var intent1 = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent1)
        }

        btnGoogle.setOnClickListener {
            var uri = Uri.parse("geo:0,0?q=동양미래대학교")
            var intent1 = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent1)
        }

        btnSearch.setOnClickListener {
            var intent1 = Intent(Intent.ACTION_WEB_SEARCH)
            intent1.putExtra(SearchManager.QUERY, "안드로이드")
            startActivity(intent1)
        }

        btnSms.setOnClickListener {
            var intent1 = Intent(Intent.ACTION_SENDTO)
            intent1.putExtra("sms_body", "안녕하세요?")
            intent1.data = Uri.parse("smsto:" + Uri.encode("010-4604-5578"))
            startActivity(intent1)
        }

        btnPhoto.setOnClickListener {
            var intent1 = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent1)
        }
    }
}
