package com.ubis.androidbasic01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_forth.*
import kotlinx.android.synthetic.main.activity_third.*

class ForthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forth)

        val GetPhonNum = intent.getStringExtra("phonnum")
        viewphonText.text = GetPhonNum
    }
}
