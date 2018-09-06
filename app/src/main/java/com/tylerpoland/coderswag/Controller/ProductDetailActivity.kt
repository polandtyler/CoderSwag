package com.tylerpoland.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.tylerpoland.coderswag.Model.Product
import com.tylerpoland.coderswag.R
import com.tylerpoland.coderswag.Utils.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product_detail.*

class ProductDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)
        val product = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)

        val resourceID = resources.getIdentifier(product.image, "drawable", packageName)
        productImage.setImageResource(resourceID)
        productName.text = product.title
        productPrice.text = product.price


    }
}
