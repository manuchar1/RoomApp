package com.example.roomapp.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "user_table")
data class User(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val picture: String = "https://i.pinimg.com/originals/be/85/f9/be85f9549b5cf7d94bfc6d48bb642a78.jpg",
    val title: String,
    val description: String
): Parcelable