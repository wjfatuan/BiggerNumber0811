package co.edu.uan.android.biggernumber0811

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

// actividad: pantalla de la aplicacion

class MainActivity : AppCompatActivity() {

    val leftNumber: Int = 10 // val es una variable que no puede mutar
    val rightNumber: Int = 5  // var es una variable que si puede mutar

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
        }

        bl.setOnClickListener {
            if(rightNumber<leftNumber) {
                Toast.makeText(this, "Has ganado!", Toast.LENGTH_LONG).show()
                println("Has ganado!")
            } else {
                Toast.makeText(this, "Has perdido", Toast.LENGTH_LONG).show()
                println("Has perdido :(")
            }
        }
    }
}
