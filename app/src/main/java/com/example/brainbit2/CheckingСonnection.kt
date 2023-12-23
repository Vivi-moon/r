package com.example.brainbit2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class CheckingСonnection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checking_connection)
        Check()
        val buttonNext = findViewById<Button>(R.id.buttonNext)
        buttonNext.setOnClickListener {
            val intent = Intent(this@CheckingСonnection, CheckingСonnection::class.java)
            startActivity(intent)
            finish()
        }

    }

    fun Check(): Boolean{
        val buttonNext = findViewById<Button>(R.id.buttonNext)
        val ImageSensor1 = findViewById<ImageView>(R.id.imageSensor1)
        val ImageSensor2 = findViewById<ImageView>(R.id.imageSensor2)
        val ImageSensor3 = findViewById<ImageView>(R.id.imageSensor3)
        val ImageSensor4 = findViewById<ImageView>(R.id.imageSensor4)

        var imageSensor = arrayOf(ImageSensor1, ImageSensor2, ImageSensor3, ImageSensor4)
        var sensor= arrayOf(true, true, true, true)

        for (n in 0..3){
            if(sensor[n]){
                imageSensor[n].setImageResource(R.drawable.plus)
            }else{
                imageSensor[n].setImageResource(R.drawable.minus)
            }
        }

        if(sensor[0]==sensor[1]==sensor[2]==sensor[3]==true){
            buttonNext.visibility = View.VISIBLE
            return true
        }
        return false
    }
}