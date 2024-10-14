package com.alfsuace.pokedex.feature.data.remote

import com.alfsuace.pokedex.feature.domain.*

fun PokemonApiModel.toModel(): Pokemon {
    return Pokemon(
        abilities = abilities.map { it.toModel() },
        baseExperience,
        cries.toModel(),
        forms.map { it.toModel() },
        gameIndices.map { it.toModel() },
        height,
        heldItems,
        id,
        isDefault,
        locationAreaEncounters,
        moves.map { it.toModel() },
        name,
        order,
        pastAbilities,
        pastTypes,
        species.toModel(),
        sprites.toModel(),
        stats.map { it.toModel() },
        types.map { it.toModel() },
        weight
    )
}

fun AbilitySlotApiModel.toModel(): AbilitySlot {
    return AbilitySlot(
        ability.toModel(),
        isHidden,
        slot
    )
}

fun AbilityApiModel.toModel(): Ability {
    return Ability(
        name,
        url
    )
}

fun CriesApiModel.toModel(): Cries {
    return Cries(
        latest,
        legacy
    )
}

fun FormApiModel.toModel(): Form {
    return Form(
        name,
        url
    )
}

fun GameIndexApiModel.toModel(): GameIndex {
    return GameIndex(
        gameIndex,
        version.toModel()
    )
}

fun VersionApiModel.toModel(): Version {
    return Version(
        name,
        url
    )
}

fun MoveApiModel.toModel(): Move {
    return Move(
        move.toModel(),
        versionGroupDetails.map { it.toModel() }
    )
}

fun MoveInfoApiModel.toModel(): MoveInfo {
    return MoveInfo(
        name,
        url
    )
}

fun VersionGroupDetailApiModel.toModel(): VersionGroupDetail {
    return VersionGroupDetail(
        levelLearnedAt,
        moveLearnMethod.toModel(),
        versionGroup.toModel()
    )
}

fun MoveLearnMethodApiModel.toModel(): MoveLearnMethod {
    return MoveLearnMethod(
        name,
        url
    )
}

fun VersionGroupApiModel.toModel(): VersionGroup {
    return VersionGroup(
        name,
        url
    )
}

fun SpeciesApiModel.toModel(): Species {
    return Species(
        name,
        url
    )
}

fun SpritesApiModel.toModel(): Sprites {
    return Sprites(
        backDefault,
        backFemale,
        backShiny,
        backShinyFemale,
        frontDefault,
        frontFemale,
        frontShiny,
        frontShinyFemale
    )
}

fun TypeSlotApiModel.toModel(): TypeSlot {
    return TypeSlot(
        slot,
        type.toModel()
    )
}

fun TypeApiModel.toModel(): Type {
    return Type(
        name,
        url
    )
}

fun StatApiModel.toModel(): Stat {
    return Stat(
        baseStat,
        effort,
        stat.toModel()
    )
}

fun StatInfoApiModel.toModel(): StatInfo {
    return StatInfo(
        name,
        url
    )
}
