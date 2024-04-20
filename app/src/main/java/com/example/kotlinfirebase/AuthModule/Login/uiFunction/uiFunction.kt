package com.example.kotlinfirebase.AuthModule.Login.uiFunction

import android.content.Context
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatButton
import com.bumptech.glide.Glide
import com.example.kotlinfirebase.Assets.Utils
import com.example.kotlinfirebase.AuthModule.Register.RegisterActivity
import com.example.kotlinfirebase.Dashboard.DashBoardActivity
import com.example.kotlinfirebase.R

object uiFunction {

    fun setUpLogoFunction(context: Context, logo: ImageView) {
        Glide.with(context)
            .asGif()
            .load(R.raw.firebase_logo)
            .into(logo)
    }

    fun login(context: Context, login: AppCompatButton) {
        login.setOnClickListener {
            Utils.intent(context, DashBoardActivity::class.java)
        }
    }

    fun signUp(context: Context, signUp: AppCompatButton) {
        signUp.setOnClickListener {
            Utils.intent(context, RegisterActivity::class.java)
        }
    }
}