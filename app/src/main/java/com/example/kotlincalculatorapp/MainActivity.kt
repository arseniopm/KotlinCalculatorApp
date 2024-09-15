package com.example.kotlincalculatorapp

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun numberAction(view: View){}

    fun operationAction(view: View){}


    fun allClearAction(view: View)
    {
        workingsTV.text =""
    }


    fun backSpaceAction(view: View){}

    fun equalsAction(view: View) {}
}