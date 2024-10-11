package com.alfsuace.pokedex.feature.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PokeApiResource {
    private val urlEndPoint = "https://pokeapi.co/api/v2/pokemon"
    private var apiEndPoint: PokeApiServices

    init {
        apiEndPoint = buildApiEndPoint()
    }

    private fun buildApiEndPoint(): PokeApiServices {
        return Retrofit.Builder()
            .baseUrl(urlEndPoint)
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(PokeApiServices::class.java)
    }

    suspend fun getAllPokemons(): List<PokemonApiModel> {
        return apiEndPoint.getAllPokemons().body() ?: emptyList()
    }
    suspend fun getPokemonById(id: String): PokemonApiModel? {
        return apiEndPoint.getPokemonById(id)?.body()
    }

}