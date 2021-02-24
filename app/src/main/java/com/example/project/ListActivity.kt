package com.example.project

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView

class ListActivity: Activity(){
    private lateinit var listView: ListView
    private lateinit var listViewAdapter: ListViewModelAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        listView = findViewById(R.id.list_layout)
        listViewAdapter = ListViewModelAdapter(this, ListData.getListViewModelList())
        listView.adapter = listViewAdapter
        listView.onItemClickListener =
            AdapterView.OnItemClickListener { _, view, position, id ->
                onClickItem(position)
            }
    }

    private fun onClickItem(position: Int) {
        val i = Intent(this, InformationsDetails::class.java).putExtra("position", position);
        startActivity(i)
    }

}