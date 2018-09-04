package com.tylerpoland.coderswag.Adapters

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.tylerpoland.coderswag.Model.Category
import com.tylerpoland.coderswag.R

class CategoryAdapter(val context: Context, private val categories: List<Category>): BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View
        val holder: ViewHolder

        // so that we dont create a whole new view every time --
        // not mandatory for list views
        // but necessary for recycler views
        if (convertView == null) {
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holder = ViewHolder()

            holder.categoryImage = categoryView.findViewById(R.id.categoryImage)
            holder.categoryName = categoryView.findViewById(R.id.categoryName)
            categoryView.tag = holder
        } else {
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }

        val category = categories[position]
        val resourceID = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        holder.categoryImage?.setImageResource(resourceID)
        holder.categoryName?.text = category.name

        return categoryView
    }

    // retrieve item associated with item at index (position)
    override fun getItem(position: Int): Any {
        return categories[position]
    }

    // defines unique id for each row
    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }

    private class ViewHolder {
        var categoryImage: ImageView? = null
        var categoryName: TextView? = null


    }
}