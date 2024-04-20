package com.example.kotlinfirebase.Assets

import android.content.Context
import android.util.Log
import android.widget.Toast

object Utils {
    fun toast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    fun log(tag: String, message: String) {
        Log.d(tag, message)
    }
}