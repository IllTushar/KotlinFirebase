package com.example.kotlinfirebase.AuthModule.Register.uiFunction

import android.content.Context
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatButton
import com.bumptech.glide.Glide
import com.example.kotlinfirebase.Assets.Utils
import com.example.kotlinfirebase.AuthModule.Login.LoginActivity
import com.example.kotlinfirebase.Dashboard.DashBoardActivity
import com.example.kotlinfirebase.R

object uiFunction {
    fun setUpLogo(context: Context, imageView: ImageView) {
        Glide.with(context)
            .asGif()
            .load(R.raw.firebase_logo)
            .into(imageView)
    }

    fun login(context: Context, login: AppCompatButton) {
        login.setOnClickListener {
            Utils.intent(context, LoginActivity::class.java)
        }
    }

    fun signUp(context: Context, signUp: AppCompatButton) {
        signUp.setOnClickListener {
            Utils.intent(context, DashBoardActivity::class.java)
        }
    }
}