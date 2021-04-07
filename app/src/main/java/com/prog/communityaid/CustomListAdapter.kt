package com.prog.communityaid

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.TextView


class CustomListAdapter(private val context: Context, private val arrayList: java.util.ArrayList<MyData>) : BaseAdapter() {
    private lateinit var notInfoHead: TextView
    private lateinit var notInfoMsg: TextView
    override fun getCount(): Int {
        return arrayList.size
    }
    override fun getItem(position: Int): Any {
        return position
    }
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {
        var convertView = convertView
        convertView = LayoutInflater.from(context).inflate(R.layout.custom_notification_item, parent, false)
        notInfoHead = convertView.findViewById(R.id.notInfoHead)
        notInfoMsg = convertView.findViewById(R.id.notInfoMsg)
        notInfoHead.text = " " + arrayList[position].num
        notInfoMsg.text = arrayList[position].name
        return convertView
    }
}

class MyData(var num: Int, var name: String, var mobileNumber: String)