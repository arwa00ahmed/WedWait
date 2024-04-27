package com.example.myapplication2.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication2.adapters.ItemHAdapter
import com.example.myapplication2.adapters.menuItem
import com.example.myapplication2.databinding.FragmentHomeBinding

class HomeFragment :Fragment() {
 lateinit var binding: FragmentHomeBinding
 lateinit var adapter:ItemHAdapter
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = ItemHAdapter(menuItem)
        binding.rvHome.adapter=adapter
        }



    }

