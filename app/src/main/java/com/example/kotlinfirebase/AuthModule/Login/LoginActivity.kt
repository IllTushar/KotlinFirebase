package com.example.kotlinfirebase.AuthModule.Login

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.example.kotlinfirebase.AuthModule.Login.uiFunction.uiFunction
import com.example.kotlinfirebase.R

class LoginActivity : AppCompatActivity() {
    lateinit var logo: ImageView
    lateinit var signUp: AppCompatButton
    lateinit var login: AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        findIds()
        uiFunction.setUpLogoFunction(this@LoginActivity, logo)
        uiFunction.login(this@LoginActivity, login)
        uiFunction.signUp(this@LoginActivity, signUp)
    }

    fun findIds() {
        logo = findViewById(R.id.logo)
        signUp = findViewById(R.id.SignUp)
        login = findViewById(R.id.login)
    }
}