package aca.dongyang.project7_1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /* 예제7-3 Kotlin 코드1 */
        title = "배경색 바꾸기"
    }

    /* 예제7-4 Kotlin 코드2 */
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        var mInflater = menuInflater
        mInflater.inflate(R.menu.menu1, menu)
        return true
    }

    /* 예제7-5 Kotlin 코드3 */
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.itemRed -> {
                baseLayout.setBackgroundColor(Color.RED)
                Toast.makeText(this, "빨강색 선택", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.itemGreen -> {
                baseLayout.setBackgroundColor(Color.GREEN)
                Toast.makeText(this, "초록색 선택", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.itemBlue -> {
                baseLayout.setBackgroundColor(Color.BLUE)
                Toast.makeText(this, "파랑색 선택", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.subRotate -> {
                button1.rotation = 45f
                return true
            }
            R.id.subSize -> {
                button1.scaleX = 2f
                return true
            }
        }

        return true
    }
}