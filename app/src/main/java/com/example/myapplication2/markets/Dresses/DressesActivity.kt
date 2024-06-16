package com.example.myapplication2.markets.Dresses

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import com.example.myapplication2.adaptersMarketsItem.DressesAdapter
import com.example.myapplication2.adaptersMarketsItem.dressesItem
import com.example.myapplication2.databinding.ActivityDressesBinding

class DressesActivity : AppCompatActivity() {
    lateinit var binding:ActivityDressesBinding
    lateinit var adapter: DressesAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDressesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        adapter= DressesAdapter(dressesItem)
        binding.myRecyclerViewEA.adapter=adapter
        binding.bottomBack.setOnClickListener {
            finish()
        }
    }
}