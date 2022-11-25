package org.tensorflow.lite.examples.objectdetection

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import org.tensorflow.lite.examples.objectdetection.databinding.ActivityRestablecerPasswordBinding


class RestablecerPassword : AppCompatActivity() {

    lateinit var binding: ActivityRestablecerPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRestablecerPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.restablecerPassBtnCerrar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).apply { }
            startActivity(intent)
        }
        binding.restablecerPassBtnrestablecer.setOnClickListener {

            val email = binding.restablecerPassEmail.text.toString()
            val pass = binding.restablecerPassNuevoPassword.text.toString()
            val confpass = binding.restablecerPassConfirmarPassword.text.toString()
            val mapemail = credenciales.containsKey(email)

            if (email == "" || pass == "" || confpass == "") {
                MaterialAlertDialogBuilder(this)
                    .setTitle(resources.getString(R.string.datos_Invalidos))
                    .setMessage(resources.getString(R.string.verificar_datos))
                    .setPositiveButton(resources.getString(R.string.Aceptar)) { dialolog, which ->

                    }
                    .show()

            } else if (!mapemail) {
                MaterialAlertDialogBuilder(this)
                    .setTitle(resources.getString(R.string.correo_invalido))
                    .setMessage(resources.getString(R.string.mensaje_correo_invalido))
                    .setPositiveButton(resources.getString(R.string.Confirmar)) { dialolog, which ->
                    }
                    .show()

            } else{
                if (pass == confpass) {
                    // cambia la contraseña
                    credenciales[email] = pass
                    MaterialAlertDialogBuilder(this)
                        .setTitle(resources.getString(R.string.titulo_cambio_contraseña))
                        .setMessage(resources.getString(R.string.cambio_contraseña))
                        .setPositiveButton(resources.getString(R.string.Confirmar)) { dialolog, which ->
                        }
                        .show()

                } else {

                       MaterialAlertDialogBuilder(this)
                        .setTitle(resources.getString(R.string.Titulo_No_coinciden_contraseñas))
                        .setMessage(resources.getString(R.string.mensaje_No_coinciden_contraseñas))
                        .setPositiveButton(resources.getString(R.string.Confirmar)) { dialolog, which ->
                        }
                           .show()
                }
            }



        }
    }
}

