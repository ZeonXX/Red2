package com.ngt.red.screens.categories

import android.view.View
import android.widget.ImageView
import android.widget.TextView

import com.ngt.red.R
import com.sup.dev.android.tools.ToolsIntent
import com.sup.dev.android.views.cards.Card
import com.sup.dev.android.views.splash.SplashAlert

class CardAd(
        val title:String,
        val imageId:Int,
        val targetId:String,
        val subtitle:String? = null
) : Card(R.layout.screen_categories_card_ad) {

    override fun bindView(view: View) {
        super.bindView(view)
        val vImage:ImageView = view.findViewById(R.id.vImage)
        val vTitle:TextView = view.findViewById(R.id.vTitle)
        val vSubtitle:TextView = view.findViewById(R.id.vSubtitle)
        val vTouch:View = view.findViewById(R.id.vTouch)

        vImage.setImageResource(imageId)
        vTitle.text = title

        if(subtitle != null){
            vSubtitle.text = subtitle
            vSubtitle.visibility = View.VISIBLE
        }else{
            vSubtitle.visibility = View.GONE
        }

        vTouch.setOnClickListener {
            SplashAlert()
                    .setText(R.string.ad_alert)
                    .setOnCancel(R.string.app_cancel)
                    .setOnEnter(R.string.app_open) { w -> ToolsIntent.openLink("https://play.google.com/store/apps/details?id=$targetId") }
                    .asDialogShow()
        }
    }

}
