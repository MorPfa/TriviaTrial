package com.example.triviatrial.network

import com.example.triviatrial.model.Question
import retrofit2.http.GET
import javax.inject.Singleton


@Singleton
interface QuestionApi {

    @GET("world.json")
    suspend fun getAllQuestions() :Question

}