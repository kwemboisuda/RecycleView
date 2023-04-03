package com.coke.recycleview

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(private val newsList: ArrayList<News>): RecyclerView.Adapter<MyAdapter.myViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val itemView =LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return myViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        val currentItem= newsList[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.tvHeaading.text = currentItem.heading
    }

    override fun getItemCount(): Int {
        return newsList.size
    }
    class myViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
        val titleImage: ShapeableImageView = itemView.findViewById(R.id.title_image)
        val tvHeaading: TextView = itemView.findViewById(R.id.tvHeading)
    }


}