package com.example.materialstyling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.materialstyling.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onResume() {
        super.onResume()

        val languages = resources.getStringArray(R.array.languages)
        val arrayAdapter = ArrayAdapter(applicationContext,R.layout.dropdown_item,languages)
        binding.autoCompleteTextView.setAdapter(arrayAdapter)
    }


}