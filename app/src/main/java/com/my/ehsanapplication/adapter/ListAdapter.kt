//package com.my.ehsanapplication.adapter
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.ImageView
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//import com.my.ehsanapplication.R
//import com.my.ehsanapplication.data.ItemData
//
//class ListAdapter(val items: List<ItemData>) : RecyclerView.Adapter<ListAdapter.ListItemViewHolder>() {
//
//    class ListItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
//        val title : TextView = itemView.findViewById(R.id.text_food)
//        val image : ImageView = itemView.findViewById(R.id.image_food)
//
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
//
//        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_food, parent,false)
//        return ListItemViewHolder(itemView)
//    }
//
//    override fun getItemCount(): Int {
//        return items.size
//    }
//
//    override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {
//        val currentItem = items[position]
//        holder.title.text = currentItem.title
//        holder.image.setImageDrawable(currentItem.image)
//
//
//
//    }
//}
