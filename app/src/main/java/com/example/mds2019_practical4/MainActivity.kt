package com.example.mds2019_practical4

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iconsRecyclerView.adapter = IconsAdapter(this)
        iconsRecyclerView.layoutManager = GridLayoutManager(this, 4)
        iconsRecyclerView.addItemDecoration(OffsetItemDecoration(this.resources.getDimensionPixelOffset(R.dimen.item_offset)))
    }
}
