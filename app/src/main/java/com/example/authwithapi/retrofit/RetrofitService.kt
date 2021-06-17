package com.example.authwithapi.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitService {
    fun getData(): RetrofitRepository {
        return Retrofit.Builder()
            .baseUrl("https://identitytoolkit.googleapis.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create( RetrofitRepository::class.java)
    }
}