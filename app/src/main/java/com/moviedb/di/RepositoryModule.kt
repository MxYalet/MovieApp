package com.moviedb.di

import com.moviedb.model.repository.MovieRepository
import com.moviedb.model.repository.MovieRepositoryImpl
import com.moviedb.model.source.local.database.MoviesDatabase
import com.moviedb.model.source.remote.service.MovieApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideMovieRepository(movieApi: MovieApi, moviesDatabase: MoviesDatabase) : MovieRepository {
        return MovieRepositoryImpl(movieApi = movieApi, moviesDatabase = moviesDatabase)
    }

}