package com.example.githubuser

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class UserAdapter (private val listUser : ArrayList<User>):
    RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    private var buffName = arrayListOf<String>()
    private var buffUsername = arrayListOf<String>()
    private var buffEmail = arrayListOf<String>()
    private var buffPic = arrayListOf<Int>()
    private var buffFollower = arrayListOf<Int>()
    private var buffFollowing = arrayListOf<Int>()
    private var buffComp = arrayListOf<String>()
    private var buffLoc = arrayListOf<String>()
    private var buffIndex = arrayListOf<Int>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return UserViewHolder(view)
    }

    override fun getItemCount(): Int = listUser.size

    override fun onBindViewHolder(holder: UserViewHolder, pos: Int) {
        val user = listUser[pos]

        Glide.with(holder.itemView.context)
            .load(user.photo)
            .into(holder.imgPhoto)

        holder.tvUsername.text = user.username
        holder.tvName.text = user.name
        buffName.add(user.name)
        buffUsername.add(user.username)
        buffEmail.add(user.email)
        buffPic.add(user.photo)
        buffFollower.add(user.follower)
        buffFollowing.add(user.following)
        buffComp.add(user.company)
        buffLoc.add(user.location)
        buffIndex.add(user.index)
    }

    inner class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_name)
        var tvUsername: TextView = itemView.findViewById(R.id.tv_username)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_photo)

        init{
            itemView.setOnClickListener{
                val position: Int = adapterPosition
                var userTransfer= User()
                userTransfer.name = buffName[position]
                userTransfer.username = buffUsername[position]
                userTransfer.photo = buffPic[position]
                userTransfer.email = buffEmail[position]
                userTransfer.follower =buffFollower[position]
                userTransfer.following =buffFollowing[position]
                userTransfer.company =buffComp[position]
                userTransfer.location =buffLoc[position]
                userTransfer.index =buffIndex[position]

                val dataMoved = Intent(itemView.context, DetailActivity::class.java)
                dataMoved.putExtra(DetailActivity.EXTRA, userTransfer)
                itemView.context.startActivity(dataMoved)
            }
        }
    }
}