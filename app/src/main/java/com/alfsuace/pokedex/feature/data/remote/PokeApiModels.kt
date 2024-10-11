package com.alfsuace.pokedex.feature.data.remote

import com.google.gson.annotations.SerializedName

data class PokemonApiModel(
    @SerializedName("abilities") val abilities: List<AbilitySlotApiModel>,
    @SerializedName("base_experience") val baseExperience: Int,
    @SerializedName("cries") val cries: CriesApiModel,
    @SerializedName("forms") val forms: List<FormApiModel>,
    @SerializedName("game_indices") val gameIndices: List<GameIndexApiModel>,
    @SerializedName("height") val height: Int,
    @SerializedName("held_items") val heldItems: List<String>?,
    @SerializedName("id") val id: String,
    @SerializedName("is_default") val isDefault: Boolean,
    @SerializedName("location_area_encounters") val locationAreaEncounters: String,
    @SerializedName("moves") val moves: List<MoveApiModel>,
    @SerializedName("name") val name: String,
    @SerializedName("order") val order: Int,
    @SerializedName("past_abilities") val pastAbilities: List<String?>,
    @SerializedName("past_types") val pastTypes: List<String>?,
    @SerializedName("species") val species: SpeciesApiModel,
    @SerializedName("sprites") val sprites: SpritesApiModel,
    @SerializedName("stats") val stats: List<StatApiModel>,
    @SerializedName("types") val types: List<TypeSlotApiModel>,
    @SerializedName("weight") val weight: Int
)

data class AbilitySlotApiModel(
    @SerializedName("ability") val ability: AbilityApiModel,
    @SerializedName("is_hidden") val isHidden: Boolean,
    @SerializedName("slot") val slot: Int
)

data class AbilityApiModel(
    @SerializedName("name") val name: String,
    @SerializedName("url") val url: String
)

data class CriesApiModel(
    @SerializedName("latest") val latest: String,
    @SerializedName("legacy") val legacy: String
)

data class FormApiModel(
    @SerializedName("name") val name: String,
    @SerializedName("url") val url: String
)

data class GameIndexApiModel(
    @SerializedName("game_index") val gameIndex: Int,
    @SerializedName("version") val version: VersionApiModel
)

data class VersionApiModel(
    @SerializedName("name") val name: String,
    @SerializedName("url") val url: String
)

data class MoveApiModel(
    @SerializedName("move") val move: MoveInfoApiModel,
    @SerializedName("version_group_details") val versionGroupDetails: List<VersionGroupDetailApiModel>
)

data class MoveInfoApiModel(
    @SerializedName("name") val name: String,
    @SerializedName("url") val url: String
)

data class VersionGroupDetailApiModel(
    @SerializedName("level_learned_at") val levelLearnedAt: Int,
    @SerializedName("move_learn_method") val moveLearnMethod: MoveLearnMethodApiModel,
    @SerializedName("version_group") val versionGroup: VersionGroupApiModel
)

data class MoveLearnMethodApiModel(
    @SerializedName("name") val name: String,
    @SerializedName("url") val url: String
)

data class VersionGroupApiModel(
    @SerializedName("name") val name: String,
    @SerializedName("url") val url: String
)

data class SpeciesApiModel(
    @SerializedName("name") val name: String,
    @SerializedName("url") val url: String
)

data class SpritesApiModel(
    @SerializedName("back_default") val backDefault: String?,
    @SerializedName("back_female") val backFemale: String?,
    @SerializedName("back_shiny") val backShiny: String?,
    @SerializedName("back_shiny_female") val backShinyFemale: String?,
    @SerializedName("front_default") val frontDefault: String?,
    @SerializedName("front_female") val frontFemale: String?,
    @SerializedName("front_shiny") val frontShiny: String?,
    @SerializedName("front_shiny_female") val frontShinyFemale: String?
)

data class TypeSlotApiModel(
    @SerializedName("slot") val slot: Int,
    @SerializedName("type") val type: TypeApiModel
)

data class TypeApiModel(
    @SerializedName("name") val name: String,
    @SerializedName("url") val url: String
)

data class StatApiModel(
    @SerializedName("base_stat") val baseStat: Int,
    @SerializedName("effort") val effort: Int,
    @SerializedName("stat") val stat: StatInfoApiModel
)

data class StatInfoApiModel(
    @SerializedName("name") val name: String,
    @SerializedName("url") val url: String
)
