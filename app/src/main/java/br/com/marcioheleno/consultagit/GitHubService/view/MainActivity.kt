package br.com.marcioheleno.consultagit.GitHubService.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import br.com.marcioheleno.consultagit.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nome = idPesquisa.text.toString()
        Log.d("NOME", "{$nome}")
//        val nomeToString = nome.toString()
//        buscarRepositorio(nomeToString)
    }

}
