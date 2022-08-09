package aca.dongyang.ex7_16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* 예제7-16 버튼이 1개인 대화상자의 Kotlin 코드 */
        button1.setOnClickListener {
            var dlg = AlertDialog.Builder(this@MainActivity)
            dlg.setTitle("제목입니다")
            dlg.setMessage("이곳이 내용입니다")
            dlg.setIcon(R.mipmap.ic_launcher)
            dlg.setPositiveButton("확인", null)
            dlg.setNegativeButton("취소", null)
            dlg.show()
        }
    }
}
