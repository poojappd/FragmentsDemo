package com.example.fragmentsdemo

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var stackCountDisplayText: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        stackCountDisplayText = findViewById(R.id.stackCount)



        supportFragmentManager.addOnBackStackChangedListener {

                Log.e(TAG, "Stack change")


        }
    }
        fun frag1OnClick(view: View) {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainer, StaticFragment())
                addToBackStack("someName?")
                commit()
            }

        }

        fun frag2OnCLick(view: View) {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainer, BlankFragment2())
                //
                //addToBackStack("someName?")

                commit()
            }
        }

    override fun onBackPressed() {
        Log.e(TAG, "<< Back")


    }


    }
