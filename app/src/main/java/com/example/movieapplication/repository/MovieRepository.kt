package com.example.movieapplication.repository

import com.example.movieapplication.data.GetMoviesResponse
import com.example.movieapplication.utils.ApiStatus
import kotlinx.coroutines.flow.Flow

interface MovieRepository {
    suspend fun getMoviesList(page: Int) : Flow<ApiStatus<GetMoviesResponse>>
}