/* 02 이미지뷰와 이미지버튼
   예제4-30 Kotlin 코드 2 */
package aca.dongyang.project4_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    /* 예제4-30 Kotlin 코드 2 */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "애완동물 사진 보기"

        /* 예제4-31 Kotlin 코드 3 */
        chkAgree.setOnCheckedChangeListener { compoundButton, b ->
            if (chkAgree.isChecked == true) {
                text2.visibility = android.view.View.VISIBLE
                rGroup1.visibility = android.view.View.VISIBLE
                btnOk.visibility = android.view.View.VISIBLE
                imgPet.visibility = android.view.View.VISIBLE
            } else {
                text2.visibility = android.view.View.INVISIBLE
                rGroup1.visibility = android.view.View.INVISIBLE
                btnOk.visibility = android.view.View.INVISIBLE
                imgPet.visibility = android.view.View.INVISIBLE
            }
        }

        /* 예제4-32 Kotlin 코드 4 */
        // 선택 완료 버튼을 클릭하면
        btnOk.setOnClickListener {
            when(rGroup1.checkedRadioButtonId) {
                R.id.rdoDog -> imgPet.setImageResource(R.drawable.dog)
                R.id.rdoCat -> imgPet.setImageResource(R.drawable.cat)
                R.id.rdoRabbit -> imgPet.setImageResource(R.drawable.rabbit)
                else -> makeText(applicationContext, "동물을 먼저 선택하세용", LENGTH_SHORT).show()
            }
        }
    }
}
