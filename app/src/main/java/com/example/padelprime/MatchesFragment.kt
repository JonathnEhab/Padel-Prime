package com.example.padelprime

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.padelprime.databinding.FragmentMatchesBinding


class MatchesFragment : Fragment() {
    private val matchList = listOf(
        Match(
            "Friday, 21 May 2024",
            "08:30 PM to 10:30 PM",
            "Level B",
            "97.5",
            "90",
            R.drawable.person_one,
            R.drawable.person_two,
            2

        ),
        Match(
            "Friday, 21 May 2024",
            "08:30 PM to 10:30 PM",
            "Level B",
            "97.5",
            "90",
            R.drawable.person_one,
            R.drawable.person_two,
            3

        ),
        Match(
            "Saturday, 22 May 2024",
            "10:00 AM to 12:00 PM",
            "Level A",
            "100",
            "120",
            R.drawable.person_one,
            R.drawable.person_two,
            2
        )
        ,
        Match(
            "Saturday, 22 May 2024",
            "10:00 AM to 12:00 PM",
            "Level A",
            "100",
            "120",
            R.drawable.person_one,
            R.drawable.person_two,
            2
        ),
        Match(
            "Friday, 21 May 2024",
            "08:30 PM to 10:30 PM",
            "Level B",
            "97.5",
            "90",
            R.drawable.person_one,
            R.drawable.person_two,
            3
        ),
        Match(
            "Friday, 21 May 2024",
            "08:30 PM to 10:30 PM",
            "Level B",
            "97.5",
            "90 ",
            R.drawable.person_one,
            R.drawable.person_two,
            2
        ),
        Match(
            "Saturday, 22 May 2024",
            "10:00 AM to 12:00 PM",
            "Level A",
            "100",
            "120",
            R.drawable.person_one,
            R.drawable.person_two,
            3
        )
        ,
        Match(
            "Saturday, 22 May 2024",
            "10:00 AM to 12:00 PM",
            "Level A",
            "100",
            "120",
            R.drawable.person_one,
            R.drawable.person_two,
            3
        )

    )
    private var _binding: FragmentMatchesBinding? = null
    private val binding get() = _binding!!
    private lateinit var adapter: MatchAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMatchesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerMatches.layoutManager = LinearLayoutManager(requireContext())
        adapter = MatchAdapter(requireContext(), matchList)
        binding.recyclerMatches.adapter = adapter
    }

}