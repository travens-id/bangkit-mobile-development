package com.bangkit.travens.ui.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bangkit.travens.R
import com.bangkit.travens.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi


class LoginActivity : AppCompatActivity() {

	private lateinit var binding: ActivityLoginBinding
	private lateinit var firebaseAuth: FirebaseAuth

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivityLoginBinding.inflate(layoutInflater)
		setContentView(binding.root)
	}
}