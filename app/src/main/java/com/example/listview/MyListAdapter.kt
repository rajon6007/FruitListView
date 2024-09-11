package com.example.listview

import android.annotation.SuppressLint
import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class MyListAdapter(
    private val context: Activity,
    private val name: ArrayList<String>,
    private val description: ArrayList<String>,
    private val image: Array<Int>,
    private val description0: Array<String>,
    private val description1: Array<String>
):ArrayAdapter<String>(context,R.layout.item_layout,name) {
    @SuppressLint("ViewHolder", "InflateParams")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.item_layout, null, true)

        val nameTxt = rowView.findViewById<TextView>(R.id.name)
        val descriptionTxt = rowView.findViewById<TextView>(R.id.desc)
        val profileImage = rowView.findViewById<CircleImageView>(R.id.circleImageView)
        val descriptionTxt00 = rowView.findViewById<TextView>(R.id.desc00)
        val descriptionTxt01 = rowView.findViewById<TextView>(R.id.desc01)

        nameTxt.text = name[position]
        descriptionTxt.text = description[position]
        profileImage.setImageResource(image[position])
        descriptionTxt00.text = description0[position]
        descriptionTxt01.text = description1[position]

        return rowView
    }
}



