package com.example.mvvpcoroutine.di

import com.example.mvvpcoroutine.data.rest.ApiService
import org.koin.dsl.module
import retrofit2.Retrofit

val apiModule = module {
    single(createdAtStart = true) { get<Retrofit>().create(ApiService::class.java) }
}