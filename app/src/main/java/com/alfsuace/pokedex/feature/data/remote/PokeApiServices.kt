package com.alfsuace.pokedex.feature.data.remote

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface PokeApiServices {

    @GET("")
    suspend fun getAllPokemons(): Response<List<PokemonApiModel>>

    @GET("/{id}")
    suspend fun getPokemonById(@Path("id") id: String): Response<PokemonApiModel>?

}