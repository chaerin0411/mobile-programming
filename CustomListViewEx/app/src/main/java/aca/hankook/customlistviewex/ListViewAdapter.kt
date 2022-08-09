package aca.hankook.customlistviewex

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.rowitem.view.*

class ListViewAdapter(var studentList : ArrayList<StudentC>) : BaseAdapter() {
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var rowItemView = p1

        if(rowItemView == null) {
            rowItemView = View.inflate(p2?.context, R.layout.rowitem, null)
        }

        val student : StudentC = studentList[p0]
        var sajinResid:Int = p2!!.resources.getIdentifier("aca.hankook.customlistviewex:" + "drawable/" + student.sajin, null, null)
        rowItemView!!.itemImage.setImageResource(sajinResid)
        rowItemView.itemName.text = student.name
        rowItemView.itemDept.text = student.dept
        rowItemView.itemId.text = student.id.toString()

        return rowItemView
    }

    override fun getItem(p0: Int): Any {
        return studentList[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return studentList.size
    }

}