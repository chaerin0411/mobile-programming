package aca.hankook.ex11_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* 02 리스트뷰
        예제11-2 리스트뷰 기본 예제의 Kotlin 코드 */
        title = "리스트뷰 테스트"

        var mid = arrayOf("히어로즈", "24시", "로스트", "로스트룸", "스몰빌", "탐정몽크", "빅뱅이론", "프렌즈", "덱스터", "클리", "가쉽걸", "테이큰", "슈퍼내추럴", "브이")

        var adapter1 : ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_list_item_1, mid)
        listView1.adapter = adapter1
        listView1.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(applicationContext, mid[i], Toast.LENGTH_LONG).show()
        }
    }
}
