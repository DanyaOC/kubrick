package edu.itesm.stanley

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Actor(val imagen:Int, val nombre:String, val edad:String, val descripcion:String) :Parcelable