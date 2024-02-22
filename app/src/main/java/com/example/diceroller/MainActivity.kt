package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttono: Button = findViewById(R.id.btn)

        buttono.setOnClickListener {
            Toast.makeText(this, "You clicked this button", Toast.LENGTH_SHORT).show()
            rollDice() // we call the function hence they displaying this line//
        }
    }

    private fun rollDice() {
        // Use findViewById with correct resource ID for the text view
       // val resultText: TextView = findViewById(R.id.txtview)

        // Generate random number between 1 and 6 (inclusive)
     //   val randomInt = Random.nextInt(1, 7)


       val drawableresource = when(Random.nextInt(1,6))
        {
            1-> R.drawable.one
            2-> R.drawable.two
            3-> R.drawable.three
            4->R.drawable.four
            5->R.drawable.five

            else->R.drawable.sixe
        }

        val diceImage : ImageView = findViewById(R.id.dice_image)
        diceImage.setImageResource(drawableresource)

        // the use of the setImageResource we can set the image by the using setImageResource //

       // resultText.text = randomInt.toString()  // by the using of this we can print random numbers and also print his 1 to 7 numbers randomly


        //  resulttext.text="Dice Roll"  //by the using this method we will create text means they will display the text when we click on the button //
    }
}