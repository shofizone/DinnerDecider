package com.shofiul.dinnerdecider.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val foodList = arrayListOf("Chines","Hamburger","Pizza","McDonalds","Itelian Pizza")

        textViewSelectedFood.text = "Burger King"

        buttonDecide.setOnClickListener {
                val random = Random()
                val randomFood = random.nextInt(foodList.count())
                textViewSelectedFood.text = foodList[randomFood]
        }


        buttonAdd.setOnClickListener {


            if (!editTextAddFood.text.toString().isEmpty()){

                val newFood = editTextAddFood.text.toString()
                foodList.add(newFood)
                editTextAddFood.text.clear()
            }else{
                Toast.makeText(this@MainActivity,"Please enter a Text",Toast.LENGTH_LONG).show()
            }


        }


    }




}
