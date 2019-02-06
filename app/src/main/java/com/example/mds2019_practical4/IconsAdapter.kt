package com.example.mds2019_practical4

import android.graphics.Color
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import java.util.*

class IconsAdapter: RecyclerView.Adapter<IconViewHolder>() {
    private val random = Random()
    private val colorMap = mutableMapOf<Int, Int>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IconViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_icon_view, parent, false)
        return IconViewHolder(view)
    }

    override fun getItemCount(): Int = 100

    override fun onBindViewHolder(holder: IconViewHolder, position: Int) {
        holder.bind(getColor(position))
    }

    private fun getColor(position: Int): Int {
        var color = colorMap[position]

        if(color == null) {
            color = Color.rgb(
                random.nextInt(256),
                random.nextInt(256),
                random.nextInt(256)
            )
            colorMap[position] = color
        }

        return color
    }

}