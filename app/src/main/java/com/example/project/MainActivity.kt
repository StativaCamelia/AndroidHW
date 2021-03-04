package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var startButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("On create")
    }


    fun onClick(view: View)
    {
        startButton = findViewById(R.id.start_button)
        startButton.text = "Click here"
        val activity =  Intent(this, ListActivity::class.java)
        startActivity(activity)

    }


    override fun onSaveInstanceState(savedInstanceState: Bundle){
        super.onSaveInstanceState(savedInstanceState)
        savedInstanceState.putString("button-text", "Click Here");
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val text = savedInstanceState.getString("button-text")
        startButton = findViewById(R.id.start_button)
        startButton.text = text;
    }

    override fun onStart() {
        super.onStart();
        println("On Start");
    }

    override fun onRestart() {
        super.onRestart();
        println("On Restart");
    }

    override fun onPause() {
        super.onPause();
        println("On Pause");
    }

    override fun onStop() {
        super.onStop();
        println("On Stop")
    }

    override fun onDestroy() {
        super.onDestroy();
        println("On Destroy")
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.activity_menu, menu)
        return true
    }
}