package com.bangkit.travens

import androidx.recyclerview.widget.RecyclerView
import com.bangkit.travens.databinding.LayoutItemBinding
import com.bangkit.travens.ui.Itenarary

class ItenararyViewHolder (

	private val layoutItemBinding: LayoutItemBinding,
	private val clickListener: CardClickListener
	) : RecyclerView.ViewHolder(layoutItemBinding.root)
	{
		fun bindBook(itenarary: Itenarary)
		{
			layoutItemBinding.cover.setImageResource(itenarary.cover)
			layoutItemBinding.title.text = itenarary.title
			layoutItemBinding.rating.setImageResource(itenarary.rating)
			layoutItemBinding.days.text = itenarary.days
			layoutItemBinding.budget.text = itenarary.budget

			layoutItemBinding.cardView.setOnClickListener{
				clickListener.onClick(itenarary)
			}
		}
}