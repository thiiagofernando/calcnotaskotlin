package com.example.calculadora

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_calcular =  buttonCalcular
        val resultado = resultado


        btn_calcular.setOnClickListener{
            if(txtnota1.text.isNotEmpty() && txtnota1.text.isNotEmpty() && txtnota1.text.isNotEmpty()){
                val nota1 = Integer.parseInt(txtnota1.text.toString())
                val nota2 = Integer.parseInt(txtnota2.text.toString())
                val faltas = Integer.parseInt(txtfaltas.text.toString())

                val media = (nota1+nota2)/2

                if (media >= 6 && faltas <= 10) {
                    resultado.setText("Aluno Aprovado\n  Nota: $media \n Faltas: $faltas")
                    resultado.setTextColor(Color.GREEN)
                } else {
                    resultado.setText("Aluno Reprovado\n  Nota: $media \n Faltas: $faltas")
                    resultado.setTextColor(Color.RED)
                }
            }else{
                resultado.setText("Por favor preencha todos os campos")
                resultado.setTextColor(Color.RED)
            }
        }
    }
}