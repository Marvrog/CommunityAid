package com.prog.communityaid

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //window.decorView.systemUiVisibility =  View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()
        setContentView(R.layout.activity_notification)

        val bottomMenu = findViewById<BottomNavigationView>(R.id.bottom_menu)
        bottomMenu.setOnNavigationItemSelectedListener {
            if(it.isEnabled){
                //Make it set the icon to either same one but with maybe black color
//                    val itemId = it.itemId
//                if (itemId == R.id.home){
//                    it.icon = resources.getDrawable(android.R.drawable.ic_input_add)
//                }else if (itemId == R.id.post){
//                    it.icon = resources.getDrawable(android.R.drawable.ic_btn_speak_now)
//                } else if (itemId == R.id.settings){
//                        it.icon = resources.getDrawable(android.R.drawable.ic_delete)
//                }
                Toast.makeText(this, "${it.itemId} Clicked", Toast.LENGTH_SHORT).show()
//
            }
            true
        }
    }
}