package com.ubis.androidbasic01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val Mycotent = intent.getStringExtra("content")
        //val Mycotent2 = intent.getIntExtra("name", 0)
        viewcontText.text = Mycotent
    }
}
