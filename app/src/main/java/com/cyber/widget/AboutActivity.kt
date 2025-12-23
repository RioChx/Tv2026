package com.cyber.widget

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        
        val txtVersion = findViewById<TextView>(R.id.txtVersion)
        txtVersion.text = "CyberWidget Art SDK\nVersion 1.2.0-Stable\nAPI Level 33 Compliant"
        
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}