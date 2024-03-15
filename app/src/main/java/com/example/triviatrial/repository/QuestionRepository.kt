package com.example.triviatrial.repository

import com.example.triviatrial.data.DataOrException
import com.example.triviatrial.model.QuestionItem
import com.example.triviatrial.network.QuestionApi
import javax.inject.Inject

class QuestionRepository @Inject constructor(private val api : QuestionApi) {


    private val dataOrException =
        DataOrException<
                ArrayList<QuestionItem>,
                Boolean,
                Exception>()

    suspend fun getAllQuestions() : DataOrException<ArrayList<QuestionItem>, Boolean, Exception>{
        try{
            dataOrException.loading = true
            dataOrException.data = api.getAllQuestions()
            if (dataOrException.data.toString().isNotEmpty()) dataOrException.loading = false

        }catch (e : Exception){
            dataOrException.e = e
        }
        return dataOrException
    }
}