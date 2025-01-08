package com.example.padelprime

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.padelprime.databinding.FragmentKingOfTheCourtBinding
import com.example.padelprime.databinding.FragmentTourlmentBinding

class KingOfTheCourtFragment : Fragment() {
    val tournaments = listOf(
        TournamentData(
            imageResource = R.drawable.crown,
            name = "GATORADE Tournament",
            date = "Thursday 11 May",
            description = "incididunt ut labore et dolore magna aliqua...",
            level = "A&B",
            gender = "Male",
            duration = "2 Day",
            price = 100.0,
            durationInHours = 48,
            levelInfo = "A,b",
            genderInfo = "Male",
            durationInfo = "2 Day",
            isStarted = false
        ),

        TournamentData(
            imageResource = R.drawable.crown,
            name = "GATORADE Tournament",
            date = "Thursday 11 May",
            description = "incididunt ut labore et dolore magna aliqua...",
            level = "A&B",
            gender = "Male",
            duration = "2 Day",
            price = 100.0,
            durationInHours = 48,
            levelInfo = "A,b",
            genderInfo = "Male",
            durationInfo = "2 Day",
            isStarted = false
        ),

        TournamentData(
            imageResource = R.drawable.crown,
            name = "GATORADE Tournament",
            date = "Thursday 11 May",
            description = "incididunt ut labore et dolore magna aliqua...",
            level = "B&D",
            gender = "Male",
            duration = "2 Day",
            price = 100.0,
            durationInHours = 48,
            levelInfo = "A,b",
            genderInfo = "Male",
            durationInfo = "2 Day",
            isStarted = false
        ),
         TournamentData(
            imageResource = R.drawable.crown,
            name = "GATORADE Tournament",
            date = "Thursday 11 May",
            description = "incididunt ut labore et dolore magna aliqua...",
            level = "A",
            gender = "Male",
            duration = "2 Day",
            price = 100.0,
            durationInHours = 48,
            levelInfo = "A,b",
            genderInfo = "Male",
            durationInfo = "2 Day",
            isStarted = false
        )
        ,
        TournamentData(
            imageResource = R.drawable.crown,
            name = "GATORADE Tournament",
            date = "Thursday 11 May",
            description = "incididunt ut labore et dolore magna aliqua...",
            level = "B",
            gender = "Male",
            duration = "2 Day",
            price = 100.0,
            durationInHours = 48,
            levelInfo = "A,b",
            genderInfo = "Male",
            durationInfo = "2 Day",
            isStarted = false
        ),
        TournamentData(
            imageResource = R.drawable.crown,
            name = "CocaCola Tournament",
            date = "Monday 15 May",
            description = "Lorem ipsum dolor sit amet...",
            level = "A&B",
            gender = "Female",
            duration = "3 Day",
            price = 150.0,
            durationInHours = 72,
            levelInfo = "A,c",
            genderInfo = "Female",
            durationInfo = "3 Day",
            isStarted = false
        )
    )
private  var _binding :FragmentKingOfTheCourtBinding?=null
    private val binding get() = _binding!!
    private lateinit var adapter: TournamentAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         _binding = FragmentKingOfTheCourtBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerCort.layoutManager=LinearLayoutManager(requireContext())
        adapter=TournamentAdapter(tournaments,requireContext())
        binding.recyclerCort.adapter=adapter
    }


}