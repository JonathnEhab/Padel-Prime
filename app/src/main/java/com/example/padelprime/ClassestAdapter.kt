package com.example.padelprime

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.padelprime.databinding.ItemClassesBinding
import com.example.padelprime.databinding.ItemTourlemntsBinding
import com.example.padelprime.databinding.ItemTourlemntsSelctedBinding

class ClassestAdapter(
    private val tournaments: List<TournamentData>,
    private val context: Context
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        const val TYPE_NOT_STARTED = 0
        const val TYPE_STARTED = 1
    }

    override fun getItemViewType(position: Int): Int {
        return if (tournaments[position].isStarted) TYPE_STARTED else TYPE_NOT_STARTED
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            TYPE_NOT_STARTED -> {
                val binding = ItemClassesBinding.inflate(LayoutInflater.from(context), parent, false)
                TournamentNotStartedViewHolder(binding)
            }

            else -> throw IllegalArgumentException("Invalid view type")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val tournament = tournaments[position]

        when (holder) {
            is TournamentNotStartedViewHolder -> holder.bind(tournament)

        }
    }

    override fun getItemCount(): Int {
        return tournaments.size
    }


    inner class TournamentNotStartedViewHolder(private val binding: ItemClassesBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(tournament: TournamentData) {
            binding.className.text = tournament.name
            binding.classDate.text = tournament.date
            binding.classDescription.text=tournament.description
            binding.levels.text=tournament.level
            binding.gander.text=tournament.gender
            binding.duration.text=tournament.duration
            binding.price.text= tournament.price.toString()
            Glide.with(binding.root.context)
                .load(tournament.imageResource)

                .into(binding.circleImageView)



        }
    }



}
