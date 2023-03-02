package com.example.appaula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtNome:EditText = findViewById(R.id.edtNome)
        val edtEnde:EditText = findViewById(R.id.edtEnde)
        val edtBai:EditText = findViewById(R.id.edtBai)
        val edtCe:EditText = findViewById(R.id.edtCe)
        val edtCi:EditText = findViewById(R.id.edtCi)
        val edtEs:EditText = findViewById(R.id.edtEs)
        val btnCadastrar:Button = findViewById(R.id.btnCadastrar)
        btnCadastrar.setOnClickListener {
            val texto:String = edtNome.text.toString() + edtEnde.text.toString() + edtBai.text.toString() + edtCe.text.toString()+ edtCi.text.toString()+ edtEs.text.toString()
            val toast = Toast.makeText(  this,texto, Toast.LENGTH_SHORT)
            toast.show()
        }
    }
}