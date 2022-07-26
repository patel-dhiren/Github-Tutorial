package com.app.constraintlayoutandroidkotlin

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    val layout:ConstraintLayout
    get() = findViewById(R.id.parent)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layout.setBackgroundColor(Color.parseColor("#FFBB86FC"))

    }
}