package com.raywenderlich.timefighter.view_pager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    /**
     * Create instance of recycle view, view pager etc
     */
    lateinit var instanceOfViewPager:ViewPager2
    lateinit var instanceOfRecyclerView: RecyclerView
    lateinit var avatarName: ArrayList<Avatar>
    lateinit var avatarView:Array<Int>
    lateinit var fullNameView:Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * Get ID of the ViewPager
         */
        instanceOfViewPager = findViewById(R.id.viewPager)


        val imageList = listOf(
            R.drawable.ali_pazani_b4hzxqfzuoo_unsplash,
            R.drawable.brooke_cagle_otweoxmkdka_unsplash,
            R.drawable.gean_montoya_cedwdchuusk_unsplash,
            R.drawable.gracious_adebayo_sete0gjxc1u_unsplash,
            R.drawable.pexels_polina_tankilevitch_3905906,
            R.drawable.pexels_red_light_films___photography_2388657,
            R.drawable.pexels_tubarones_photography_3684892,
            R.drawable.pexels_yasmine_qasem_2034435,
            R.drawable.thomas_schutze_nax_dg5ge0q_unsplash
        )

        val adapter = ViewPagerAdapter(imageList)
        instanceOfViewPager.adapter =adapter

        /**
         * Array of names
         */
        fullNameView = arrayOf(
            "Loretta M. Hawthorne",
            "Lakisha T. Huang",
            "Sarita A. Puckett",
            "Gracious Adebayo",
            "Ann G. Counts",
            "Cathy G. Lanier",
            "Mary T. Jones",
            "Jenna S. Barnette",
            "Martha S. Denis"
        )

        avatarView= arrayOf(
            R.drawable.ali_pazani_b4hzxqfzuoo_unsplash,
            R.drawable.brooke_cagle_otweoxmkdka_unsplash,
            R.drawable.gean_montoya_cedwdchuusk_unsplash,
            R.drawable.gracious_adebayo_sete0gjxc1u_unsplash,
            R.drawable.pexels_polina_tankilevitch_3905906,
            R.drawable.pexels_red_light_films___photography_2388657,
            R.drawable.pexels_tubarones_photography_3684892,
            R.drawable.pexels_yasmine_qasem_2034435,
            R.drawable.thomas_schutze_nax_dg5ge0q_unsplash
        )

        instanceOfRecyclerView = findViewById(R.id.recyclerViewId)
        instanceOfRecyclerView.layoutManager = LinearLayoutManager(this)
        instanceOfRecyclerView.setHasFixedSize(true)

        avatarName= arrayListOf<Avatar>()
        getSingleAvatar()
    }

    private fun getSingleAvatar(){
        for (i in avatarView.indices){
            val name = Avatar(avatarView[i],fullNameView[i])
            avatarName.add(name)
        }
        instanceOfRecyclerView.adapter = Recycle_View_Adapter(avatarName)
    }
}