package com.example.androidproject

import java.io.Serializable

data class AnimalData (var aImage: Int, var aName:String, var aType:String,
                       var aposition:String, var aDescription:String, var visibility:Int):Serializable{
}