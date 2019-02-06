package com.example.mds2019_practical4

import android.graphics.Rect
import android.support.v7.widget.RecyclerView
import android.view.View

class CustomDecoration(
    private val offset: Int
): RecyclerView.ItemDecoration() {
    override fun getItemOffsets(outRect: Rect?, view: View?, parent: RecyclerView?, state: RecyclerView.State?) {
        super.getItemOffsets(outRect, view, parent, state)

        outRect?.set(offset, offset, offset, offset)
    }
}