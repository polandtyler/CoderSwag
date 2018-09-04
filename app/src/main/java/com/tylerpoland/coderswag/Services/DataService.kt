package com.tylerpoland.coderswag.Services

import com.tylerpoland.coderswag.Model.Category
import com.tylerpoland.coderswag.Model.Product

object DataService {

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie", "$18.99", "hat1"),
            Product("Devslopes Hat Black", "$21.99", "hat2"),
            Product("Devslopes Hat White", "$21.99", "hat3"),
            Product("Devslopes Hat Snapback", "$14.99", "hat4")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Gray", "$32.99", "hoodie1"),
            Product("Devslopes Hoodie Red", "$32.99", "hoodie2"),
            Product("Devslopes Gray Hoodie", "$32.99", "hoodie3"),
            Product("Devslopes Black Hoodie", "$32.99", "hoodie4")
    )

    val shirts = listOf(
            Product("Devslopes Shirt Gray", "$18.99", "shirt1"),
            Product("Devslopes Shirt Red", "$18.99", "shirt2"),
            Product("Devslopes Gray Shirt", "$18.99", "shirt3"),
            Product("Devslopes Black Shirt", "$18.99", "shirt4"),
            Product("Kickflip Studios", "$15.99", "shirt5")
    )

}