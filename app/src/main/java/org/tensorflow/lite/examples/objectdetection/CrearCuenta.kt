package org.tensorflow.lite.examples.objectdetection

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import org.tensorflow.lite.examples.objectdetection.databinding.ActivityCrearCuentaBinding

class CrearCuenta : AppCompatActivity() {

    lateinit var binding: ActivityCrearCuentaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCrearCuentaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.crearCuentaBtnCerrar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).apply { }
            startActivity(intent)
        }

        binding.crearcuentaBtnCrearCuenta.setOnClickListener {
            val nombre = binding.crearcuentaNombre.text.toString()
            val apellido = binding.crearcuentaApellidos.text.toString()
            val email = binding.crearcuentaEmail.text.toString()
            val password = binding.crearcuentaPassword.text.toString()

            if (nombre == "" || apellido == "" || email == "" || password == "") {
                MaterialAlertDialogBuilder(this)
                    .setTitle(resources.getString(R.string.datos_Invalidos))
                    .setMessage(resources.getString(R.string.verificar_datos))
                    .setPositiveButton(resources.getString(R.string.Aceptar)) { dialolog, which ->

                    }
                    .show()
            } else {
                credenciales.set(email, password)
                nombres.set(email, nombre)
                apellidos.set(email, apellido)

                MaterialAlertDialogBuilder(this)
                    .setTitle(resources.getString(R.string.titulo_cuentaCreda))
                    .setMessage(resources.getString(R.string.mensaje_cuentaCreada))
                    .setPositiveButton(resources.getString(R.string.Aceptar)) { dialolog, which ->

                    }
                    .show()
            }
        }
    }
}



