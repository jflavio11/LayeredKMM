package com.jflavio.layeredarch.data

import com.jflavio.layeredarch.domain.Movie

/**
 * MovieRemoteDataSource
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  24/12/2021
 */
actual class MovieRemoteDataSource {
    actual suspend fun getMovies(): List<Movie> {
        throw UnsupportedOperationException()
    }
}