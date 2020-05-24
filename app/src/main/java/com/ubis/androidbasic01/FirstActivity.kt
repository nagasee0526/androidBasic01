package com.ubis.androidbasic01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first.*
import kotlinx.android.synthetic.main.activity_main.*

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        goBackBtn.setOnClickListener {
//  액티비티 하나더 얹어 주는것
//            val myIntent = Intent(this, MainActivity::class.java)
//            startActivity(myIntent)
            finish() // 현재 액티비티 종료

        }
    }
}
