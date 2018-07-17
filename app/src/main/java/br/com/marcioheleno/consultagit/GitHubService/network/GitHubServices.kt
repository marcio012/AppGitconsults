package br.com.marcioheleno.consultagit.GitHubService.network

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubServices {


    @GET("users/{user}/repos")
    fun getRepositories(@Path("user") user: String): Call<List<Repository>>
}