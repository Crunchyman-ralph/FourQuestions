package com.ralphkdev.fourquestions

import androidx.lifecycle.LiveData

class QuestionsRepository(private val questionsDao: QuestionsDao) {

    val allQuestions: LiveData<List<FourQuestions>> = questionsDao.getQuestions()

    suspend fun insert(question: FourQuestions) {
        questionsDao.insert(question)
    }

    suspend fun loadQuestions(question: FourQuestions): LiveData<FourQuestions> {
        return questionsDao.loadQuestions(question.date)
    }
}