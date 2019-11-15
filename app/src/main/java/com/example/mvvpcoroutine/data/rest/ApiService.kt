package com.example.mvvpcoroutine.data.rest

import com.example.mvvpcoroutine.data.model.Repo
import retrofit2.http.GET

interface ApiService {
    @GET("orgs/Google/repos")
    suspend fun getRepositories(): List<Repo>
}