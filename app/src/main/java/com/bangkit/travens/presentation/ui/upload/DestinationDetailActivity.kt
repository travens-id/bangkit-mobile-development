package com.bangkit.travens.presentation.ui.upload

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bangkit.travens.R
import com.bangkit.travens.databinding.ActivityDestinationDetailBinding
import com.bumptech.glide.Glide

class DestinationDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDestinationDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDestinationDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val name = intent.getStringExtra(EXTRA_NAME)
        val desc = intent.getStringExtra(EXTRA_DESC)
        val address = intent.getStringExtra(EXTRA_ADDRESS)
        val phone = intent.getStringExtra(EXTRA_PHONE)

        val operational = intent.getStringExtra(EXTRA_OPERATIONAL)


        val imageView = findViewById<ImageView>(R.id.detailImg)

        binding.detailName.text = name
        binding.locatianDetail.text = address
        binding.phoneDetail.text = phone
        binding.clockDetail.text = operational
        binding.detailDesc.text = desc

        val objectImage = intent.getStringExtra(EXTRA_IMG)

        Glide.with(this)
            .load(objectImage)
            .into(imageView)
    }

    companion object {
        const val EXTRA_IMG = "extra_img"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DESC = "extra_desc"
        const val EXTRA_ADDRESS = "extra_address"
        const val EXTRA_PHONE = "extra_phone"
        const val EXTRA_LATITUDE = "extra_latitude"
        const val EXTRA_LONGITUDE = "extra_longitude"
        const val EXTRA_OPERATIONAL = "extra_operational"
    }
}