package com.example.a7minuateworkout

import android.view.LayoutInflater
import android.view.ViewGroup
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
    }
}