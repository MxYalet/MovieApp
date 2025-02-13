package com.moviedb.model.source.local.database.daos

import androidx.lifecycle.LiveData
import androidx.room.*
import com.moviedb.model.source.remote.entity.Genre

@Dao
interface GenreDao {

    @Transaction
    @Query("select * from genres")
    fun getAllGenres(): LiveData<List<Genre>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertAllGenres(genres: List<Genre>)
}