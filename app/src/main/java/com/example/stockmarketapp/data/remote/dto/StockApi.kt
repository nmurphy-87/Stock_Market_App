package com.example.stockmarketapp.data.remote.dto

import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query

interface StockApi {

    @GET("query?function=LISTING_STATUS")
    suspend fun getListings(
        @Query("apikey") apiKey : String
    ): ResponseBody

    companion object {
        const val API_KEY = "SQHFFW5ZD6L7N6JH"
        const val BASE_URL = "https://alphavantage.co"
    }
}