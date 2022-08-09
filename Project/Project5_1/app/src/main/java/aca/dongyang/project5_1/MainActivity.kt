/* 03 Kotlin 코드로 화면 만들기
    실습5-1 XML 없이 화면 코딩하기
     버튼을 클릭하면 토스트 메시지가 출력되는 화면을 Kotlin만으로 코딩하기 */
/* 예제5-8 리니어레이아웃을 생성하는 Kotlin 코드 */
package aca.dongyang.project5_1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)

        val params = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.MATCH_PARENT)

        val baseLayout = LinearLayout(this)
        baseLayout.orientation = LinearLayout.VERTICAL
        baseLayout.setBackgroundColor(Color.rgb(0, 255, 0))
        setContentView(baseLayout, params)

        /* 예제5-9 버튼을 생성하는 Kotlin 코드 */
        var btn = Button(this)
        btn.text = "버튼입니다."
        btn.setBackgroundColor(Color.MAGENTA)
        baseLayout.addView(btn)

        btn.setOnClickListener {
            Toast.makeText(applicationContext,
                "코드로 생성한 버튼입니다", Toast.LENGTH_SHORT).show()
        }
    }
}
