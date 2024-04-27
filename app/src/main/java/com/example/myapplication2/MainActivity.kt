package com.example.myapplication2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.myapplication2.databinding.ActivityMainBinding
import com.example.myapplication2.fragments.AccountFragment
import com.example.myapplication2.fragments.HomeFragment
import com.example.myapplication2.fragments.SearchFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bottomNavigation.setOnItemSelectedListener {

            when (it.itemId) {
                R.id.account -> {
                 pushFragment(AccountFragment())
                }
                R.id.home -> {
                    pushFragment(HomeFragment())
                }
                R.id.search -> {
                    pushFragment(SearchFragment())
                }
            }

            return@setOnItemSelectedListener true
        }

    }
    private fun pushFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(
            binding.fragmentContainer.id,fragment
        ).commit()
    }
}