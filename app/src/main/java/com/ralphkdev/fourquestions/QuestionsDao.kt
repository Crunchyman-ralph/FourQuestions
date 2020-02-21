package com.ralphkdev.fourquestions

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface QuestionsDao {
    @Query("SELECT * from questions ORDER BY date ASC")
    fun getQuestions(): LiveData<List<FourQuestions>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(
        fourQuestions: FourQuestions
    )

    @Query("DELETE FROM questions")
    suspend fun deleteAll()

    @Query("SELECT * FROM questions WHERE date= :date_input")
    fun loadQuestions(date_input: String): LiveData<FourQuestions>
}
