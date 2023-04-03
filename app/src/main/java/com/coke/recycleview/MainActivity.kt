package com.coke.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<News>
    lateinit var ImageId : Array<Int>
    lateinit var heading : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ImageId = arrayOf(
            R.drawable.cocacocala,
            R.drawable.football,
            R.drawable.staduim,
            R.drawable.sudaiz,
            R.drawable.intellectsoft_logo,
            R.drawable.football,
            R.drawable.staduim,
            R.drawable.sudaiz,
            R.drawable.intellectsoft_logo,
            R.drawable.cocacocala,
            R.drawable.football,
            R.drawable.staduim,
            R.drawable.sudaiz,
            R.drawable.intellectsoft_logo,
            R.drawable.football,
            R.drawable.staduim,
            R.drawable.sudaiz,
            R.drawable.intellectsoft_logo,
            R.drawable.cocacocala,
            R.drawable.football,
            R.drawable.staduim,
            R.drawable.sudaiz,
            R.drawable.intellectsoft_logo,
            R.drawable.football,
            R.drawable.staduim,
            R.drawable.sudaiz,
            R.drawable.intellectsoft_logo,
            R.drawable.cocacocala,
            R.drawable.football,
            R.drawable.staduim,
            R.drawable.sudaiz,
            R.drawable.intellectsoft_logo,
            R.drawable.football,
            R.drawable.staduim,
            R.drawable.sudaiz,
            R.drawable.intellectsoft_logo,
            R.drawable.cocacocala,
            R.drawable.football,
            R.drawable.staduim,
            R.drawable.sudaiz,
            R.drawable.intellectsoft_logo,
            R.drawable.football,
            R.drawable.staduim,
            R.drawable.sudaiz,
            R.drawable.intellectsoft_logo,
            R.drawable.cocacocala,
            R.drawable.football,
            R.drawable.staduim,
            R.drawable.sudaiz,
            R.drawable.intellectsoft_logo,
            R.drawable.football,
            R.drawable.staduim,
            R.drawable.sudaiz,
            R.drawable.intellectsoft_logo
        )
        heading= arrayOf(
            "Cocacola Test the feeling of fresh breez in Uganda home of friends",
            "Premier League Championships is planning to Award the five Best players this season",
            "Mandela Stadium Found in south Africa was foun to be the oldest stadium in Africa",
            "Kwemboi Sudaiz is a student at kyambogo university doing computer science in IT",
            "Intellect Soft has been ranked to be one of the fastest growing Software Company",
            "Premier League Championships is planning to Award the five Best players this season",
            "Mandela Stadium Found in south Africa was foun to be the oldest stadium in Africa",
            "Kwemboi Sudaiz is a student at kyambogo university doing computer science in IT",
            "Intellect Soft has been ranked to be one of the fastest growing Software Company",
            "Cocacola Test the feeling of fresh breez in Uganda home of friends",
            "Premier League Championships is planning to Award the five Best players this season",
            "Mandela Stadium Found in south Africa was foun to be the oldest stadium in Africa",
            "Kwemboi Sudaiz is a student at kyambogo university doing computer science in IT",
            "Intellect Soft has been ranked to be one of the fastest growing Software Company",
            "Premier League Championships is planning to Award the five Best players this season",
            "Mandela Stadium Found in south Africa was foun to be the oldest stadium in Africa",
            "Kwemboi Sudaiz is a student at kyambogo university doing computer science in IT",
            "Intellect Soft has been ranked to be one of the fastest growing Software Company",
            "Cocacola Test the feeling of fresh breez in Uganda home of friends",
            "Premier League Championships is planning to Award the five Best players this season",
            "Mandela Stadium Found in south Africa was foun to be the oldest stadium in Africa",
            "Kwemboi Sudaiz is a student at kyambogo university doing computer science in IT",
            "Intellect Soft has been ranked to be one of the fastest growing Software Company",
            "Premier League Championships is planning to Award the five Best players this season",
            "Mandela Stadium Found in south Africa was foun to be the oldest stadium in Africa",
            "Kwemboi Sudaiz is a student at kyambogo university doing computer science in IT",
            "Intellect Soft has been ranked to be one of the fastest growing Software Company",
            "Cocacola Test the feeling of fresh breez in Uganda home of friends",
            "Premier League Championships is planning to Award the five Best players this season",
            "Mandela Stadium Found in south Africa was foun to be the oldest stadium in Africa",
            "Kwemboi Sudaiz is a student at kyambogo university doing computer science in IT",
            "Intellect Soft has been ranked to be one of the fastest growing Software Company",
            "Premier League Championships is planning to Award the five Best players this season",
            "Mandela Stadium Found in south Africa was foun to be the oldest stadium in Africa",
            "Kwemboi Sudaiz is a student at kyambogo university doing computer science in IT",
            "Intellect Soft has been ranked to be one of the fastest growing Software Company",
            "Cocacola Test the feeling of fresh breez in Uganda home of friends",
            "Premier League Championships is planning to Award the five Best players this season",
            "Mandela Stadium Found in south Africa was foun to be the oldest stadium in Africa",
            "Kwemboi Sudaiz is a student at kyambogo university doing computer science in IT",
            "Intellect Soft has been ranked to be one of the fastest growing Software Company",
            "Premier League Championships is planning to Award the five Best players this season",
            "Mandela Stadium Found in south Africa was foun to be the oldest stadium in Africa",
            "Kwemboi Sudaiz is a student at kyambogo university doing computer science in IT",
            "Intellect Soft has been ranked to be one of the fastest growing Software Company",
            "Cocacola Test the feeling of fresh breez in Uganda home of friends",
            "Premier League Championships is planning to Award the five Best players this season",
            "Mandela Stadium Found in south Africa was foun to be the oldest stadium in Africa",
            "Kwemboi Sudaiz is a student at kyambogo university doing computer science in IT",
            "Intellect Soft has been ranked to be one of the fastest growing Software Company",
            "Premier League Championships is planning to Award the five Best players this season",
            "Mandela Stadium Found in south Africa was foun to be the oldest stadium in Africa",
            "Kwemboi Sudaiz is a student at kyambogo university doing computer science in IT",
            "Intellect Soft has been ranked to be one of the fastest growing Software Company"
        )
        newRecyclerView=findViewById(R.id.recycleView)
        newRecyclerView.layoutManager= LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)
        newArrayList= arrayListOf<News>()
        getUserdata()
    }

    private fun getUserdata() {
        for (i in ImageId.indices){
            val news =News(ImageId[i],heading[i])
            newArrayList.add(news)
        }
        newRecyclerView.adapter=MyAdapter(newArrayList)
    }

}