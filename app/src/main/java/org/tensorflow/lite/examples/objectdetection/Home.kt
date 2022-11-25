package org.tensorflow.lite.examples.objectdetection

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import org.tensorflow.lite.examples.objectdetection.databinding.ActivityHomeBinding

class Home : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle=intent.extras
        val usu=bundle?.getString("Usuario")
        val pass=bundle?.getString("pass")


        binding.homeBtnCerrar.setOnClickListener{
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        binding.homeAbrirCamara.setOnClickListener{
            val intent= Intent(this,Camara::class.java)
            startActivity(intent)
        }

        binding.homeConfiguracion.setOnClickListener {
            val intent=Intent(this,EditarDatos::class.java)
                .putExtra("Usuario",usu)
                .putExtra("pass",pass)
            startActivity(intent)
        }
    }

}