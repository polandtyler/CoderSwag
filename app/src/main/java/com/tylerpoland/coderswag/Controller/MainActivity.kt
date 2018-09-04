package com.tylerpoland.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.tylerpoland.coderswag.Adapters.CategoryAdapter
import com.tylerpoland.coderswag.R
import com.tylerpoland.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)
        categoryListView.adapter = adapter
    }
}
