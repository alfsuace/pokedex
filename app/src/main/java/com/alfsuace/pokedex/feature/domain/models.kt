package com.alfsuace.pokedex.feature.domain

data class Pokemon(
    val abilities: List<AbilitySlot>,
    val baseExperience: Int,
    val cries: Cries,
    val forms: List<Form>,
    val gameIndices: List<GameIndex>,
    val height: Int,
    val heldItems: List<String>?,
    val id: String,
    val isDefault: Boolean,
    val locationAreaEncounters: String,
    val moves: List<Move>,
    val name: String,
    val order: Int,
    val pastAbilities: List<String?>,
    val pastTypes: List<String>?,
    val species: Species,
    val sprites: Sprites,
    val stats: List<Stat>,
    val types: List<TypeSlot>,
    val weight: Int
)

data class AbilitySlot(
    val ability: Ability,
    val isHidden: Boolean,
    val slot: Int
)

data class Ability(
    val name: String,
    val url: String
)

data class Cries(
    val latest: String,
    val legacy: String
)

data class Form(
    val name: String,
    val url: String
)

data class GameIndex(
    val gameIndex: Int,
    val version: Version
)

data class Version(
    val name: String,
    val url: String
)


data class Move(
    val move: MoveInfo,
    val versionGroupDetails: List<VersionGroupDetail>
)

data class MoveInfo(
    val name: String,
    val url: String
)

data class VersionGroupDetail(
    val levelLearnedAt: Int,
    val moveLearnMethod: MoveLearnMethod,
    val versionGroup: VersionGroup
)

data class MoveLearnMethod(
    val name: String,
    val url: String
)

data class VersionGroup(
    val name: String,
    val url: String
)

data class Species(
    val name: String,
    val url: String
)

data class Sprites(
    val backDefault: String?,
    val backFemale: String?,
    val backShiny: String?,
    val backShinyFemale: String?,
    val frontDefault: String?,
    val frontFemale: String?,
    val frontShiny: String?,
    val frontShinyFemale: String?,
)

data class TypeSlot(
    val slot: Int,
    val type: Type
)

data class Type(
    val name: String,
    val url: String
)

data class Stat(
    val baseStat: Int,
    val effort: Int,
    val stat: StatInfo
)

data class StatInfo(
    val name: String,
    val url: String
)
