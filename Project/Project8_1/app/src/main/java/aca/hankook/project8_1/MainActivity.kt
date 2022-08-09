package aca.hankook.project8_1

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.IOException
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /* 예제8-4 Kotlin 코드 1 */
        this.title = "간단 일기장"

        /* 예제8-5 Kotlin 코드 2 */
        var cal = Calendar.getInstance()
        var cYear = cal.get(Calendar.YEAR)
        var cMonth = cal.get(Calendar.MONTH)
        var cDay = cal.get(Calendar.DAY_OF_MONTH)
        var fileName : String = ""

        datePicker1.init(cYear, cMonth, cDay, DatePicker.OnDateChangedListener { datePicker, i, i2, i3 ->
            fileName = "" + (Integer.toString(i) + "_"
                    + Integer.toString(i2 + 1) + "_"
                    + Integer.toString(i3)) + ".txt"
            var str = readDiary(fileName)
            edtDiary.setText(str)
            btnWrite.isEnabled = true
        })

        /* 예제8-7 Kotlin 코드 4 */
        btnWrite.setOnClickListener {
            var outFs : FileOutputStream = openFileOutput(fileName, Context.MODE_PRIVATE)
            var str : String = edtDiary.text.toString()
            outFs.write(str.toByteArray())
            outFs.close()
            Toast.makeText(applicationContext, "$fileName 이 저장됨", Toast.LENGTH_LONG).show()
        }
    }

    /* 예제8-6 Kotlin 코드 3 */
     fun readDiary(fileName: String): String? {
        var diaryStr : String? = null
         try {
             var inFs : FileInputStream = openFileInput(fileName)
             var txt = ByteArray(500)
             inFs.read(txt)
             inFs.close()
             diaryStr = txt.toString(Charsets.UTF_8).trim()
             btnWrite.text = "수정하기"
         } catch (e : IOException) {
             edtDiary.hint = "일기 없음"
             btnWrite.text = "새로 지정"
         }
         return diaryStr
    }
}
