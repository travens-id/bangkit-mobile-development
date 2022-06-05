package com.bangkit.travens.presentation.ui.profile

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bangkit.travens.databinding.FragmentProfileBinding
import com.bangkit.travens.presentation.ui.login.LoginActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*

class ProfileFragment : Fragment() {

	private var _binding: FragmentProfileBinding? = null
	private val binding get() = _binding!!
	private lateinit var auth: FirebaseAuth
	private var databaseReference: DatabaseReference? = null
	private var database: FirebaseDatabase? = null

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		auth = FirebaseAuth.getInstance()
		database = FirebaseDatabase.getInstance()
		databaseReference = database?.reference?.child("profile")

		loadProfile()
	}

	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		_binding = FragmentProfileBinding.inflate(inflater, container, false)
		return binding.root
	}

	private fun loadProfile() {
		val user = auth.currentUser
		val userReference = databaseReference?.child(user?.uid!!)

		binding.email.text = user?.email

		userReference?.addValueEventListener(object :ValueEventListener{
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
			val intent =  Intent(activity, LoginActivity::class.java)
			startActivity(intent)
		}
	}

}