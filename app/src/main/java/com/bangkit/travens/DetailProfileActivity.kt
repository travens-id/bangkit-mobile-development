package com.bangkit.travens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.bangkit.travens.databinding.ActivityDetailProfileBinding
import com.bangkit.travens.presentation.ui.*

class DetailProfileActivity : AppCompatActivity(), CardClickListener {

	private lateinit var binding: ActivityDetailProfileBinding

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivityDetailProfileBinding.inflate(layoutInflater)
		setContentView(binding.root)

		populatedItenarary()

		val detailProfileActivity = this
		binding.recyclerView.apply {
			layoutManager = GridLayoutManager(applicationContext, 2)
			adapter = ItenararyAdapter(itenararyList, detailProfileActivity)
		}
	}

	private fun populatedItenarary() {
		val itenarary1 = Itenarary(
			R.drawable.wisata_jogja,
			"Sleman, Jogjakarta",
			R.drawable.ic_star,
			"4 hari 2 malam",
			"Budget : Rp. 3.500.000"
		)
		itenararyList.add(itenarary1)
		itenararyList.add(itenarary1)
		itenararyList.add(itenarary1)
		itenararyList.add(itenarary1)
	}

	override fun onClick(itenarary: Itenarary) {
		val intent = Intent(applicationContext, DetailItineraryActivity::class.java)
		intent.putExtra(ITENARARY_ID_EXTRA, itenarary.id)
		startActivity(intent)
	}
}