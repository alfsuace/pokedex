package com.alfsuace.pokedex.feature.data

import com.alfsuace.pokedex.feature.data.local.PokemonXmlDataSource
import com.alfsuace.pokedex.feature.data.remote.PokemonRemoteApiDataSource
import com.alfsuace.pokedex.feature.domain.Pokemon
import com.alfsuace.pokedex.feature.domain.PokemonRepository

class PokemonDataRepository(
    private val localDataSource: PokemonXmlDataSource,
    private val remoteDataSource: PokemonRemoteApiDataSource
): PokemonRepository {
    override suspend fun getPokemons(): List<Pokemon> {
        val localMons = localDataSource.getPokemons()
        if (localMons.isEmpty()) {
            val remoteMons = remoteDataSource.getAllPokemons()
            //localDataSource.savePokemons(remoteMons)
            //save not done to avoid memory runouts
            return remoteMons
        }else{
            return localMons
        }
    }

    override suspend fun getPokemonById(id: String): Pokemon?{
        val localMons = localDataSource.getPokemon(id)
        if (localMons == null) {
            val remoteMons = remoteDataSource.getPokemonById(id)
            remoteMons?.let {
                localDataSource.savePokemon(it)
            }
            return remoteMons
        }else{
            return localMons
        }

    }

    override fun savePokemons(pokemons: List<Pokemon>) {
        localDataSource.savePokemons(pokemons)
    }

    override fun savePokemon(pokemon: Pokemon) {
        localDataSource.savePokemon(pokemon)
    }
}