package com.example.recyclerview_fadila_11

import android.os.Bundle
import android.view.WindowManager
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.details)

        supportActionBar?.hide()
        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)

        val detail = intent.getParcelableExtra<ANIME>(Home.INTENT_PARCELABLE)

        val image = findViewById<ImageView>(R.id.imgdetails)
        val judul = findViewById<TextView>(R.id.detailtitle)
        val date = findViewById<TextView>(R.id.detaildate)

        image.setImageResource(detail?.image!!)
        judul.text = detail.judul
        date.text = detail.date
    }
}
