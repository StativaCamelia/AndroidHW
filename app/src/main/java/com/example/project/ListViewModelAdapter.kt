package com.example.project

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class ListViewModelAdapter(
    val context: Context,
    private val listModelArrayList: ArrayList<ListViewModel>
) : BaseAdapter() {

    override fun getCount(): Int {
       return listModelArrayList.size
    }

    override fun getItem(position: Int): Any {
        return listModelArrayList[position]
    }

    override fun getItemId(position: Int): Long {
        return listModelArrayList[position].id?.toLong()!!
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {

        val view: View?
        val vh: ViewHolder

        if (convertView == null) {
            val layoutInflater = LayoutInflater.from(context)
            view = layoutInflater.inflate(R.layout.activity_list_item, parent, false)
            vh = ViewHolder(view)
            view.tag = vh
        } else {
            view = convertView
            vh = view.tag as ViewHolder
        }

        vh.tvTitle.text = listModelArrayList[position].title
        listModelArrayList[position].image?.let { vh.tvImage.setImageResource(it) }
        return view
    }

}

private class ViewHolder(view: View?) {
    val tvTitle: TextView = view?.findViewById(R.id.title_list) as TextView
    val tvImage: ImageView = view?.findViewById(R.id.image_list) as ImageView
}