package com.bangkit.travens.ui.onboarding

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowInsets
import android.view.WindowManager
import com.bangkit.travens.R
import com.bangkit.travens.databinding.ActivityOnboardingBinding
import com.bangkit.travens.ui.login.LoginActivity

class OnboardingActivity : AppCompatActivity(), View.OnClickListener {

	private lateinit var onboardingBinding: ActivityOnboardingBinding

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		onboardingBinding = ActivityOnboardingBinding.inflate(layoutInflater)
		setContentView(onboardingBinding.root)

		setupView()

		onboardingBinding.btnGetStarted.setOnClickListener(this)

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

	override fun onClick(p0: View) {
		when(p0.id){
			R.id.btnGetStarted -> {
				val moveIntent = Intent( this@OnboardingActivity, LoginActivity::class.java)
				startActivity(moveIntent)
			}
		}
	}
}