package com.bangkit.travens.presentation.ui.upload

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bangkit.travens.R
import com.bangkit.travens.databinding.ActivityDetectionResultBinding
import com.bumptech.glide.Glide
import com.google.android.material.imageview.ShapeableImageView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DetectionResultActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityDetectionResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetectionResultBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val imageView = findViewById<ShapeableImageView>(R.id.objectImg)

        val destination = intent.getStringExtra(EXTRA_DEST)
        binding.destinationName.text = destination

        val objectImage = intent.getStringExtra(EXTRA_IMG)

        val btnMoveWithDataActivity: Button = findViewById(R.id.detailBtn)
        btnMoveWithDataActivity.setOnClickListener(this)

        Glide.with(this)
            .load(objectImage)
            .into(imageView)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.detailBtn -> {
                val destination = intent.getStringExtra(EXTRA_DEST)
                val destinationString: String = destination.toString()
                val objectImage = intent.getStringExtra(EXTRA_IMG)
                val service = ApiConfig().getDestinationService().getDestination(destination_name = destinationString)

                Toast.makeText(this@DetectionResultActivity, "Getting Detail", Toast.LENGTH_SHORT).show()
                service.enqueue(object: Callback<Destination> {
                    override fun onResponse(
                        call: Call<Destination>,
                        response: Response<Destination>
                    ) {
                        if (response.isSuccessful) {
                            val responseBody = response.body()
                            if (responseBody != null) {
                                val moveWithDataIntent = Intent(this@DetectionResultActivity, DestinationDetailActivity::class.java)
                                moveWithDataIntent.putExtra(DestinationDetailActivity.EXTRA_IMG, objectImage)
                                moveWithDataIntent.putExtra(DestinationDetailActivity.EXTRA_NAME, responseBody[0].destination_name)
                                moveWithDataIntent.putExtra(DestinationDetailActivity.EXTRA_DESC, responseBody[0].description)
                                moveWithDataIntent.putExtra(DestinationDetailActivity.EXTRA_ADDRESS, responseBody[0].address)
                                moveWithDataIntent.putExtra(DestinationDetailActivity.EXTRA_PHONE, responseBody[0].phone_number)
                                moveWithDataIntent.putExtra(DestinationDetailActivity.EXTRA_LATITUDE, responseBody[0].latitude)
                                moveWithDataIntent.putExtra(DestinationDetailActivity.EXTRA_LONGITUDE, responseBody[0].longitude)
                                moveWithDataIntent.putExtra(DestinationDetailActivity.EXTRA_OPERATIONAL, responseBody[0].operational_time)
                                startActivity(moveWithDataIntent)
                            }
                        } else {
                            Toast.makeText(this@DetectionResultActivity, response.message(), Toast.LENGTH_SHORT).show()
                        }
                    }
                    override fun onFailure(call: Call<Destination>, t: Throwable) {
                        Toast.makeText(this@DetectionResultActivity, "Check your connection and retry", Toast.LENGTH_SHORT).show()
                    }

                })
            }

        }
    }

    companion object {
        const val EXTRA_DEST = "extra_dest"
        const val EXTRA_IMG = "extra_img"
    }
}