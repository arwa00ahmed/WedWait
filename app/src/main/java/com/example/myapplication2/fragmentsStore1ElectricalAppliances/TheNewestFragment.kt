package com.example.myapplication2.fragmentsStore1ElectricalAppliances

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

import com.example.myapplication2.adaptersStore1ElectricalAppliances.Store1TheNewestAdapter
import com.example.myapplication2.adaptersStore1ElectricalAppliances.newWestItem

import com.example.myapplication2.databinding.FragmentTheNewestStore1Binding

class TheNewestFragment : Fragment() {
    lateinit var binding: FragmentTheNewestStore1Binding
    lateinit var adapter: Store1TheNewestAdapter
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentTheNewestStore1Binding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter= Store1TheNewestAdapter(newWestItem)
        binding.rvDiscount.adapter=adapter
    }

}