package com.example.myapplication2.markets

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import com.example.myapplication2.adaptersMarketsItem.ItemMarketsAdapter
import com.example.myapplication2.adaptersMarketsItem.marketsItem
import com.example.myapplication2.databinding.ActivityMarketsItemRvactivityBinding


class MarketsItemRVActivity : AppCompatActivity() {
    lateinit var binding:ActivityMarketsItemRvactivityBinding
    lateinit var adapter: ItemMarketsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMarketsItemRvactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        adapter=ItemMarketsAdapter(marketsItem)
        binding.rvMarkets.adapter=adapter
        binding.bottomBack.setOnClickListener {
            finish()
        }
    }
}