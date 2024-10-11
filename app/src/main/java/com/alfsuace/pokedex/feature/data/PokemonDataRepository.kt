package com.alfsuace.pokedex.feature.data

import com.alfsuace.pokedex.feature.data.local.PokemonXmlDataSource
import com.alfsuace.pokedex.feature.data.remote.PokemonRemoteApiDataSource
import com.alfsuace.pokedex.feature.domain.Pokemon
import com.alfsuace.pokedex.feature.domain.PokemonRepository

class PokemonDataRepository(
    private val localDataSource: PokemonXmlDataSource,
    private val remoteDataSource: PokemonRemoteApiDataSource
): PokemonRepository {
    override fun getPokemons(): List<Pokemon> {
        TODO("Not yet implemented")
    }

    override fun getPokemon(id: Int): Pokemon {
        TODO("Not yet implemented")
    }

    override fun savePokemons(pokemons: List<Pokemon>) {
        TODO("Not yet implemented")
    }

    override fun savePokemon(pokemon: Pokemon) {
        TODO("Not yet implemented")
    }
}