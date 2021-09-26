package com.example.githubuser

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User (
    var index:Int = 0,
    var name :String ="",
    var username :String ="",
    var photo:Int =0,
    var email : String = "",
    var follower:Int = 0,
    var following:Int = 0,
    var company:String = "",
    var location:String = ""
) : Parcelable