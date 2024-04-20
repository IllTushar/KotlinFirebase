package com.example.kotlinfirebase.AuthModule.Login

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.example.kotlinfirebase.AuthModule.Login.uiFunction.uiFunction
import com.example.kotlinfirebase.R

class LoginActivity : AppCompatActivity() {
    lateinit var logo: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        findIds()
        uiFunction.setUpLogoFunction(this@LoginActivity, logo)
    }

    fun findIds() {
        logo = findViewById(R.id.logo)
    }
}