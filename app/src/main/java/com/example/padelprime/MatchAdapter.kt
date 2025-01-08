package com.example.padelprime

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.padelprime.databinding.ItemMatchesTwoBinding
import com.example.padelprime.databinding.ItemsMatchesOneBinding

class MatchAdapter(private val context: Context, private val matchList: List<Match>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        const val VIEW_TYPE_ONE = 2
        const val VIEW_TYPE_TWO = 3
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            VIEW_TYPE_ONE -> {
                val binding =
                    ItemsMatchesOneBinding.inflate(LayoutInflater.from(context), parent, false)
                MatchViewHolderOne(binding)
            }

            VIEW_TYPE_TWO -> {
                val binding =
                    ItemMatchesTwoBinding.inflate(LayoutInflater.from(context), parent, false)
                MatchViewHolderTwo(binding)
            }

            else -> throw IllegalArgumentException("Invalid view type")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val match = matchList[position]

        when (holder) {
            is MatchViewHolderOne -> {
                holder.binding.day.text = match.day
                holder.binding.time.text = match.time
                holder.binding.level.text = match.level
                holder.binding.price.text = match.price
                holder.binding.duration.text = match.duration
                holder.binding.playerOne.setImageResource(match.playerOneImage)
                holder.binding.playerTwo.setImageResource(match.playerTwoImage)
                holder.binding.playerOne.setImageResource(match.playerOneImage)
                holder.binding.playerTwo.setImageResource(match.playerTwoImage)
            }

            is MatchViewHolderTwo -> {
                holder.binding.day.text = match.day
                holder.binding.time.text = match.time
                holder.binding.level.text = match.level
                holder.binding.price.text = match.price
                holder.binding.duration.text = match.duration
                holder.binding.playerOne.setImageResource(match.playerOneImage)
                holder.binding.playerTwo.setImageResource(match.playerTwoImage)
                holder.binding.playerOne.setImageResource(match.playerOneImage)
                holder.binding.playerTwo.setImageResource(match.playerTwoImage)
            }
        }
    }

    override fun getItemCount(): Int {
        return matchList.size
    }

    override fun getItemViewType(position: Int): Int {
        return matchList[position].viewType
    }

    class MatchViewHolderOne(val binding: ItemsMatchesOneBinding) :
        RecyclerView.ViewHolder(binding.root)

    class MatchViewHolderTwo(val binding: ItemMatchesTwoBinding) :
        RecyclerView.ViewHolder(binding.root)
}



