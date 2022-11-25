/*
 * Copyright 2022 The TensorFlow Authors. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.tensorflow.lite.examples.objectdetection

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.set
import androidx.core.view.isVisible
import androidx.databinding.adapters.TextViewBindingAdapter
import com.google.android.material.dialog.MaterialAlertDialogBuilder

import org.tensorflow.lite.examples.objectdetection.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

           binding.mainBtnCerrar.setOnClickListener{
            finishAffinity()
        }

        binding.mainBtnCrearCuenta.setOnClickListener{
            val intent=Intent(this,CrearCuenta::class.java).apply {  }
            startActivity(intent)
        }

        binding.olvidarPassword.setOnClickListener {
            val intent=Intent(this,RestablecerPassword::class.java).apply {  }
            startActivity(intent)
        }

        binding.mainBtnLogin.setOnClickListener {
            val pass=binding.mainIngresoPassword.text.toString()
            val usu=binding.mainIngresoEmail.text.toString()
            val mapusu= credenciales.containsKey(usu)
            val mapPass= credenciales.get(usu)

            if (mapusu && pass==mapPass ){
                val intent=Intent(this,Home::class.java)
                    .putExtra("Usuario", usu)
                    .putExtra("pass",pass)
                startActivity(intent)
            }else{

                MaterialAlertDialogBuilder(this)
                    .setTitle(resources.getString(R.string.datos_Invalidos))
                    .setMessage(resources.getString(R.string.Espacios_en_blanco))
                    .setPositiveButton("Aceptar"){dialolog,which->
                        binding.mainIngresoEmail.setText("")
                        binding.mainIngresoPassword.setText("")
                        binding.mainIngresoEmail.setHintTextColor(resources.getColor(R.color.rojo))
                        binding.mainIngresoPassword.setHintTextColor(resources.getColor(R.color.rojo))

                    }

                    .show()
            }


        }


    }

}


