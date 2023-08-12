package co.edu.uan.android.biggernumber0811

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlin.random.Random

// actividad: pantalla de la aplicacion

class MainActivity : AppCompatActivity() {

    var leftNumber: Int = Random.nextInt(0,100)
    var rightNumber: Int = (0..100).random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // layout: un archivo xml que contiene la definicion del UI

        val bl = findViewById<Button>(R.id.buttonLeft)
        val br = findViewById(R.id.buttonRight) as Button

        br.setOnClickListener {
            if(rightNumber>leftNumber) {
                Toast.makeText(this, "Has ganado!", Toast.LENGTH_LONG).show()
                println("Has ganado!")
            } else {
                Toast.makeText(this, "Has perdido", Toast.LENGTH_LONG).show()
                println("Has perdido :(")
            }
            leftNumber = Random.nextInt(0,100)
            rightNumber = (0..100).random()

        }

        bl.setOnClickListener {
            if(rightNumber<leftNumber) {
                Toast.makeText(this, "Has ganado!", Toast.LENGTH_LONG).show()
                println("Has ganado!")
            } else {
                Toast.makeText(this, "Has perdido", Toast.LENGTH_LONG).show()
                println("Has perdido :(")
            }
            leftNumber = Random.nextInt(0,100)
            rightNumber = (0..100).random()
        }
    }
}
