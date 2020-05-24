package com.ubis.androidbasic01

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nick.*

class EditNickActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nick)

        OkBtn.setOnClickListener {

            val inputNickName = NickNameEdt.text.toString()
            val resultIntece = Intent()
            resultIntece.putExtra("nick", inputNickName)

            setResult(Activity.RESULT_OK, resultIntece)

            finish()
        }
    }
}
