package co.edu.uan.android.biggernumber0811

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import co.edu.uan.android.biggernumber0811.databinding.ActivityMainBinding
import kotlin.random.Random

// actividad: pantalla de la aplicacion

class MainActivity : AppCompatActivity() {

    var leftNumber: Int = 0
    var rightNumber: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // layout: un archivo xml que contiene la definicion del UI

        asignarValoresAleatorios()

        val bl = binding.buttonLeft
        val br = binding.buttonRight


        br.setOnClickListener {
            validarSeleccion(rightNumber, leftNumber)
        }

        bl.setOnClickListener {
            validarSeleccion(leftNumber, rightNumber)
        }


    }

    fun validarSeleccion(numeroGrande: Int, numeroPequeno: Int) {
        println("numero grande: $numeroGrande, numero pequeno $numeroPequeno")
        val tv = findViewById<TextView>(R.id.textResult)
        if(numeroGrande>numeroPequeno) {
            Toast.makeText(this, "Has ganado!", Toast.LENGTH_LONG).show()
            tv.text = "Has ganado!"
        } else {
            Toast.makeText(this, "Has perdido", Toast.LENGTH_LONG).show()
            tv.text = "Has perdido :("
        }
        asignarValoresAleatorios()
    }
    fun asignarValoresAleatorios() {
        leftNumber = Random.nextInt(0,100)
        rightNumber = (0..100).random()
    }
}
