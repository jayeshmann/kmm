package com.parismeow.kmm.repo

import com.parismeow.kmm.MovieResponse

class MovieRepo {
    suspend fun getPopularMovies(): MovieResponse {
        return getListPopularMovies()
    }
}
