package com.bangkit.travens.ui.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.bangkit.travens.R
import com.bangkit.travens.databinding.ActivitySignUpBinding
import com.bangkit.travens.ui.login.LoginActivity
import com.google.firebase.auth.FirebaseAuth

class SignUpActivity : AppCompatActivity() {

	private lateinit var binding: ActivitySignUpBinding
	private lateinit var firebaseAuth: FirebaseAuth

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivitySignUpBinding.inflate(layoutInflater)
		setContentView(binding.root)

		firebaseAuth = FirebaseAuth.getInstance()
		binding.btnLogin.setOnClickListener{
			val intent = Intent(this, LoginActivity::class.java)
			startActivity(intent)
		}

		binding.btnRegister.setOnClickListener{
			val firstname = binding.firstnameEt.text.toString()
			val lastname = binding.lastnameEt.text.toString()
			val email = binding.emailEt.text.toString()
			val pass = binding.passET.text.toString()
			val handphone = binding.phoneEt.text.toString()

			if(email.isNotEmpty() && pass.isNotEmpty() && firstname.isNotEmpty() && lastname.isNotEmpty() && handphone.isNotEmpty()){
				firebaseAuth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener {
					if(it.isSuccessful){
						val intent = Intent(this, LoginActivity::class.java)
						startActivity(intent)
					} else {
						Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
					}
				}
			} else {
				Toast.makeText(this, "Field Tidak boleh kosong !!", Toast.LENGTH_SHORT).show()
			}
		}
	}


}