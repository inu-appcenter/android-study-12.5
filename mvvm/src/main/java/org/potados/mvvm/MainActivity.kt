package org.potados.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import kotlinx.android.synthetic.main.activity_main.view.*
import org.potados.mvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)

        with(binding) {
            vm = viewModel
            lifecycleOwner = this@MainActivity
            setContentView(root)
        }
    }
}