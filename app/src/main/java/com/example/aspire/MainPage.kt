package com.example.aspire

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView


class MainPage : AppCompatActivity() {
    var emptyLike: ImageView? = null
    var is_filled = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page)
        emptyLike = findViewById(R.id.like_empty)
    }
    fun changeToFilledLike(view: View)
    {
        view as ImageView
        if (!is_filled) {
            view.setImageResource(R.drawable.like_empty)
            is_filled = true
        } else {
            view.setImageResource(R.drawable.like_filled)
            is_filled = false
        }
    }
}