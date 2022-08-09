/* 03 버튼과 에디트텍스트
    예제4-20 Kotlin 코드 */
package aca.dongyang.project4_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var num1 : String
    lateinit var num2 : String
    var result : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // setTouchListener
        BtnAdd.setOnTouchListener { view, motionEvent ->
            num1 = Edit1.text.toString()
            num2 = Edit2.text.toString()
            result = Integer.parseInt(num1) + Integer.parseInt(num2)
            TextResult.text = "계산 결과 : " + result
            false
        }
        BtnSub.setOnTouchListener { view, motionEvent ->
            num1 = Edit1.text.toString()
            num2 = Edit2.text.toString()
            result = Integer.parseInt(num1) - Integer.parseInt(num2)
            TextResult.text = "계산 결과 : " + result
            false
        }
        BtnMul.setOnTouchListener { view, motionEvent ->
            num1 = Edit1.text.toString()
            num2 = Edit2.text.toString()
            result = Integer.parseInt(num1) * Integer.parseInt(num2)
            TextResult.text = "계산 결과 : " + result
            false
        }
        BtnDiv.setOnTouchListener { view, motionEvent ->
            num1 = Edit1.text.toString()
            num2 = Edit2.text.toString()
            result = Integer.parseInt(num1) / Integer.parseInt(num2)
            TextResult.text = "계산 결과 : " + result
            false
        }

        // setClickListener
        BtnAdd.setOnClickListener {
            num1 = Edit1.text.toString()
            num2 = Edit2.text.toString()
            result = Integer.parseInt(num1) + num2.toInt()
            TextResult.text = "계산 결과 : " + result
        }
        BtnSub.setOnClickListener {
            num1 = Edit1.text.toString()
            num2 = Edit2.text.toString()
            result = Integer.parseInt(num1) - num2.toInt()
            TextResult.text = "계산 결과 : " + result
        }
        BtnMul.setOnClickListener {
            num1 = Edit1.text.toString()
            num2 = Edit2.text.toString()
            result = Integer.parseInt(num1) * num2.toInt()
            TextResult.text = "계산 결과 : " + result
        }
        BtnDiv.setOnClickListener {
            num1 = Edit1.text.toString()
            num2 = Edit2.text.toString()
            result = Integer.parseInt(num1) / num2.toInt()
            TextResult.text = "계산 결과 : " + result
        }
    }
}
