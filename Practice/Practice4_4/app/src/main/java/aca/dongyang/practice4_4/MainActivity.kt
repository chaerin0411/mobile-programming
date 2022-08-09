/* 02 이미지뷰와 이미지버튼
   직접풀어보기4-4 안드로이드 버전 사진 보기 앱 만들기 */
package aca.dongyang.practice4_4

import aca.dongyang.practice4_4.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "안드로이드 사진 보기"

        chkAgree.setOnCheckedChangeListener { compoundButton, b ->
            if (chkAgree.isChecked == true) {
                text2.visibility = android.view.View.VISIBLE
                rGroup1.visibility = android.view.View.VISIBLE
                btnExit.visibility = android.view.View.VISIBLE
                btnReset.visibility = android.view.View.VISIBLE
                imgPet.visibility = android.view.View.VISIBLE
            } else {
                text2.visibility = android.view.View.INVISIBLE
                rGroup1.visibility = android.view.View.INVISIBLE
                btnExit.visibility = android.view.View.INVISIBLE
                btnReset.visibility = android.view.View.INVISIBLE
                imgPet.visibility = android.view.View.INVISIBLE
            }
        }

        // 라디오 버튼을   선택하면
        rGroup1.setOnCheckedChangeListener { radioGroup, i ->
            when(rGroup1.checkedRadioButtonId) {
                R.id.rdoOreo -> imgPet.setImageResource(R.drawable.oreo)
                R.id.rdoPi -> imgPet.setImageResource(R.drawable.pi)
                R.id.rdoQ -> imgPet.setImageResource(R.drawable.q)
                else -> makeText(applicationContext, "안드로이드 버전을 먼저 선택하세용", LENGTH_SHORT).show()
            }
        }

        // 종료 버튼을 클릭하면
        btnExit.setOnClickListener {
            finish();
        }

        // 처음으로 버튼을 클릭하면
        btnReset.setOnClickListener {
            chkAgree.isChecked = false
        }
    }
}
