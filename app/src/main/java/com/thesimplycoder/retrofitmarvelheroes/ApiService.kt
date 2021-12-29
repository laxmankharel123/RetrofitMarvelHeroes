package com.thesimplycoder.retrofitmarvelheroes

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("marvel-heroes")
    fun listHeroes(): Call<ResponseData<List<Superhero>>>

}