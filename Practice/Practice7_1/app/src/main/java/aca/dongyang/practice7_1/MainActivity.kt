package aca.dongyang.practice7_1

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
        title = "제주도"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        var mInflater = menuInflater
        mInflater.inflate(R.menu.menu1, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.imgRotate -> {
                var arg = editText.text.toString()
                imageView.rotation = Integer.parseInt(arg).toFloat()
                return true
            }
            R.id.item1 -> {
                imageView.setImageResource(R.drawable.item1)
                Toast.makeText(this, "한라산 선택", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.item2 -> {
                imageView.setImageResource(R.drawable.item2)
                Toast.makeText(this, "추자도 선택", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.item3 -> {
                imageView.setImageResource(R.drawable.item3)
                Toast.makeText(this, "범섬 선택", Toast.LENGTH_LONG).show()
                return true
            }
        }

        return true
    }
}