package com.example.myapplication2.adaptersStore1ElectricalAppliances

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.example.myapplication2.databinding.ItemTheNewestStore1Binding

class Store1TheNewestAdapter(var newWestItemList: List<TheNewestItem>):
    RecyclerView.Adapter<Store1TheNewestAdapter.Store1TheNewWestViewHolder>() {

    class Store1TheNewWestViewHolder(val binding: ItemTheNewestStore1Binding): RecyclerView.ViewHolder(binding.root){

        fun bind(item:TheNewestItem){

            binding.imageStore1.setImageResource(item.icon)
            binding.discription.text=item.title
            binding.sallary.text=item.salary
            binding.egy3700.setImageResource(item.salary0ld)

        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): Store1TheNewWestViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val binding = ItemTheNewestStore1Binding.inflate(inflater, parent, false)
        return Store1TheNewWestViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return newWestItemList.size
    }

    override fun onBindViewHolder(holder: Store1TheNewWestViewHolder, position: Int) {
        val item = newWestItemList.get(position)
        holder.bind(item)
    }

}