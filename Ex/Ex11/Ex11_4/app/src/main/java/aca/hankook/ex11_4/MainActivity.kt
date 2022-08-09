package aca.hankook.ex11_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* 02 리스트뷰
        예제11-5 동적인 리스트뷰 항목 추가, 삭제의 Kotlin 코드 */
        var midList = ArrayList<String>()

        var adapter1 = ArrayAdapter(this, android.R.layout.simple_list_item_1, midList)
        listView1.adapter = adapter1

        btnAdd.setOnClickListener {
            midList.add(editItem.text.toString())
            adapter1.notifyDataSetChanged()
        }

        listView1.setOnItemLongClickListener { adapterView, view, i, l ->
            midList.removeAt(i)
            adapter1.notifyDataSetChanged()
            false
        }
    }
}
