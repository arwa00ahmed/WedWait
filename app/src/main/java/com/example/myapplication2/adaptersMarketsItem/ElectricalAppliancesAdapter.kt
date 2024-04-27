package com.example.myapplication2.adaptersMarketsItem

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication2.databinding.ItemElectricalAppliancesBinding
import com.example.myapplication2.markets.ElectricalAppliances.Store1ElectricalAppliancesActivity

class ElectricalAppliancesAdapter(private val electricalItemList: List<ElectricalAppliancesItem>) : RecyclerView.Adapter<ElectricalAppliancesAdapter.ElectricalAppliancesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ElectricalAppliancesViewHolder {
        val binding = ItemElectricalAppliancesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ElectricalAppliancesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ElectricalAppliancesViewHolder, position: Int) {
        val item = electricalItemList[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = electricalItemList.size

    class ElectricalAppliancesViewHolder(private val binding: ItemElectricalAppliancesBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: ElectricalAppliancesItem) {
            binding.imageElectricalAppliances.setImageResource(item.icon)
            binding.storeName.text = item.name
            binding.location.setImageResource(item.iconLocation)
            binding.locationName.text = item.iconLocationName
            binding.evaluation.setImageResource(item.iconEvaluation)
            binding.evaluationNum.text = item.iconEvaluationNum

            itemView.setOnClickListener {
                when (adapterPosition) {
                    0 -> {
                        val context = itemView.context
                        val intent = Intent(context, Store1ElectricalAppliancesActivity::class.java)
                        context.startActivity(intent)
                    }

                }
            }
        }
    }
}
