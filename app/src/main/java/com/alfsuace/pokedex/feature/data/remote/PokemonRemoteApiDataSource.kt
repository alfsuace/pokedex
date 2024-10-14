package com.alfsuace.pokedex.feature.data.remote

import com.alfsuace.pokedex.feature.domain.Pokemon

class PokemonRemoteApiDataSource(private val pokeApiResource: PokeApiResource) {

    suspend fun getAllPokemons(): List<Pokemon> {
        return pokeApiResource.getAllPokemons().map {
            it.toModel()
        }
    }

    suspend fun getPokemonById(id: String): Pokemon? {
        return pokeApiResource.getPokemonById(id)?.toModel()

    }
}
