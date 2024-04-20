package com.example.kotlinfirebase.AuthModule.Register

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kotlinfirebase.AuthModule.Register.uiFunction.uiFunction
import com.example.kotlinfirebase.R

class RegisterActivity : AppCompatActivity() {
    lateinit var logo: ImageView
    lateinit var login: AppCompatButton
    lateinit var signUp: AppCompatButton

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)
        findID()
        uiFunction.setUpLogo(this@RegisterActivity, logo)
        uiFunction.login(this@RegisterActivity, login)
        uiFunction.signUp(this@RegisterActivity, signUp)
    }

    private fun findID() {
        logo = findViewById(R.id.rlogo)
        login = findViewById(R.id.rlogin)
        signUp = findViewById(R.id.rSignup)
    }
}