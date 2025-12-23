package com.cyber.widget

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtInfo = findViewById<TextView>(R.id.txtBuildInfo)
        
        // Load data from assets
        try {
            val jsonString = assets.open("sample_data.json").bufferedReader().use { it.readText() }
            val json = JSONObject(jsonString)
            txtInfo.text = "Build ID: ${json.getString("build_id")}\nKernel: ${json.getString("kernel")}"
        } catch (e: Exception) {
            txtInfo.text = "Error loading system metadata"
        }
    }
}