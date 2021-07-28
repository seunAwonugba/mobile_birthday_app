package com.raywenderlich.timefighter.view_pager

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewPagerAdapter(val images:List<Int>):RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>() {

    /**
     * Create an instance of recycleView.viewHolder
     */
    inner class ViewPagerViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        /**
         * Create an instance of the image view
         */
        val imageInstance: ImageView = itemView.findViewById(R.id.changingImageId)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_pager_layout,parent,false)
        return ViewPagerViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        /**
         * set images to current views. first get current image Id at index of current position
         */
        /**
         * images from viewPagerAdapter class above
         */
        val currentImage = images[position]
        holder.imageInstance.setImageResource(currentImage)

        /**
         * images from Avatar class.
//         * This is where u bind all the data on every avatar
//         */





    }

    override fun getItemCount(): Int {
        /**
         * Inform us of the amount of images present
         */
        return images.size
    }

}