package com.sketch.goodrecipes.page

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.sketch.goodrecipes.R
import com.sketch.goodrecipes.component.BasicPage

class SplashPage : BasicPage() {

    override val layoutRes: Int = R.layout.activity_splash_page

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}