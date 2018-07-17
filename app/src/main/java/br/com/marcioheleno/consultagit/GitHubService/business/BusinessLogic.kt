package br.com.marcioheleno.consultagit.GitHubService.business

import android.util.Log
import br.com.marcioheleno.consultagit.GitHubService.network.GitHubApi
import br.com.marcioheleno.consultagit.GitHubService.network.GitHubServices
import br.com.marcioheleno.consultagit.GitHubService.network.Repository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object BusinessLogic {


    private fun configuraRetroFilt(): Retrofit {

        return Retrofit.Builder()
                .baseUrl("https://api.github.com")
                .addConverterFactory(GsonConverterFactory.create())

                .build()
    }

    private fun executaRequisicao(retrofit: Retrofit){

        val gitHubService = retrofit.create(GitHubApi::class.java)
        gitHubService.getRepositories("marcio012").enqueue(object : Callback<List<Repository>> {

            override fun onResponse(call: Call<List<Repository>>?, response: Response<List<Repository>>?) {
                Log.d("TAG", "DEUUUUUU CERTOOOOOO")

                response?.let {

                    if (it.isSuccessful) {
                        response.body()?.let {

                            it.forEach{ repository ->
                                Log.d("TAG", "Respositóriooooooo ${repository.nameUser} foi escrito por ${repository.nomeRepor}" )

                            }
                        }
                    } else {
                        Log.d("TAG", "FALHOU macho" )
                    }
                }

            }

            override fun onFailure(call: Call<List<Repository>>?, t: Throwable?) {
                Log.d("TAG", "FALHOUUUUUUU")
            }

        })
    }



}