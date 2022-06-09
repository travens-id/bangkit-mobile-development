package com.bangkit.travens.presentation.ui.profile

import android.content.Intent
import com.bangkit.travens.presentation.ui.login.LoginActivity
import com.google.firebase.database.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bangkit.travens.databinding.ActivityProfileBinding
import com.google.firebase.auth.FirebaseAuth

class ProfileActivity : AppCompatActivity() {

	private lateinit var binding : ActivityProfileBinding
	private lateinit var auth : FirebaseAuth
	private var databaseReference: DatabaseReference? = null
	private var database: FirebaseDatabase? = null


	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivityProfileBinding.inflate(layoutInflater)
		setContentView(binding.root)

		auth = FirebaseAuth.getInstance()
		database = FirebaseDatabase.getInstance()
		databaseReference = database?.reference?.child("profile")

		loadProfile()
	}

	private fun loadProfile() {
		val user = auth.currentUser
		val userReference = databaseReference?.child(user?.uid!!)

		binding.email.text = user?.email

		userReference?.addValueEventListener(object : ValueEventListener {
			override fun onDataChange(snapshot: DataSnapshot) {
				binding.firstname.text = snapshot.child("firstname").value.toString()
				binding.lastname.text = snapshot.child("lastname").value.toString()
			}

			override fun onCancelled(error: DatabaseError) {
				TODO("Not yet implemented")
			}
		})

		binding.btnLogout.setOnClickListener {
			auth.signOut()
			val intent = Intent(this@ProfileActivity, LoginActivity::class.java)
			finish()
			startActivity(intent)
		}
	}
}