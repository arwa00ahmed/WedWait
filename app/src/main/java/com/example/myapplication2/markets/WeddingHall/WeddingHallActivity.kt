package com.example.myapplication2.markets.WeddingHall

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import com.example.myapplication2.adaptersMarketsItem.WeddingHallAdapter
import com.example.myapplication2.adaptersMarketsItem.weddingHallItem
import com.example.myapplication2.databinding.ActivityWeddingHallBinding

class WeddingHallActivity : AppCompatActivity() {
    lateinit var binding:ActivityWeddingHallBinding
    lateinit var adapter: WeddingHallAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityWeddingHallBinding.inflate(layoutInflater)
        setContentView(binding.root)
        adapter= WeddingHallAdapter(weddingHallItem)
        binding.myRecyclerViewEA.adapter=adapter
        binding.bottomBack.setOnClickListener {
            finish()
        }
    }
}