package com.example.myapplication2.adapters
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.myapplication2.databinding.ItemHomeBinding
import com.example.myapplication2.markets.MarketsItemRVActivity


class ItemHAdapter(var ItemHomelist:List<MenuItem>?):Adapter<ItemHAdapter.ItemHomeViewHolder>() {



    class ItemHomeViewHolder(val binding: ItemHomeBinding) : ViewHolder(binding.root) {

        fun bind(item: MenuItem,position: Int) {
            binding.iconName.setImageResource(item.text)
            binding.itemHomeIm.setImageResource(item.icon)
            binding.root.setOnClickListener {
                performActionOnItemClick(position)
            }
        }

        private fun performActionOnItemClick(position: Int) {
           when(position){
               0->{
                   val context = itemView.context
                   val intent = Intent(context, MarketsItemRVActivity::class.java)
                   context.startActivity(intent)
               }
           }
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHomeViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val binding = ItemHomeBinding.inflate(inflater, parent, false)
        return ItemHomeViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return ItemHomelist?.size ?: 0
    }

    override fun onBindViewHolder(holder: ItemHomeViewHolder, position: Int) {
        val item = ItemHomelist?.get(position) ?:return
        holder.bind(item,position)

    }

}

