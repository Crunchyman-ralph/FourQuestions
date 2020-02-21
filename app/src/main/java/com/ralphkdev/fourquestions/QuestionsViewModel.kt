package com.ralphkdev.fourquestions

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class QuestionsViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: QuestionsRepository
    val allquestions: LiveData<List<FourQuestions>>

    init {
        val questionsDao = QuestionsRoomDatabase.getDatabase(application).questionsDao()
        repository = QuestionsRepository(questionsDao)
        allquestions = repository.allQuestions
    }

    fun insert(questions: FourQuestions) = viewModelScope.launch {
        repository.insert(questions)
    }
}