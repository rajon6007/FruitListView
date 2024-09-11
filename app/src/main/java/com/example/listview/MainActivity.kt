package com.example.listview

import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    val name = arrayListOf<String>("Watermelon","Banana","strawberry","pomegranate","Apple","allu")
    val desc = arrayListOf(
        "Good for DIHYDRETION",
        "Good for Iron and Calcium deficiency",
        "Good for skin discoloration",
        "Good for new blood cell born",
        "Good for Diabetes",
        "Great for all time"
    )

    val imageId = arrayOf<Int>(
        R.drawable.w,
        R.drawable.b,
        R.drawable.s,
        R.drawable.pomegranate,
        R.drawable.apple,
        R.drawable.allu)
    private val desc00= arrayOf<String>(
        "Quantity: 1",
        "Quantity: 2",
        "Quantity: 2",
        "Quantity: 3",
        "Quantity: 4",
        "Quantity: 1")
    private val desc01= arrayOf<String>(
        "Price: $10",
        "Price: $50",
        "Price: $60",
        "Price: $90",
        "Price: $20",
        "Price: $15")

    private lateinit var listview: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listview =findViewById(R.id.listView)

        val myListAdapter = MyListAdapter(
            this,
            name,
            desc,
            imageId,
            desc00,
            desc01
        )
        listview.adapter = myListAdapter

        listview.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this,"you clicked on " +name[position],Toast.LENGTH_SHORT).show()

        }



    }
}