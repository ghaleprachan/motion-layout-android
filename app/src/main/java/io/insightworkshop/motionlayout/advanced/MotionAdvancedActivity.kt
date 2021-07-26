package io.insightworkshop.motionlayout.advanced

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.insightworkshop.motionlayout.R
import io.insightworkshop.motionlayout.databinding.ActivityMotionAdvancedBinding

class MotionAdvancedActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMotionAdvancedBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews() {

    }
}