package com.bangkit.travens.presentation.ui.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.bangkit.travens.databinding.ActivitySignUpBinding
import com.bangkit.travens.presentation.ui.login.LoginActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class SignUpActivity : AppCompatActivity() {

	private lateinit var binding: ActivitySignUpBinding
	private lateinit var firebaseAuth: FirebaseAuth
	private var databaseReference: DatabaseReference? = null
	private var database: FirebaseDatabase? = null

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivitySignUpBinding.inflate(layoutInflater)
		setContentView(binding.root)

		firebaseAuth = FirebaseAuth.getInstance()
		database = FirebaseDatabase.getInstance()
		databaseReference = database!!.reference.child("profile")
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
					binding.rlLayout.visibility = View.VISIBLE
					if(it.isSuccessful){
						val currentUser = firebaseAuth.currentUser
						val currentUserDb = databaseReference?.child(currentUser?.uid!!)
						currentUserDb?.child("firstname")?.setValue(firstname)
						currentUserDb?.child("lastname")?.setValue(lastname)
						currentUserDb?.child("handphone")?.setValue(handphone)

						val intent = Intent(this, LoginActivity::class.java)
						startActivity(intent)
						Toast.makeText(this, "Akun telah berhasil dibuat", Toast.LENGTH_SHORT).show()
						finish()
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