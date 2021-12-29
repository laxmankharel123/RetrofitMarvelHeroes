package com.thesimplycoder.retrofitmarvelheroes

import com.google.gson.annotations.SerializedName

class Superhero {

    @SerializedName("superhero_name")
    var superheroName: String = ""

    var name: String = ""
    var photo: String = ""
}