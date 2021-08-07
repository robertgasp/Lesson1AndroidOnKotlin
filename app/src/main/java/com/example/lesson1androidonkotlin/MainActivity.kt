package com.example.lesson1androidonkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.lesson1androidonkotlin.R

class MainActivity : AppCompatActivity(), ClickButton {

    private var fragmentManager: FragmentManager = supportFragmentManager
    private var fragment: Fragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragment = fragmentManager.findFragmentById(R.id.conatiner)

        if (fragment == null) {
            fragmentManager.beginTransaction()
                .replace(R.id.conatiner, FirstPage())
                .commit()
        }
    }

    override fun clickButton() {
        fragmentManager.beginTransaction()
            .replace(R.id.container, SecondPage())
            .addToBackStack("toMainScreen")
            .commit()
    }
}


