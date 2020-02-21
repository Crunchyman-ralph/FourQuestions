package com.ralphkdev.fourquestions

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class QuestionsAdapter internal constructor(
    context: Context
): RecyclerView.Adapter<QuestionsAdapter.QuestionViewHolder(){

    private val inflater: LayoutInflater = LayoutInflater.from(context)
    private var questions = emptyList<FourQuestions>()

    inner class QuestionViewHoldder(itemView: View): RecyclerView.ViewHolder(itemView){
        val questionItemView: TextView = itemView.findViewById(R.id.)
    }
}