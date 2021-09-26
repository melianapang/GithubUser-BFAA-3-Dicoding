package com.example.githubuser

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val topAn = AnimationUtils.loadAnimation(this,R.anim.top_animation)
        val bottomAn = AnimationUtils.loadAnimation(this,R.anim.bottom_animation)

        val albumTitle: View = findViewById(R.id.tv_app_name_title)
        val albumTitle2: View = findViewById(R.id.tv_app_name_2_title)

        albumTitle.animation = topAn
        albumTitle2.animation = bottomAn

        val run = Runnable {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        Handler().postDelayed(run,2500)  //harus diganti krn udh deprecated
    }
}