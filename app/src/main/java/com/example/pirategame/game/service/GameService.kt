package com.example.pirategame.game.service

import com.example.pirategame.game.view.IGameController
import com.example.pirategame.game.view.model.InitializeStatsRequest

class GameService(var gameController: IGameController): IGameService {

    override fun initializeStats() {

        val request = InitializeStatsRequest.Builder()
            .maxLevel(50)
            .currentHealth(50)
            .currentLevel(1)
            .currentWealth(500)
            .currentFame(0)
            .build()

        gameController.initializeStats(request)
    }
}