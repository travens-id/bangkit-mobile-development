package com.bangkit.travens.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bangkit.travens.databinding.ListFavouriteBinding
import com.bangkit.travens.presentation.ui.favourite.ListFavouriteListener
import com.bangkit.travens.presentation.ui.Favourite
import com.bangkit.travens.presentation.ui.favourite.FavouriteViewHolder

class FavouriteAdapter (
	private val favourite: List<Favourite>,
	private val listFavouriteListener: ListFavouriteListener
		) : RecyclerView.Adapter<FavouriteViewHolder>(){
	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavouriteViewHolder {

		val from = LayoutInflater.from(parent.context)
		val binding = ListFavouriteBinding.inflate(from, parent, false)
		return FavouriteViewHolder(binding, listFavouriteListener)
	}

	override fun onBindViewHolder(holder: FavouriteViewHolder, position: Int) {
		holder.bindList(favourite[position])
	}

	override fun getItemCount(): Int = favourite.size

}