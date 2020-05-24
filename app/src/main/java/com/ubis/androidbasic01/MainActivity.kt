package com.ubis.androidbasic01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goFirstAct.setOnClickListener {

            val myIntent = Intent(this, FirstActivity::class.java)
            startActivity(myIntent)
         //   finish()
        }

        goSecondAct.setOnClickListener {
            val myIntent = Intent(this, SecondActivity::class.java)
            startActivity(myIntent)
        }

        goThirdAct.setOnClickListener {
            val InputContent = ContentEdit.text.toString()

            val MyIntent = Intent(this, ThirdActivity::class.java)
            MyIntent.putExtra("content", InputContent)
         //   MyIntent.putExtra("numver", 10)
            startActivity(MyIntent)
        }

        goforthAct.setOnClickListener {
            val InputContent = EditPhon.text.toString()

            val MyIntent = Intent(this, ForthActivity::class.java)
            MyIntent.putExtra("phonnum", InputContent)

            startActivity(MyIntent)
        }

        editNicknameBtn.setOnClickListener {

        }
    }
}
