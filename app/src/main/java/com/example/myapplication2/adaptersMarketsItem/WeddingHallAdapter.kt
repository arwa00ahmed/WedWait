package com.example.myapplication2.adaptersMarketsItem

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.myapplication2.databinding.ItemElectricalAppliancesBinding
import com.example.myapplication2.databinding.ItemHomeBinding
import com.example.myapplication2.databinding.ItemWeddingHallBinding

class WeddingHallAdapter(var weddingItemList: List<WeddingHallItem>):Adapter<WeddingHallAdapter.WeddingHallViewHolder>() {

    class WeddingHallViewHolder(val binding: ItemWeddingHallBinding):ViewHolder(binding.root){

        fun bind(item:WeddingHallItem){
            binding.imageWeddingHall.setImageResource(item.icon)
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
    ): WeddingHallViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val binding = ItemWeddingHallBinding.inflate(inflater, parent, false)
        return WeddingHallViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return weddingItemList.size
    }

    override fun onBindViewHolder(holder: WeddingHallViewHolder, position: Int) {
        val item = weddingItemList.get(position)
        holder.bind(item)
    }

}