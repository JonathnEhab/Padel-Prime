package com.example.padelprime

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.padelprime.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val fragments = listOf(
            MatchesFragment(),
            TourlemntFragment(),
            KingOfTheCourtFragment(),
            ClassesFragment()
        )
        val adapter = ViewPagerAdapter(this, fragments)
       binding.viewPager.adapter = adapter
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.customView = layoutInflater.inflate(R.layout.custom_tab_item, null).apply {
                findViewById<TextView>(R.id.tabText).text = when (position) {
                    0 -> "Matches"
                    1 -> "Tournaments"
                    2 -> "King of Court"
                    3 -> "Classes"
                    else -> ""
                }

            }
        }.attach()





    }
    }


