package com.example.mds2019_practical4

import android.animation.ArgbEvaluator
import android.content.Context
import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class IconsAdapter(
    context: Context
) : RecyclerView.Adapter<IconViewHolder>() {

    private val colorPrimary = ContextCompat.getColor(context, R.color.colorPrimary)
    private val colorAccent = ContextCompat.getColor(context, R.color.colorAccent)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IconViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_icon, parent, false)
        return IconViewHolder(view)
    }

    override fun getItemCount(): Int = 40

    override fun onBindViewHolder(holder: IconViewHolder, position: Int) {
        val color = ArgbEvaluator().evaluate(position.toFloat() / itemCount, colorPrimary, colorAccent) as Int
        holder.bind(color)
    }
}