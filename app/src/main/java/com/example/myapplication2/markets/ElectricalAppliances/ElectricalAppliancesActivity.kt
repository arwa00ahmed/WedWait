package com.example.myapplication2.markets.ElectricalAppliances

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import com.example.myapplication2.adaptersMarketsItem.ElectricalAppliancesAdapter
import com.example.myapplication2.adaptersMarketsItem.electricalAppliancesItem
import com.example.myapplication2.databinding.ActivityElectricalAppliancesBinding

class ElectricalAppliancesActivity : AppCompatActivity() {
    lateinit var binding: ActivityElectricalAppliancesBinding
    lateinit var adapter: ElectricalAppliancesAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityElectricalAppliancesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        adapter= ElectricalAppliancesAdapter(electricalAppliancesItem)
        binding.myRecyclerViewEA.adapter=adapter
        binding.bottomBack.setOnClickListener {
            finish()
        }

    }
}