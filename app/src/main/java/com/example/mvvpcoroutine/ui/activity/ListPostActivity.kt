package com.example.mvvpcoroutine.ui.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.koinmvvmretrofit.ui.ListPostAdapter
import com.example.mvvpcoroutine.R
import com.example.mvvpcoroutine.databinding.ActivityMainBinding
import com.example.mvvpcoroutine.ui.viewmodel.ListPostViewModel
import org.koin.android.viewmodel.ext.android.viewModel

class ListPostActivity : AppCompatActivity() {
    private val postViewModel: ListPostViewModel by viewModel()
    lateinit var mBinding: ActivityMainBinding
    lateinit var adapter: ListPostAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        adapter = ListPostAdapter()
        mBinding.rvPost.layoutManager = LinearLayoutManager(this)
        mBinding.rvPost.adapter = adapter
        postViewModel.getListPost()
        postViewModel.listPost.observe(this@ListPostActivity, Observer {
            adapter.addPostData(it)
        })
        postViewModel.loading.observe(this, Observer {
            if (it) {
                mBinding.pbLoading.visibility = View.VISIBLE
            } else {
                mBinding.pbLoading.visibility = View.GONE
            }
        })

    }
}
