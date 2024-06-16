package com.example.myapplication2.adaptersStore1ElectricalAppliances

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication2.databinding.ItemAllStore1Binding

class Store1AllAdapter(var allItemList: List<AllItem>):
    RecyclerView.Adapter<Store1AllAdapter.Store1AllViewHolder>() {

    class Store1AllViewHolder(val binding: ItemAllStore1Binding): RecyclerView.ViewHolder(binding.root){

        fun bind(item:AllItem){

            binding.imageStore1.setImageResource(item.icon)
            binding.discription.text=item.title
            binding.sallary.text=item.salary
            binding.egy3700.setImageResource(item.salary0ld)

        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): Store1AllViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val binding = ItemAllStore1Binding.inflate(inflater, parent, false)
        return Store1AllViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return allItemList.size
    }

    override fun onBindViewHolder(holder: Store1AllViewHolder, position: Int) {
        val item = allItemList.get(position)
        holder.bind(item)
    }

}