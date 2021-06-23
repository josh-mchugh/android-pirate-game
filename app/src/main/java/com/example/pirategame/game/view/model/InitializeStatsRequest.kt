package com.example.pirategame.game.view.model

class InitializeStatsRequest (
    val currentHealth: Int?,
    val maxHealth: Int?,
    val currentLevel: Int?,
    val currentWealth: Int?,
    val currentFame: Int?
    ){

    data class Builder (
        var currentHealth: Int? = null,
        var maxHealth: Int? = null,
        var currentLevel: Int? = null,
        var currentWealth: Int? = null,
        var currentFame: Int? = null
    ){
        fun currentHealth(currentHealth: Int?) = apply { this.currentHealth = currentHealth }
        fun maxLevel(maxHealth: Int?) = apply { this.maxHealth = maxHealth}
        fun currentLevel(currentLevel: Int?) = apply { this.currentLevel = currentLevel }
        fun currentWealth(currentWealth: Int?) = apply { this.currentWealth = currentWealth }
        fun currentFame(currentFame: Int?) = apply { this.currentFame = currentFame }
        fun build() = InitializeStatsRequest(currentHealth, maxHealth, currentLevel, currentWealth, currentFame)
    }
}