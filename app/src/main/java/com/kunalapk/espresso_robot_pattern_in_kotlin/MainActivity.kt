package com.kunalapk.espresso_robot_pattern_in_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.kunalapk.espresso_robot_pattern_in_kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val _viewBinder by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(_viewBinder.root)

        _viewBinder.btnLogin.setOnClickListener {
            showError(R.string.missing_fields)
        }
    }


    private fun showError(msg: Int) {
        AlertDialog.Builder(this).apply {
            setMessage(msg)
            setPositiveButton(R.string.ok, null)
            show()
        }
    }

}