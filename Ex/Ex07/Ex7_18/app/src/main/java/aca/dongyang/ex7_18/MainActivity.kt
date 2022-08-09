package aca.dongyang.ex7_18

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* 02 목록 대화상자
        예제7-18 기본목록 대화상자의 Kotlin 코드 */
        button1.setOnClickListener {
            var versionArray = arrayOf("오레오", "파이", "큐(10)")
            var dlg = AlertDialog.Builder(this@MainActivity)
            dlg.setTitle("좋아하는 버전은?")
            dlg.setIcon(R.mipmap.ic_launcher)
            dlg.setItems(versionArray) { dialog, which ->
                button1.text = versionArray[which]
            }
            dlg.setPositiveButton("닫기", null)
            dlg.show()
        }
    }
}
