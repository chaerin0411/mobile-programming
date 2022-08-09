package aca.hankook.practice10_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* 예제10-11 MainActivity.kt 코드 1 */
        title = "명화 선호도 투표"

        var voteCount = IntArray(9)
        for(i in 0..8)
            voteCount[i] = 0

        var imageId = arrayOf(iv1, iv2, iv3, iv4, iv5, iv6, iv7, iv8, iv9)
        var imageName  = arrayOf("독서하는 소녀", "꽃장식 모자 소녀", "부채를 든 소녀",
            "이레느깡 단 베르양", "잠자는 소녀", "테라스의 두 자매", "피아노 레슨", "피아노 앞의 소녀들", "해변에서")

        /* 예제10-12 MainActivity.kt 코드 2 */
        for(i in imageId.indices) {
            imageId[i]!!.setOnClickListener {
                voteCount[i]++
                Toast.makeText(applicationContext, imageName[i] + " 총 " + voteCount[i] + "표", Toast.LENGTH_LONG).show()
            }
        }

        /* 예제10-13 MainActivity.kt 코드 3 */
        btn1.setOnClickListener {
            var intent1 = Intent(applicationContext, ResultActivity::class.java)
            // data 보내기
            intent1.putExtra("VoteCount", voteCount)
            intent1.putExtra("ImageName", imageName)
            this.startActivity(intent1)
        }
    }
}

