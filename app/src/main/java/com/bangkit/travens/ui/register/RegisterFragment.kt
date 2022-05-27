package com.bangkit.travens.ui.register

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.bangkit.travens.R
import com.bangkit.travens.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {

	private var _binding: FragmentRegisterBinding? = null
	private val binding get() = _binding!!

	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		_binding = FragmentRegisterBinding.inflate(inflater, container, false)
		return binding.root
	}

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
//		setActions()
	}

//	private fun setActions() {
//		binding.apply {
//			btnLogin.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_registerFragment_to_loginFragment)
//			)
//			btnRegister.setOnClickListener {
////				handleRegister()
//			}
//		}
//	}

}