package com.prog.communityaid

import android.annotation.SuppressLint
import android.graphics.drawable.Icon
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

//    var arrayList: ArrayList<MyData> = ArrayList()


//    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //window.decorView.systemUiVisibility =  View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()
        setContentView(R.layout.activity_profile)

//    val post = findViewById<Icon>(R.id.post)

//        val data = arrayOf("Prog")
//
//        val notList = findViewById<ListView>(R.id.notList)
////        val inflater: LayoutInflater = LayoutInflater.from(this)
////        inflater.inflate(R.layout.custom_notification_item,notList,false)
//        arrayList.add(MyData(1, " Mashu", "987576443"))
//        arrayList.add(MyData(2, " Azhar", "8787576768"))
//        arrayList.add(MyData(3, " Niyaz", "65757657657"))
//        val adapter = CustomListAdapter(this, arrayList)
////        val adapter = ArrayAdapter<String>(this, R.layout.custom_notification_item,data)
//        notList.adapter = adapter
//
//        val bottomMenu = findViewById<BottomNavigationView>(R.id.bottom_menu)
//        bottomMenu.setOnNavigationItemSelectedListener {
//            if(it.isEnabled){
//                //Make it set the icon to either same one but with maybe black color
////                    val itemId = it.itemId
////                if (itemId == R.id.home){
////                    it.icon = resources.getDrawable(android.R.drawable.ic_input_add)
////                }else if (itemId == R.id.post){
////                    it.icon = resources.getDrawable(android.R.drawable.ic_btn_speak_now)
////                } else if (itemId == R.id.settings){
////                        it.icon = resources.getDrawable(android.R.drawable.ic_delete)
////                }
//                Toast.makeText(this, "${it.itemId} Clicked", Toast.LENGTH_SHORT).show()
////
//            }
//            true
//        }
    }
}