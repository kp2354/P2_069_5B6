package com.krish.p2_069_5b6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.coordinatorlayout.widget.CoordinatorLayout


class MainActivity : AppCompatActivity() {
    val TAG="MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    override fun onStart(){
       super.onStart()
        displayMessage("OnStart")
        showSnackbar()
    }

    override fun onResume() {
        super.onResume()
        displayMessage("OnResume")

    }

    override fun onPause() {
        super.onPause()
        displayMessage("OnPause")

    }

    override fun onStop() {
        super.onStop()
        displayMessage("Onstop")

    }

    override fun onDestroy() {
        super.onDestroy()
        displayMessage("OnDestroy")

    }

    fun displayMessage(msg:String){
        Toast.makeText(this,"This is a $msg", Toast.LENGTH_LONG).show()
        Log.i(TAG,"$msg" + "is called")

//hello

    }
    private fun showSnackbar() {
        val myCoordinatorLayout = findViewById<CoordinatorLayout>(R.id.myCoordinatorLayout)
        Snackbar.make(myCoordinatorLayout, R.string.email_sent, Snackbar.LENGTH_SHORT).show()
    }
}