package com.example.githubuser

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RepositoryAdapter(private val listRepo : ArrayList<Repository>):
    RecyclerView.Adapter<RepositoryAdapter.RepositoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepositoryViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_repository, parent, false)
        return RepositoryViewHolder(view)
    }

    override fun getItemCount(): Int = listRepo.size

    override fun onBindViewHolder(holder: RepositoryViewHolder, pos: Int) {
        val repo = listRepo[pos]
        holder.tvTitle.text = repo.title
        holder.tvDesc.text = repo.description
    }

    inner class RepositoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvTitle: TextView = itemView.findViewById(R.id.tv_repo_title)
        var tvDesc: TextView = itemView.findViewById(R.id.tv_repo_desc)
    }
}