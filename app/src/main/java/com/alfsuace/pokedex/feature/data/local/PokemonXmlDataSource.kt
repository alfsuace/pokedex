package com.alfsuace.pokedex.feature.data.local

import android.content.Context
import com.alfsuace.pokedex.R
import com.alfsuace.pokedex.feature.domain.Pokemon
import com.google.gson.Gson

class PokemonXmlDataSource(private val context: Context) {

    private val sharedPref = context.getSharedPreferences(
        context.getString(R.string.name_file_xml),
        Context.MODE_PRIVATE
    )
    private val gson = Gson()

    fun savePokemons(pokemons: List<Pokemon>) {
        val json = gson.toJson(pokemons)
        pokemons.forEach {
            sharedPref.edit().putString(it.id, json).apply()
        }
    }

    fun savePokemon(pokemon: Pokemon) {
        sharedPref.edit().putString(pokemon.id, gson.toJson(pokemon)).apply()
    }

    fun getPokemons(): List<Pokemon> {
        val pokemons = mutableListOf<Pokemon>()
        sharedPref.all.forEach {
            pokemons.add(gson.fromJson(it.value as String, Pokemon::class.java))
        }
        return pokemons
    }

    fun getPokemon(id: String): Pokemon {
        return gson.fromJson(sharedPref.getString(id, ""), Pokemon::class.java)

    }

}