package aca.hankook.ex8_8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.io.InputStream

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* 02 raw 폴더 파일 처리
        예제8-9 /res/raw 폴더의 파일 읽기 Kotlin 코드 */
        btnRead.setOnClickListener {
            var inputS : InputStream = resources.openRawResource(R.raw.dream)
            var txt = ByteArray(inputS.available())
            inputS.read(txt)
            edtRaw.setText(txt.toString(Charsets.UTF_8))
            inputS.close()
        }
    }
}
