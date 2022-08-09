package aca.dongyang.test6_1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var red = 0
    var green = 0
    var blue = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        red = redBar.progress
        green = greenBar.progress
        blue = blueBar.progress
        redText.text = "red 값 : " + red
        greenText.text = "green 값 : " + green
        blueText.text = "blue 값 : " + blue

        var seekBarInstance = NoNameSeekBar()
        redBar.setOnSeekBarChangeListener(seekBarInstance)

        greenBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                green = p1
                greenText.text = "green 값 : " + green
            }
            override fun onStartTrackingTouch(p0: SeekBar?) {
            }
            override fun onStopTrackingTouch(p0: SeekBar?) {
            }
        })

        blueBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                blue = p1
                blueText.text = "blue 값 : " + blue
            }
            override fun onStartTrackingTouch(p0: SeekBar?) {
            }
            override fun onStopTrackingTouch(p0: SeekBar?) {
            }
        })

        btnOk.setOnClickListener {
            dpView.setBackgroundColor(Color.rgb(red, green, blue))
            Toast.makeText(applicationContext, "버튼을 눌렀어요~~~~~~~~~~~~~~~`", Toast.LENGTH_LONG).show()
        }
    }

    // onCreat() End
    inner class NoNameSeekBar : SeekBar.OnSeekBarChangeListener {
        override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
            red = p1
            redText.text = "red 값 : " + red
        }
        override fun onStartTrackingTouch(p0: SeekBar?) {
        }
        override fun onStopTrackingTouch(p0: SeekBar?) {
        }
    }
}
