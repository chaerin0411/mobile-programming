package aca.dongyang.ex7_6

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.SubMenu
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

        menu!!.add(0, 1, 0, "배경색 (빨강)")
        menu!!.add(0, 2, 0, "배경색 (초록)")
        menu!!.add(0, 3, 0, "배경색 (파랑)")

        var sMenu : SubMenu = menu.addSubMenu("버튼 변경 >>")
        sMenu.add(0, 4, 0, "버튼 45도 회전")
        sMenu.add(0, 5, 0, "버튼 2배 확대")

        return true
    }

    /* 예제7-5 Kotlin 코드3 */
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            1 -> {
                baseLayout.setBackgroundColor(Color.RED)
                return true
            }
            2 -> {
                baseLayout.setBackgroundColor(Color.GREEN)
                return true
            }
            3 -> {
                baseLayout.setBackgroundColor(Color.BLUE)
                return true
            }
            4 -> {
                button1.rotation = 45f
                return true
            }
            5 -> {
                button1.scaleX = 2f
                return true
            }
        }

        return true
    }
}