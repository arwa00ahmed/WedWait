package com.example.myapplication2.adaptersStore1ElectricalAppliances



import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

import com.example.myapplication2.databinding.ItemDiscountStore1Binding


class Store1DiscountAdapter(var discountlItemList: List<DiscountItem>):Adapter<Store1DiscountAdapter.Store1DiscountViewHolder>() {

    class Store1DiscountViewHolder(val binding: ItemDiscountStore1Binding):ViewHolder(binding.root){

        fun bind(item:DiscountItem){

            binding.imageStore1.setImageResource(item.icon)
            binding.discription.text=item.title
            binding.sallary.text=item.salary
            binding.egy3700.setImageResource(item.salary0ld)

        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): Store1DiscountViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val binding = ItemDiscountStore1Binding.inflate(inflater, parent, false)
        return Store1DiscountViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return discountlItemList.size
    }

    override fun onBindViewHolder(holder: Store1DiscountViewHolder, position: Int) {
        val item = discountlItemList.get(position)
        holder.bind(item)
    }

}