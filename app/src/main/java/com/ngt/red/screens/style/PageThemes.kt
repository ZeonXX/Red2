package com.ngt.red.screens.style

import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.View

import com.ngt.red.R
import com.ngt.red.models.Theme
import com.sup.dev.android.views.cards.Card
import com.sup.dev.android.views.support.adapters.recycler_view.RecyclerCardAdapter

class PageThemes : Card(R.layout.screen_styles_page_themes) {

    private val myAdapter: RecyclerCardAdapter

    init {
        myAdapter = RecyclerCardAdapter()
    }

    override fun bindView(view: View) {
        super.bindView(view)
        val vRecycler = view.findViewById<androidx.recyclerview.widget.RecyclerView>(R.id.vRecycler)
        vRecycler.layoutManager = androidx.recyclerview.widget.GridLayoutManager(view.context, 3)

        vRecycler.adapter = myAdapter

        myAdapter.add(CardTheme(Theme(R.style.AppTheme_Theme_red, R.color.red_700, R.color.red_500)))
        myAdapter.add(CardTheme(Theme(R.style.AppTheme_Theme_pink, R.color.pink_700, R.color.pink_500)))
        myAdapter.add(CardTheme(Theme(R.style.AppTheme_Theme_purple, R.color.purple_700, R.color.purple_500)))
        myAdapter.add(CardTheme(Theme(R.style.AppTheme_Theme_deep_purple, R.color.deep_purple_700, R.color.deep_purple_500)))
        myAdapter.add(CardTheme(Theme(R.style.AppTheme_Theme_indigo, R.color.indigo_700, R.color.indigo_500)))
        myAdapter.add(CardTheme(Theme(R.style.AppTheme_Theme_blue, R.color.blue_700, R.color.blue_500)))
        myAdapter.add(CardTheme(Theme(R.style.AppTheme_Theme_light_blue, R.color.light_blue_700, R.color.light_blue_500)))
        myAdapter.add(CardTheme(Theme(R.style.AppTheme_Theme_cyan, R.color.cyan_700, R.color.cyan_500)))
        myAdapter.add(CardTheme(Theme(R.style.AppTheme_Theme_teal, R.color.teal_700, R.color.teal_500)))
        myAdapter.add(CardTheme(Theme(R.style.AppTheme_Theme_green, R.color.green_700, R.color.green_500)))
        myAdapter.add(CardTheme(Theme(R.style.AppTheme_Theme_light_green, R.color.light_green_700, R.color.light_green_500)))
        myAdapter.add(CardTheme(Theme(R.style.AppTheme_Theme_lime, R.color.lime_700, R.color.lime_500)))
        myAdapter.add(CardTheme(Theme(R.style.AppTheme_Theme_yellow, R.color.yellow_700, R.color.yellow_500)))
        myAdapter.add(CardTheme(Theme(R.style.AppTheme_Theme_amber, R.color.amber_700, R.color.amber_500)))
        myAdapter.add(CardTheme(Theme(R.style.AppTheme_Theme_orange, R.color.orange_700, R.color.orange_500)))
        myAdapter.add(CardTheme(Theme(R.style.AppTheme_Theme_deep_orange, R.color.deep_orange_700, R.color.deep_orange_500)))
        myAdapter.add(CardTheme(Theme(R.style.AppTheme_Theme_brown, R.color.brown_700, R.color.brown_500)))
        myAdapter.add(CardTheme(Theme(R.style.AppTheme_Theme_grey, R.color.grey_700, R.color.grey_500)))
        myAdapter.add(CardTheme(Theme(R.style.AppTheme_Theme_blue_grey, R.color.blue_grey_700, R.color.blue_grey_500)))
    }
}
