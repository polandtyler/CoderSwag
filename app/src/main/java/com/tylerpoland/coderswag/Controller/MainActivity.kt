package com.tylerpoland.coderswag.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.tylerpoland.coderswag.Adapters.CategoryRecycleAdapter
import com.tylerpoland.coderswag.R
import com.tylerpoland.coderswag.Services.DataService
import com.tylerpoland.coderswag.Utils.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // wont work for recycler views
//        categoryListView.setOnItemClickListener { parent, view, position, id ->
//            val category =  DataService.categories[position]
//            Toast.makeText(this, "You clicked on the ${category.name} cell.", Toast.LENGTH_SHORT).show()
//        }

        adapter = CategoryRecycleAdapter(this, DataService.categories) { category ->
            val productIntent = Intent(this, ProductsActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY, category.name)
            startActivity(productIntent)
        }
        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)
    }
}
