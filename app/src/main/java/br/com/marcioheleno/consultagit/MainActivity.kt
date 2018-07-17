package br.com.marcioheleno.consultagit

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import retrofit2.Retrofit
import android.util.Log
import br.com.marcioheleno.consultagit.GitHubService.business.BusinessLogic
import br.com.marcioheleno.consultagit.GitHubService.network.GitHubServices
import br.com.marcioheleno.consultagit.GitHubService.network.Repository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.converter.gson.GsonConverterFactory


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val retrofit = configuraRetroFilt()

//        executaRequisicao(retrofit)

//        val retrofit
//        val businessLogic = BusinessLogic()

    }


}
