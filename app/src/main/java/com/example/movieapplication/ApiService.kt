package com.example.movieapplication

import com.example.movieapplication.utils.Constants.API_KEY
import com.example.movieapplication.data.GetMoviesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

//    @GET("movie/popular")
//    fun getPopularMovies(
//        @Query("api_key") api_key : String = API_KEY,
//        @Query("page") page : Int
//    ) : Call<GetMoviesResponse>

    @GET("movie/popular")
    suspend fun getMovies(
        @Query("api_key") api_key : String = API_KEY,
        @Query("page") page : Int
    ) : GetMoviesResponse
}