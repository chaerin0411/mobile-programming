package aca.hankook.practice10_2

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
        var tvArr = arrayOf(tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9)
        var rbarArr = arrayOf(rbar1, rbar2, rbar3, rbar4, rbar5, rbar6, rbar7, rbar8, rbar9)

        var max = 0
        var imageFileArr = arrayOf(R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4, R.drawable.pic5, R.drawable.pic6, R.drawable.pic7, R.drawable.pic8, R.drawable.pic9)

        for(i in voteResult!!.indices) {
            if(voteResult[max] < voteResult[i])
                max = i
        }
        textTop.text = imageName!![max]
        imageTop.setImageResource(imageFileArr[max])

        for(i in voteResult!!.indices) {
            tvArr[i].setText(imageName!![i])
            rbarArr[i].rating = voteResult[i].toFloat()
        }

        btnReturn.setOnClickListener {
            this.finish()
        }
    }
}
