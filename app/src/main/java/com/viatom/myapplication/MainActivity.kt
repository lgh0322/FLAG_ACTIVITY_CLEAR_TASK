package com.viatom.myapplication

import android.content.Intent
import android.content.Intent.*
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       startActivity(Intent("com.viatom.littlePu",Uri.parse("viatom_xphealth://m555a99in/afa")).apply { flags=FLAG_ACTIVITY_CLEAR_TASK})
    }
}