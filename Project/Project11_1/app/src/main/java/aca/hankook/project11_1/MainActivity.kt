package aca.hankook.project11_1

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.dialog.*
import kotlinx.android.synthetic.main.dialog.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* 03 그리드뷰
        예제11-8 메인 액티비티의 Kotlin 코드 1 */
        title = "그리드뷰 영화 포스터"

        var gAdapter = MyGridAdapter(this)
        gridView1.adapter = gAdapter
    }

    inner class MyGridAdapter(var context: Context) : BaseAdapter() {
        /* 03 그리드뷰
        예제11-9 메인 액티비티의 Kotlin 코드 2 */
        var posterID = arrayOf(
            R.drawable.mov01, R.drawable.mov02, R.drawable.mov03, R.drawable.mov04,
            R.drawable.mov05, R.drawable.mov06, R.drawable.mov07, R.drawable.mov08,
            R.drawable.mov09, R.drawable.mov10,
            R.drawable.mov01, R.drawable.mov02, R.drawable.mov03, R.drawable.mov04,
            R.drawable.mov05, R.drawable.mov06, R.drawable.mov07, R.drawable.mov08,
            R.drawable.mov09, R.drawable.mov10,
            R.drawable.mov01, R.drawable.mov02, R.drawable.mov03, R.drawable.mov04,
            R.drawable.mov05, R.drawable.mov06, R.drawable.mov07, R.drawable.mov08,
            R.drawable.mov09, R.drawable.mov10
        )

        var posterTitle = arrayOf("써니", "완득이", "괴물", "라디오스타", "비열한거리", "왕의남자", "아일랜드", "웰컴투동막골", "헬보이", "빽투더퓨처")

        /* 03 그리드뷰
        예제11-10 메인 액티비티의 Kotlin 코드 3 */
        override fun getView(p0: Int, p1: View?, p2: ViewGroup?) : View {
            var imageView1 = ImageView(context)
            imageView1.layoutParams = ViewGroup.LayoutParams(200, 300)
            imageView1.scaleType = ImageView.ScaleType.FIT_CENTER
            imageView1.setPadding(5, 5, 5, 5)

            imageView1.setImageResource(posterID[p0])

            /* 03 그리드뷰
            예제11-11 메인 액티비티의 Kotlin 코드 4 */
            imageView1.setOnClickListener {
                var dialogView1 = View.inflate(this@MainActivity, R.layout.dialog, null)
                var dlg = AlertDialog.Builder(this@MainActivity)
                // 대화상자를 클릭했을 때 보여주는 그림
                dialogView1.ivPoster.setImageResource(posterID[p0])
                dlg.setTitle(posterTitle[p0])
                dlg.setIcon(R.drawable.ic_launcher_foreground)
                dlg.setView(dialogView1)
                dlg.setNegativeButton("닫기", null)
                dlg.show()
            }

            return imageView1
        }

        override fun getItem(p0: Int): Any {
            return 0
        }

        override fun getItemId(p0: Int): Long {
            return 0
        }

        override fun getCount(): Int {
            return posterID.size
        }
    }
}
