package aca.hankook.final20202296

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.rowitem.view.*

class ListViewAdapter(var movieList: ArrayList<MovieC>) : BaseAdapter() {
    override fun getView(position: Int, view: View?, parent: ViewGroup?): View {
        var rowItemView : View? = view
        if(rowItemView == null) {
            rowItemView = View.inflate(parent?.context, R.layout.rowitem, null)
        }
        val movie1 : MovieC = movieList[position]
        var sajinResid : Int = parent!!.resources.getIdentifier("aca.hankook.final20202296:" + "drawable/" + "s" + movie1.movieId.toString(),
            null, null)
        rowItemView!!.itemImage.setImageResource(sajinResid)
        rowItemView.itemRank.text = "순위 " + movie1.movieRank
        rowItemView.itemName.text = "영화제목 " + movie1.movieNm
        rowItemView.itemGrade.text = "등급 " + movie1.movieGrade
        rowItemView.itemTime.text = "러닝타임 " + movie1.movieTime
        rowItemView.itemRatings.text = "평점 " + movie1.movieRatings

        return rowItemView
    }

    override fun getItem(p0: Int): Any {
        return movieList[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return movieList.size
    }
}