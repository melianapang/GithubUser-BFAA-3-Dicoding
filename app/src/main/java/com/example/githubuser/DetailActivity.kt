package com.example.githubuser

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.githubuser.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    companion object {
        const val EXTRA = "extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val user = intent.getParcelableExtra<User>(EXTRA)
        with(binding){
            tvUsername.text = user?.username
            tvName.text = user?.name
            tvEmail.text = user?.email
            tvFollowers.text = user?.follower.toString() + resources.getString(R.string.followers)
            tvFollowing.text = user?.following.toString() + resources.getString(R.string.followers)
            tvCompany.text = user?.company
            tvLocation.text = user?.location
        }

        Glide.with(this)
                .load(user?.photo)
                .into(binding.imgMyphoto)

        showRecyclerListRepository(user?.index?:0)
    }

    private fun showRecyclerListRepository(positionIndex: Int = 0) {
        RepositoriesData.pos = positionIndex
        val mLayoutManager = LinearLayoutManager(this)
        binding.rvRepository.layoutManager = mLayoutManager
        val repoAdapter = RepositoryAdapter(RepositoriesData.listData)
        binding.rvRepository.adapter = repoAdapter
    }
}
