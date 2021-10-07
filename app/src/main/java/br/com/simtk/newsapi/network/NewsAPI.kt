package br.com.simtk.newsapi.network

import retrofit2.http.Query

interface NewsAPI {

    suspend fun getBreakingNews(
        @Query("country") countryCode: String,

    )
}