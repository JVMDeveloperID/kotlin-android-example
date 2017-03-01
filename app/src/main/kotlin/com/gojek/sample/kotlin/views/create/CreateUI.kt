package com.gojek.sample.kotlin.views.create

import android.annotation.SuppressLint
import android.support.v4.content.ContextCompat
import com.gojek.sample.kotlin.R
import org.jetbrains.anko.*
import org.jetbrains.anko.appcompat.v7.toolbar
import org.jetbrains.anko.design.appBarLayout

class CreateUI : AnkoComponent<CreateActivity> {

    @SuppressLint("NewApi")
    override fun createView(ui: AnkoContext<CreateActivity>) = with(ui) {
        relativeLayout {
            id = R.id.content_create
            backgroundColor = ContextCompat.getColor(ctx, R.color.colorPrimary)

            appBarLayout {
                id = R.id.abl_create
                backgroundColor = ContextCompat.getColor(ctx, R.color.colorAccent)
                elevation = dip(4).toFloat()

                toolbar {
                    id = R.id.tb_create
                    setTitleTextColor(ContextCompat.getColor(ctx, R.color.colorPrimary))
                }.lparams {
                    width = matchParent
                    height = wrapContent
                }
            }.lparams {
                width = matchParent
                height = wrapContent
            }
        }
    }
}