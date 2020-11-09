package org.potados.mvvm

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import org.potados.mvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val TAG = "여길좀 봐줘요~!~!!!!"
    private val viewModel: MainViewModel by viewModels()

    // 맨날씀
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)

        with(binding) {
            vm = viewModel
            lifecycleOwner = this@MainActivity
            setContentView(root)
        }

        Log.i(TAG, "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart")
    }

    // 자주씀
    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume")
    }

    // 자주씀
    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop")
    }

    // 가끔?씀
    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy")
    }
}