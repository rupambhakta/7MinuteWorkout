package com.example.a7minuateworkout

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.a7minuateworkout.databinding.ItemExecrseStatusBinding

class ExerciseStatusAdapter(val item: ArrayList<ExerciseModel>):
    RecyclerView.Adapter<ExerciseStatusAdapter.ViewHolder>() {
        class ViewHolder(binding: ItemExecrseStatusBinding):
                RecyclerView.ViewHolder(binding.root){
                    val tvItem = binding.tvItem
                }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemExecrseStatusBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
       return item.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model : ExerciseModel = item[position]
        holder.tvItem.text = model.getId().toString()

        when{
            model.getIsSelected()->{
                holder.tvItem.background = ContextCompat.getDrawable(holder.tvItem.context,R.drawable.item_circular_this_color_accent_border)
                holder.tvItem.setTextColor(Color.parseColor("#212121"))
            }
            model.getIsCompleted()->{
                holder.tvItem.background = ContextCompat.getDrawable(holder.tvItem.context,R.drawable.item_circular_color_accent_background)
                holder.tvItem.setTextColor(Color.parseColor("#FFFFFF"))
            }
            else->{
                holder.tvItem.background = ContextCompat.getDrawable(holder.tvItem.context,R.drawable.item_circular_color_gray_background)
                holder.tvItem.setTextColor(Color.parseColor("#212121"))
            }
        }
    }
}