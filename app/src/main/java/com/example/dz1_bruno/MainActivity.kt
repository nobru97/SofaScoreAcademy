package com.example.dz1_bruno

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.ToggleButton
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

       /* findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }*/


        val toggleButton: ToggleButton = findViewById(R.id.toggleButton)
        val tv : TextView = findViewById(R.id.textView)
        toggleButton.setOnCheckedChangeListener{ toggleButton, isChecked ->

            toggleButton.setText("Prikazi")

            if(isChecked) {
                tv.visibility= View.VISIBLE
                toggleButton.setText("Sakrij")
            }
            else {
                tv.visibility = View.INVISIBLE
                toggleButton.setText("Prikazi")
            }
        }

    }
}