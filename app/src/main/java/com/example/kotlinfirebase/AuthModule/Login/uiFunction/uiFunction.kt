package com.example.kotlinfirebase.AuthModule.Login.uiFunction

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.kotlinfirebase.R

object uiFunction {

    fun setUpLogoFunction(context: Context, logo: ImageView) {
        Glide.with(context)
            .asGif()
            .load(R.raw.firebase_logo)
            .into(logo)
    }
}