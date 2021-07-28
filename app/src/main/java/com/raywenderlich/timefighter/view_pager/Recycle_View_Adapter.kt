package com.raywenderlich.timefighter.view_pager

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//class Recycle_View_Adapter(val avatar: List<Int>):RecyclerView.Adapter<Recycle_View_Adapter.ViewHolder>() {
class Recycle_View_Adapter(private val avatar:ArrayList<Avatar>):RecyclerView.Adapter<Recycle_View_Adapter.RecyclerViewHolder>() {


    inner class RecyclerViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        /**
         * Create an instance of the image view and text view
         */
        private val imageInstance:ImageView = itemView.findViewById(R.id.imageId)
        private val textViewInstance:TextView=itemView.findViewById(R.id.fullName)

        fun bindItems(avatar : Avatar){
            imageInstance.setImageResource(avatar.images)
            textViewInstance.text = avatar.fullName
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val recycleView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_layout,parent,false)
        return RecyclerViewHolder(recycleView)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.bindItems(avatar[position])
    }

    override fun getItemCount() =avatar.size


}