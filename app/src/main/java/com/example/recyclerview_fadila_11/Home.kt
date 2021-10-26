package com.example.recyclerview_fadila_11

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Home : AppCompatActivity() {

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        supportActionBar?.hide()
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        val list = listOf<ANIME>(
            ANIME(
                R.drawable.boruto,
                "Boruto",
                "27 September 2015"
            ),
            ANIME(
                R.drawable.demonslayer,
                "Demon Slayer",
                "06 Januari 2021"
            ),
            ANIME(
                R.drawable.haikyuuu,
                "Haikyu",
                "April 2014"
            ),
            ANIME(
                R.drawable.jujutsu,
                "Jujutsu Kaisen",
                "03 Oktober 2020"
            ),
            ANIME(
                R.drawable.kakegurui,
                "Kakegurui",
                "01 Juli 2017"
            ),
            ANIME(
                R.drawable.naruto,
                "Naruto Shippuden",
                "15 Februari 2007"
            ),
            ANIME(
                R.drawable.tokyorevengers,
                "Tokyo Revengers",
                "11 April 2021"
            ),
            ANIME(
                R.drawable.blackclover,
                "Black Clover",
                "03 Oktober 2017"
            ),
            ANIME(
                R.drawable.hunterxhunter,
                "Hunter x Hunter",
                "02 Oktober 2011"
            ),
            ANIME(
                R.drawable.onepiece,
                "One Piece",
                "29 Oktober 1999"
            )
        )

        val recylerview = findViewById<RecyclerView>(R.id.list)
        recylerview.layoutManager = LinearLayoutManager(this)
        recylerview.setHasFixedSize(true)
        recylerview.adapter = adapter(this, list) {
            val intent = Intent(this, Details::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}