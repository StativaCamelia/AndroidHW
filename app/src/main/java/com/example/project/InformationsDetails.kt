package com.example.project

import android.app.Activity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class InformationsDetails: Activity() {
    private val list = ListData.getListViewModelList<ArrayList<ListViewModel>>()
    private var position: Int = 0
    private lateinit var title: TextView
    private lateinit var content: TextView
    private lateinit var image: ImageView

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.information_list)
        position = intent.extras?.get("position") as Int;
        initView()

    }

    fun initView() {
        image = findViewById(R.id.info_image)!!
        title = findViewById(R.id.info_text)
        content = findViewById(R.id.info_content)

        val imageResource = list[position].image
        val textResource = list[position].title
        val contentResource = list[position].content
        if (imageResource != null) {
            image.setImageResource(imageResource)
        }
        title.text = textResource
        content.text = contentResource
    }

}