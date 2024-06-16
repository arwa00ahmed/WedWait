package com.example.myapplication2.markets.ElectricalAppliances

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.myapplication2.databinding.ActivityStore1Binding
import com.example.myapplication2.fragmentsStore1ElectricalAppliances.AllFragment
import com.example.myapplication2.fragmentsStore1ElectricalAppliances.DiscountsFragment
import com.example.myapplication2.fragmentsStore1ElectricalAppliances.TheNewestFragment

class Store1ElectricalAppliancesActivity : AppCompatActivity() {
    lateinit var binding: ActivityStore1Binding
    private val originalTextColor: Int by lazy {
        binding.discounts.currentTextColor
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityStore1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        pushFragment(AllFragment())
        binding.all.setTextColor(Color.parseColor("#C6664E"))

        binding.discounts.setOnClickListener {
            resetTextColors()
            val newColor = Color.parseColor("#C6664E")
            binding.discounts.setTextColor(newColor)
            pushFragment(DiscountsFragment())
        }
        binding.theNewest.setOnClickListener {
            resetTextColors()
            val newColor = Color.parseColor("#C6664E")
            binding.theNewest.setTextColor(newColor)
            pushFragment(TheNewestFragment())
        }
        binding.all.setOnClickListener {
            resetTextColors()
            val newColor = Color.parseColor("#C6664E")
            binding.all.setTextColor(newColor)
            pushFragment(AllFragment())
        }

    }
    private fun pushFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(
            binding.fragmentContainerStore1.id, fragment
        ).commit()

        if (fragment is AllFragment) {
            binding.all.setTextColor(Color.parseColor("#C6664E"))
        } else {
            binding.all.setTextColor(originalTextColor)
        }
    }
    private fun resetTextColors() {
        binding.discounts.setTextColor(originalTextColor)
        binding.theNewest.setTextColor(originalTextColor)
        binding.all.setTextColor(Color.BLACK)
    }
}
