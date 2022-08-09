package aca.hankook.ex11_16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* 01 스피너
        예제11-17 스피너 기본 예제의 Kotlin 코드 */
        title = "스피너 테스트"

        var movie = arrayOf("쿵푸팬더", "짱구는 못말려","아저씨",
                "아바타", "대부", "국가대표", "토이스토리3",
                "마당을 나온 암탉", "죽은 시인의 사회", "서유기")

        var sAdapter1 : ArrayAdapter<String>
        sAdapter1 = ArrayAdapter(this, android.R.layout.simple_spinner_item, movie)
        spinner1.adapter = sAdapter1

        spinner1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {
                Toast.makeText(this@MainActivity, "아무것도 선택하지 않았습니다, 선택하세요...", Toast.LENGTH_LONG).show()
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@MainActivity, movie[position], Toast.LENGTH_LONG).show()
            }

        }
    }
}
