package aca.dongyang.project6_1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    /* 예제6-5 Kotlin 코드1 */
    var selectYear : Int = 0
    var selectMonth : Int = 0
    var selectDayOfMonth : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /* 예제6-6 Kotlin 코드2 */
        title = "시간 예약"

        timePicker1.visibility = View.INVISIBLE
        calenderView1.visibility = View.INVISIBLE

        /* 예제6-7 Kotlin 코드3 */
        rdoCal.setOnClickListener {
            timePicker1.visibility = View.INVISIBLE
            calenderView1.visibility = View.VISIBLE
        }

        rdoTime.setOnClickListener {
            timePicker1.visibility = View.VISIBLE
            calenderView1.visibility = View.INVISIBLE
        }

        /* 예제6-8 Kotlin 코드4 */
        btnStart.setOnClickListener {
            chronometer1.base = SystemClock.elapsedRealtime()
            chronometer1.start()
            chronometer1.setTextColor(Color.RED)
        }

        btnEnd.setOnClickListener {
            chronometer1.stop()
            chronometer1.setTextColor(Color.BLUE)

            /* 예제6-9 Kotlin 코드5 */
            textView1.text =  "" + selectYear + "년" + selectMonth + "월" + selectDayOfMonth + "일" + timePicker1.currentHour + "시" + timePicker1.currentMinute + "분"
        }

        calenderView1.setOnDateChangeListener { calendarView, i, i2, i3 ->
            selectYear = i
            selectMonth = i2 + 1
            selectDayOfMonth = i3
        }
    }
}
