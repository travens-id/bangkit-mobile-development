package com.bangkit.travens.presentation.ui.favourite

import androidx.recyclerview.widget.RecyclerView
import com.bangkit.travens.R
import com.bangkit.travens.databinding.ListFavouriteBinding
import com.bangkit.travens.presentation.ui.Favourite

class FavouriteViewHolder(
	private val listFavouriteBinding: ListFavouriteBinding,
	private val clickListener: ListFavouriteListener
) : RecyclerView.ViewHolder(listFavouriteBinding.root)
{
	fun bindList(favourite: Favourite) {
		listFavouriteBinding.img.setImageResource(favourite.img)
		listFavouriteBinding.jobdesc.text = favourite.jobdesc
		listFavouriteBinding.nama.text = favourite.nama
		listFavouriteBinding.icon.setImageResource(favourite.icon)
		listFavouriteBinding.rating.setImageResource(favourite.rating)
		listFavouriteBinding.desc.text = favourite.desc
		listFavouriteBinding.price.text = favourite.price

		listFavouriteBinding.btnFavourite.setOnClickListener{
			if(true){
				listFavouriteBinding.btnFavourite.setImageResource(R.drawable.ic_favorite_filled)
			} else {
				listFavouriteBinding.btnFavourite.setImageResource(R.drawable.ic_favorite_border)
			}
		}

		listFavouriteBinding.cardView2.setOnClickListener{
			clickListener.onClick(favourite)
		}
	}
}