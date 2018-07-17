package br.com.marcioheleno.consultagit.GitHubService.database

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class DataBase: RealmObject() {

    @PrimaryKey var id: Long = 0
    var nome: String? = null
    var email: String? = null
}