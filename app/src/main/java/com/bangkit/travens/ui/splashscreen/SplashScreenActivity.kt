package com.bangkit.travens.ui.splashscreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.bangkit.travens.MainActivity
import com.bangkit.travens.databinding.ActivitySplashScreenBinding
import com.bangkit.travens.ui.onboarding.OnboardingActivity
import com.google.firebase.auth.FirebaseAuth

class SplashScreenActivity : AppCompatActivity() {

    private lateinit var splashScreenBinding: ActivitySplashScreenBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        splashScreenBinding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(splashScreenBinding.root)

        val handler = Handler(mainLooper)

        handler.postDelayed({
            val intent = Intent(this@SplashScreenActivity, OnboardingActivity::class.java)
            startActivity(intent)
            finish()
        }, 5000L)

        supportActionBar?.hide()
    }
}