package com.ralphkdev.fourquestions

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "questions")
data class FourQuestions(
    @PrimaryKey @ColumnInfo(name = "date")
    val date: String,
    val answerOne: String,
    val answerTwo: String,
    val answerThree: String,
    val answerFour: String
) {
}