package com.example.recyclerview_fadila_11

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Switch
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class adapter (private val context: Context, private val anime: List<ANIME>, val listener: (ANIME) -> Unit)
    : RecyclerView.Adapter<adapter.ViewHolderTask>() {
    class ViewHolderTask (view: View): RecyclerView.ViewHolder (view) {

        val Image = view.findViewById<ImageView>(R.id.img)
        val Judul = view.findViewById<TextView>(R.id.judul)
        val Date = view.findViewById<TextView>(R.id.date)

        fun bindView(anime: ANIME, listener: (ANIME) -> Unit) {
            Image.setImageResource(anime.image)
            Judul.text = anime.judul
            Date.text = anime.date
            itemView.setOnClickListener{listener(anime)}
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderTask {
        return ViewHolderTask(
            LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolderTask, position: Int) {
        holder.bindView(anime[position], listener)
    }

    override fun getItemCount(): Int = anime.size
}

private fun Switch.setSwitchTypeface(switchButton: Int) {

}