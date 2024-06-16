package com.example.myapplication2.adaptersMarketsItem

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.myapplication2.databinding.ItemDressesBinding
import com.example.myapplication2.databinding.ItemElectricalAppliancesBinding
import com.example.myapplication2.databinding.ItemHomeBinding
import com.example.myapplication2.databinding.ItemWeddingHallBinding

class DressesAdapter(var dressesItemList: List<DressesItem>):Adapter<DressesAdapter.DressesViewHolder>() {

    class DressesViewHolder(val binding: ItemDressesBinding):ViewHolder(binding.root){

        fun bind(item:DressesItem){
            binding.imageAtelier.setImageResource(item.icon)
            binding.hallName.text=item.name
            binding.location.setImageResource(item.iconLocation)
            binding.locationName.text=item.iconLocationName
            binding.evaluation.setImageResource(item.iconEvaluation)
            binding.evaluationNum.text=item.iconEvaluationNum
        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DressesViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val binding = ItemDressesBinding.inflate(inflater, parent, false)
        return DressesViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dressesItemList.size
    }

    override fun onBindViewHolder(holder: DressesViewHolder, position: Int) {
        val item = dressesItemList.get(position)
        holder.bind(item)
    }

}