package com.example.myapplication2.fragmentsStore1ElectricalAppliances

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication2.adaptersStore1ElectricalAppliances.Store1AllAdapter
import com.example.myapplication2.adaptersStore1ElectricalAppliances.allItem
import com.example.myapplication2.databinding.FragmentAllStore1Binding

class AllFragment : Fragment() {
    lateinit var binding: FragmentAllStore1Binding
    lateinit var adapter: Store1AllAdapter
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentAllStore1Binding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter= Store1AllAdapter(allItem)
        binding.rvDiscount.adapter=adapter
    }

}