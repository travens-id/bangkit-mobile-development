package com.bangkit.travens.presentation.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.bangkit.travens.presentation.MainActivity
import com.bangkit.travens.databinding.ActivityLoginBinding
import com.bangkit.travens.presentation.ui.profile.ProfileActivity
import com.bangkit.travens.presentation.ui.signup.SignUpActivity
import com.google.firebase.auth.FirebaseAuth


class LoginActivity : AppCompatActivity() {

	private lateinit var binding: ActivityLoginBinding
	private lateinit var firebaseAuth: FirebaseAuth

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivityLoginBinding.inflate(layoutInflater)
		setContentView(binding.root)

		firebaseAuth = FirebaseAuth.getInstance()
		binding.btnRegister.setOnClickListener{
			val intent = Intent(this@LoginActivity, SignUpActivity::class.java)
			startActivity(intent)
		}

		binding.btnLogin.setOnClickListener{
			val email = binding.emailEt.text.toString()
			val password = binding.passET.text.toString()

			if(email.isNotEmpty() && password.isNotEmpty()){
				firebaseAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener {
					binding.rlLayout.visibility = View.VISIBLE
					if(it.isSuccessful){
						val intent = Intent(this, ProfileActivity::class.java)
						startActivity(intent)
					} else {
						Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
					}
				}
			} else {
				Toast.makeText(this, "Field tidak boleh kosong !!", Toast.LENGTH_SHORT).show()
			}
		}
	}

	override fun onStart() {
		super.onStart()

		if(firebaseAuth.currentUser != null){
			val intent = Intent(this, ProfileActivity::class.java)
			startActivity(intent)
			finish()
		}
	}
}