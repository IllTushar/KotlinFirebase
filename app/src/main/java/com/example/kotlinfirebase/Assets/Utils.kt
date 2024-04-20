package com.example.kotlinfirebase.Assets

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

object Utils {
    fun toast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    fun log(tag: String, message: String) {
        Log.d(tag, message)
    }

    /*
   In Kotlin, Class<*> represents a class of unknown type.
   The asterisk (*) is a wildcard that indicates that the class type is not specified.
   This is often used when you want to work with classes in a generic or flexible manner,
   without specifically specifying the type of class.
     */
    @SuppressLint("QueryPermissionsNeeded")
    fun intent(context: Context, targetClass: Class<*>) {
        val intent = Intent(context, targetClass)
        if (intent.resolveActivity(context.packageManager) != null) {
            context.startActivity(intent)
        } else {
            Log.e("funIntent", "Activity not found for class: ${targetClass.name}")
        }
    }
}