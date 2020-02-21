package com.ralphkdev.fourquestions

import android.content.Intent
import android.os.Bundle
import android.widget.CalendarView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

const val DATE = "DATE"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val calendarView = findViewById<CalendarView>(R.id.calendarView)

        calendarView.setOnDateChangeListener { view, dayOfMonth, month, year ->
            val date = "$dayOfMonth $month $year"
            Toast.makeText(applicationContext, date, Toast.LENGTH_LONG).show()
            val intent = Intent(this, CreateQuestionsActivity::class.java)
            intent.putExtra(DATE, "$dayOfMonth $month $year")
            startActivity(intent)
        }


    }
}
