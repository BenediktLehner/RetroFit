package com.example.retrofitexample.data.remote

import com.example.retrofitexample.data.model.Todo
import retrofit2.http.GET

interface TodoApiService {
    @GET("todos")
    suspend fun getTodos(): List<Todo>
}