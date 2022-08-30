package com.ngt.red.screens.style

import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.View

import com.ngt.red.R
import com.ngt.red.models.Background
import com.sup.dev.android.views.cards.Card
import com.sup.dev.android.views.support.adapters.recycler_view.RecyclerCardAdapter

class PageBackgrounds : Card(R.layout.screen_styles_page_backgrounds) {

    private val myAdapter: RecyclerCardAdapter

    init {
        myAdapter = RecyclerCardAdapter()
        myAdapter.add(CardBackground(Background(R.drawable.b_bg_0, R.drawable.bs_bg_0)))
        myAdapter.add(CardBackground(Background(R.drawable.b_bg_1, R.drawable.bs_bg_1)))
        myAdapter.add(CardBackground(Background(R.drawable.b_bg_2, R.drawable.bs_bg_2)))
        myAdapter.add(CardBackground(Background(R.drawable.b_bg_3, R.drawable.bs_bg_3)))
        myAdapter.add(CardBackground(Background(R.drawable.b_bg_4, R.drawable.bs_bg_4)))
        myAdapter.add(CardBackground(Background(R.drawable.b_bg_5, R.drawable.bs_bg_5)))
        myAdapter.add(CardBackground(Background(R.drawable.b_bg_6, R.drawable.bs_bg_6)))
        myAdapter.add(CardBackground(Background(R.drawable.b_bg_7, R.drawable.bs_bg_7)))
        myAdapter.add(CardBackground(Background(R.drawable.b_bg_8, R.drawable.bs_bg_8)))
    }

    override fun bindView(view: View) {
        super.bindView(view)
        val vRecycler = view.findViewById<androidx.recyclerview.widget.RecyclerView>(R.id.vRecycler)
        vRecycler.layoutManager = androidx.recyclerview.widget.GridLayoutManager(view.context, 3)


        vRecycler.adapter = myAdapter
    }
}
