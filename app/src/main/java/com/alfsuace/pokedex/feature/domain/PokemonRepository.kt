package com.alfsuace.pokedex.feature.domain

interface PokemonRepository {

    fun getPokemons(): List<Pokemon>
    fun getPokemon(id: Int): Pokemon
    fun savePokemons (pokemons: List<Pokemon>)
    fun savePokemon (pokemon: Pokemon)

}