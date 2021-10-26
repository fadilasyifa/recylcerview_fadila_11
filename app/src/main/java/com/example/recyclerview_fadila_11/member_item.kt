package com.example.recyclerview_fadila_11

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ANIME (
    val image: Int,
    val judul: String,
    val date: String
        ) : Parcelable