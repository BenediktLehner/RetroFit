package com.example.retrofitexample.data.remote

import com.example.retrofitexample.data.model.Photo
import com.example.retrofitexample.data.model.Todo
import retrofit2.http.GET

interface RichardsApiService {
    @GET("todos")
    suspend fun getTodos(): List<Todo>

    @GET("photos?_start=0&_limit=10") // TODO: make pagination dynamic, not hardcoded
    suspend fun getPhotos(): List<Photo>
}