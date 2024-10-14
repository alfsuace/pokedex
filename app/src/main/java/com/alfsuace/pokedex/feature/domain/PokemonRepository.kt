package com.alfsuace.pokedex.feature.domain

interface PokemonRepository {

    suspend fun getPokemons(): List<Pokemon>
    suspend fun getPokemonById(id: String): Pokemon?
    fun savePokemons (pokemons: List<Pokemon>)
    fun savePokemon (pokemon: Pokemon)

}