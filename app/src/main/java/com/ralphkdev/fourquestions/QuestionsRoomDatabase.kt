package com.ralphkdev.fourquestions

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import java.security.AccessControlContext

@Database(entities = arrayOf(FourQuestions::class), version = 1, exportSchema = false)
public abstract class QuestionsRoomDatabase : RoomDatabase() {
    abstract fun questionsDao(): QuestionsDao

    companion object {

        @Volatile
        private var INSTANCE: QuestionsRoomDatabase? = null

        fun getDatabase(context: Context): QuestionsRoomDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }

            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    QuestionsRoomDatabase::class.java,
                    "questions_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}