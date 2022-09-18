package com.example.herokey.Ui
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.herokey.R
import com.example.herokey.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        //Hiển thị ToolBar
            myToolbarHeroKey()



        setContentView(binding.root)
    }

    private fun myToolbarHeroKey(){
        lateinit var mytoolbar: Toolbar
        mytoolbar = binding.toolBarHeroKey
        setSupportActionBar(mytoolbar)
    }
}