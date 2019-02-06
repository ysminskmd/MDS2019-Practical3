package com.example.mds2019_practical4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iconsRecyclerView.adapter = IconsAdapter()
        val layoutManager = GridLayoutManager(this, 2)
        layoutManager.spanCount = 5
        iconsRecyclerView.layoutManager = layoutManager
        val offset = resources.getDimensionPixelOffset(R.dimen.offset)
        iconsRecyclerView.addItemDecoration(CustomDecoration(offset))
    }
}
