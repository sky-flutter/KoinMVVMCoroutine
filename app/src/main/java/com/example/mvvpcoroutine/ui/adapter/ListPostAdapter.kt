package com.example.koinmvvmretrofit.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvpcoroutine.R
import com.example.mvvpcoroutine.data.model.Repo
import com.example.mvvpcoroutine.databinding.ItemListPostBinding

class ListPostAdapter : RecyclerView.Adapter<ListPostAdapter.ListViewHolder>() {
    private val listPost = ArrayList<Repo>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_list_post, parent, false)
        return ListViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return listPost.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.binding?.strForks = listPost[position].forks.toString()
        holder.binding?.strStars = listPost[position].stars.toString()
        holder.binding?.strRepoName = listPost[position].name
        holder.binding?.strDescription = listPost[position].description
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = DataBindingUtil.bind<ItemListPostBinding>(itemView)
    }

    fun addPostData(listPost: List<Repo>) {
        this.listPost.addAll(listPost)
        notifyDataSetChanged()
    }

}