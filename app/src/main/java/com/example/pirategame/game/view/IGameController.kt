package com.example.pirategame.game.view

import com.example.pirategame.game.view.model.InitializeStatsRequest

interface IGameController {

    fun initializeStats(request: InitializeStatsRequest)
}