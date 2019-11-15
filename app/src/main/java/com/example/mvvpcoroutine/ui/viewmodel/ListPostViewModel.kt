package com.example.mvvpcoroutine.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvpcoroutine.data.model.Repo
import com.example.mvvpcoroutine.data.rest.ApiService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ListPostViewModel(private val apiService: ApiService) : ViewModel() {
    val listPost = MutableLiveData<List<Repo>>()
    val loading = MutableLiveData<Boolean>()
    fun getListPost() {
        loading.value = true
        CoroutineScope(Dispatchers.IO).launch {
            val response = apiService.getRepositories()
            withContext(Dispatchers.Main) {
                loading.value = false
                listPost.value = response
            }
        }
    }

}