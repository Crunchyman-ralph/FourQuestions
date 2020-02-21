package com.ralphkdev.fourquestions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders

class CreateQuestionsActivity : AppCompatActivity() {

    lateinit var questionsView: QuestionsView
    lateinit var viewModel: QuestionsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_questions)

        var date: String? = intent.getStringExtra(DATE)
        viewModel =


    }

    private fun dateFormat(month: String): String {
        val newMonth: String
        when (month) {
            0.toString() -> newMonth = "January"
            1.toString() -> newMonth = "February"
            2.toString() -> newMonth = "March"
            3.toString() -> newMonth = "April"
            4.toString() -> newMonth = "May"
            5.toString() -> newMonth = "June"
            6.toString() -> newMonth = "July"
            7.toString() -> newMonth = "August"
            8.toString() -> newMonth = "September"
            9.toString() -> newMonth = "October"
            10.toString() -> newMonth = "November"
            11.toString() -> newMonth = "December"
            else -> newMonth = "Error"
        }
        return newMonth
    }
}
