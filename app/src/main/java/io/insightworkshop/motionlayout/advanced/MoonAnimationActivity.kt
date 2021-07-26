package io.insightworkshop.motionlayout.advanced

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.insightworkshop.motionlayout.R
import io.insightworkshop.motionlayout.databinding.ActivityMoonAnimationBinding

class MoonAnimationActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMoonAnimationBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }
}