package com.example.myapplication2.adaptersMarketsItem

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication2.databinding.ItemMarketsBinding
import com.example.myapplication2.markets.Dresses.DressesActivity
import com.example.myapplication2.markets.ElectricalAppliances.ElectricalAppliancesActivity
import com.example.myapplication2.markets.WeddingHall.WeddingHallActivity

class ItemMarketsAdapter(private val marketsItemList: List<MarketsItem>) : RecyclerView.Adapter<ItemMarketsAdapter.ItemMarketsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemMarketsViewHolder {
        val binding = ItemMarketsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemMarketsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemMarketsViewHolder, position: Int) {
        val item = marketsItemList[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = marketsItemList.size

    class ItemMarketsViewHolder(private val binding: ItemMarketsBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: MarketsItem) {
            binding.itemMarketIm.setImageResource(item.icon)
            binding.root.setOnClickListener {
                when (adapterPosition) {
                    0 -> {
                        val context = itemView.context
                        val intent = Intent(context, ElectricalAppliancesActivity::class.java)
                        context.startActivity(intent)
                    }3-> {
                    val context = itemView.context
                    val intent = Intent(context, WeddingHallActivity::class.java)
                    context.startActivity(intent)
                }5-> {
                    val context = itemView.context
                    val intent = Intent(context, DressesActivity::class.java)
                    context.startActivity(intent)
                }


                }
            }
        }
    }
}
