package com.ralphkdev.fourquestions

import android.os.Bundle
import android.widget.CalendarView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calendarView = findViewById<CalendarView>(R.id.calendarView)

        calendarView.setOnDateChangeListener { view, dayOfMonth, month, year ->
            var date = "$dayOfMonth $month $year"
            Toast.makeText(applicationContext, date, Toast.LENGTH_LONG).show()
        }


    }
}
