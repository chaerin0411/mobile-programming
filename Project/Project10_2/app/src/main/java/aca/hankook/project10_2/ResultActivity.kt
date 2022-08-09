package aca.hankook.project10_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.result)

        /* 예제10-14 ResultActivity.kt 코드 1 */
        title = "투표 결과"

        var intent1 = this.getIntent()
        var voteResult = intent1.getIntArrayExtra("VoteCount")
        var imageName = intent1.getStringArrayExtra("ImageName")

        /* 예제10-15 ResultActivity.kt 코드 2 */
        var tv = arrayOf(tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9)
        var rbar = arrayOf(rbar1, rbar2, rbar3, rbar4, rbar5, rbar6, rbar7, rbar8, rbar9)

        for(i in voteResult!!.indices) {
            tv[i].setText(imageName!![i])
            rbar[i].rating = voteResult[i].toFloat()
        }

        btnReturn.setOnClickListener {
            this.finish()
        }
    }
}
