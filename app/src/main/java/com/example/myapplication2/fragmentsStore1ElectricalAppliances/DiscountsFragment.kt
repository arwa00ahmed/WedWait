package com.example.myapplication2.fragmentsStore1ElectricalAppliances

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

import com.example.myapplication2.adaptersStore1ElectricalAppliances.Store1DiscountAdapter
import com.example.myapplication2.adaptersStore1ElectricalAppliances.discountItem

import com.example.myapplication2.databinding.FragmentDiscountsStore1Binding


class DiscountsFragment : Fragment() {
    lateinit var binding: FragmentDiscountsStore1Binding
    lateinit var adapter: Store1DiscountAdapter
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentDiscountsStore1Binding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter= Store1DiscountAdapter(discountItem)
        binding.rvDiscount.adapter=adapter
    }

}