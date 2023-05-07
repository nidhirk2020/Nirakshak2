package com.example.nirakshak20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Handler
class Splash : AppCompatActivity() {
    private val SPLASH_TIME_OUT = 3000L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

        Handler().postDelayed(
            {
                val i = Intent(this@Splash, login::class.java)
                startActivity(i)
                finish()
            }, SPLASH_TIME_OUT)
    }
}

