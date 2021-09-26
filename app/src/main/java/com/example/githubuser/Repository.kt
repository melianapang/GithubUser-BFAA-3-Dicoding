package com.example.githubuser

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Repository(
    var title: String = "",
    var description: String = ""
) : Parcelable
