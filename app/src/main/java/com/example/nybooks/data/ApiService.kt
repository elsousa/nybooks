package com.example.nybooks.data

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object ApiService {
    private fun initRetrofit(): Retrofit {

        // toda rota no final deve terminar com /
        // .baseUrl("https://api.nytimes.com/svc/books/v3") <- esse linha tava assim, ai quebra

        return Retrofit.Builder()
            .baseUrl("https://api.nytimes.com/svc/books/v3/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }

    val service: NYServices = initRetrofit().create(NYServices::class.java)
}