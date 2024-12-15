package com.example.route

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.widget.Toolbar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.lang.reflect.Array

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        enableEdgeToEdge()
        setContentView(R.layout.x_o_game)
    }
    var num=0
    var arr = ArrayList<String>(listOf("ffgh", "se5h", "seh", "y8;", "e5", "w354", "w34", "iuy", "rt"))
    fun whenclick(view : View){
        if ((view as Button).text==""){

        if (num%2==0)
            (view).text="x"
        else
            (view).text="o"



        when(view.id){
            R.id.button1->arr[0]=view.text.toString()
            R.id.button2->arr[1]=view.text.toString()
            R.id.button3->arr[2]=view.text.toString()
            R.id.button4->arr[3]=view.text.toString()
            R.id.button5->arr[4]=view.text.toString()
            R.id.button6->arr[5]=view.text.toString()
            R.id.button7->arr[6]=view.text.toString()
            R.id.button8->arr[7]=view.text.toString()
            R.id.button9->arr[8]=view.text.toString()
        }
            if (arr[0]==arr[1]&& arr[0]==arr[2] )
                Toast.makeText(this, "success..", Toast.LENGTH_SHORT).show()


            else if (arr[0]==arr[3]&& arr[0]==arr[6] )
                Toast.makeText(this, "success..", Toast.LENGTH_SHORT).show()

            else if (arr[1]==arr[4]&& arr[1]==arr[7] )
                Toast.makeText(this, "success..", Toast.LENGTH_SHORT).show()

            else if (arr[2]==arr[5]&& arr[2]==arr[8] )
                Toast.makeText(this, "success..", Toast.LENGTH_SHORT).show()

            else if (arr[3]==arr[4]&& arr[3]==arr[5] )
                Toast.makeText(this, "success..", Toast.LENGTH_SHORT).show()

            else if (arr[6]==arr[7]&& arr[6]==arr[8] )
                Toast.makeText(this, "success..", Toast.LENGTH_SHORT).show()


            num++
            }

    }

}