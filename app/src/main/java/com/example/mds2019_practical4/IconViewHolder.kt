package com.example.mds2019_practical4

import android.support.v7.widget.RecyclerView
import android.view.View

class IconViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
    fun bind(color: Int) {
        itemView.setBackgroundColor(color)
    }
}