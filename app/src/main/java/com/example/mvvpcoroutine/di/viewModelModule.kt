package com.example.mvvpcoroutine.di

import com.example.mvvpcoroutine.ui.viewmodel.ListPostViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { ListPostViewModel(get()) }
}