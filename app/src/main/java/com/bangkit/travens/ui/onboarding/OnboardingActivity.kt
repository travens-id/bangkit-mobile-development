package com.bangkit.travens.ui.onboarding

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowManager
import com.bangkit.travens.databinding.ActivityOnboardingBinding

class OnboardingActivity : AppCompatActivity() {

	private lateinit var onboardingBinding: ActivityOnboardingBinding

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		onboardingBinding = ActivityOnboardingBinding.inflate(layoutInflater)
		setContentView(onboardingBinding.root)

		setupView()

	}

	private fun setupView() {
		@Suppress("DEPRECATION")
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
			window.insetsController?.hide(WindowInsets.Type.statusBars())
		} else {
			window.setFlags(
				WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN
			)
		}
		supportActionBar?.hide()
	}
}