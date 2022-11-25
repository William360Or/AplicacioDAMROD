package org.tensorflow.lite.examples.objectdetection

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import org.tensorflow.lite.examples.objectdetection.databinding.ActivityEditarDatosBinding

class EditarDatos : AppCompatActivity() {
    lateinit var binding: ActivityEditarDatosBinding
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityEditarDatosBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val bundle=intent.extras
        val usu=bundle?.getString("Usuario").toString()
        val pass=bundle?.getString("pass").toString()

        binding.editarDatosNombre.setText(nombres.get(usu))
        binding.editarDatosApellido.setText(apellidos.get(usu))
        binding.editarDatosEmail.setText(usu)
        binding.editarDatosPassword.setText(pass)


        binding.editarDatosBtnCerrar.setOnClickListener {
            val Dusu=binding.editarDatosEmail.text.toString()
            val Dpass=binding.editarDatosPassword.text.toString()
            val intent=Intent(this,Home::class.java)
                .putExtra("Usuario", Dusu)
                .putExtra("pass", Dpass)
               startActivity(intent)
        }

        // Editar datos
        binding.editarDatosBtnGuardar.setOnClickListener {
            val nombre = binding.editarDatosNombre.text.toString()
            val apellido = binding.editarDatosApellido.text.toString()
            val email = binding.editarDatosEmail.text.toString()
            val password = binding.editarDatosPassword.text.toString()

            if (nombre == "" || apellido == "" || email == "" || pass == "") {
                MaterialAlertDialogBuilder(this)
                    .setTitle(resources.getString(R.string.datos_Invalidos))
                    .setMessage(resources.getString(R.string.Espacios_en_blanco))
                    .setPositiveButton(resources.getString(R.string.Aceptar)) { dialolog, which ->

                    }
                    .show()

            } else if (!(email == usu)) {
                credenciales.remove(usu)
                nombres.remove(usu)
                apellidos.remove(usu)
                credenciales.set(email, password)
                nombres.set(email, nombre)
                apellidos.set(email, apellido)

                MaterialAlertDialogBuilder(this)
                    .setTitle(resources.getString(R.string.tituloDatosactualizados))
                    .setMessage(resources.getString(R.string.mensajeDatosActualizados))
                    .setPositiveButton(resources.getString(R.string.Aceptar)) { dialolog, which ->

                    }
                    .show()

            } else if (!(nombre == nombres.get(usu))) {
                nombres[usu] = nombre

                if (!(apellido == apellidos.get(usu))) {
                    apellidos[usu] = apellido
                }
                if (!(password == credenciales.get(usu))) {
                    apellidos[usu] = password}

                MaterialAlertDialogBuilder(this)
                    .setTitle(resources.getString(R.string.tituloDatosactualizados))
                    .setMessage(resources.getString(R.string.mensajeDatosActualizados))
                    .setPositiveButton(resources.getString(R.string.Aceptar)) { dialolog, which ->

                    }
                    .show()

            } else{
                MaterialAlertDialogBuilder(this)
                    .setTitle(resources.getString(R.string.tituloDatosactualizados))
                    .setMessage(resources.getString(R.string.mensajeDatosActualizados))
                    .setPositiveButton(resources.getString(R.string.Aceptar)) { dialolog, which ->

                    }
                    .show()
            }


        }

        //eliminar la cuenta

        binding.editarDatosBtnEliminar.setOnClickListener{


            MaterialAlertDialogBuilder(this)
                .setTitle(resources.getString(R.string.Eliminar_cuenta))
                .setMessage(resources.getString(R.string.Mensaje_Eliminar_cuenta))
                .setPositiveButton(resources.getString(R.string.Confirmar)) { dialolog, which ->
                    credenciales.remove(usu)
                    nombres.remove(usu)
                    apellidos.remove(usu)
                    val intent=Intent(this,MainActivity::class.java)
                    startActivity(intent)
                                    }
                .setNegativeButton(resources.getString(R.string.Cancelar)) { dialolog, which ->

                }
                .show()


        }
    }
}