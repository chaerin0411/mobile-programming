package aca.hankook.ex8_1

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.IOException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* 01 내장 메모리 파일 처리
        예제8-2 파일 처리의 기본 Kotlin 코드 */
        btnWrite.setOnClickListener {
            var outFs : FileOutputStream = openFileOutput("file.txt", Context.MODE_PRIVATE)
            var str = "쿡북 안드로이드"
            outFs.write(str.toByteArray())
            outFs.close()
            Toast.makeText(applicationContext, "file.txt가 생성됨", Toast.LENGTH_LONG).show()
        }

        btnRead.setOnClickListener {
            try {
                var inFs: FileInputStream = openFileInput("file.txt")
                var txt = ByteArray(30)
                inFs.read(txt)
                var str = txt.toString(Charsets.UTF_8)
                Toast.makeText(applicationContext, str, Toast.LENGTH_LONG).show()
                inFs.close()
            } catch (e: IOException) {
                Toast.makeText(applicationContext, "파일 없음" + e, Toast.LENGTH_LONG).show()
            }
        }
    }
}
