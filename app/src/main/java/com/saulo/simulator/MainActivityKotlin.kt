package com.saulo.simulator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.saulo.simulator.databinding.ActivityMainBinding

class MainActivityKotlin : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // O viewBinding serve para facilitar na codificação recuperando os ids da tela
        //Esse é o modo padrão, em que teríamos que nomear cada elemento com um id
        //setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Teste para verificar o texto alterado
        //binding.tvHello.text = "Teste"

    }
}