package com.example.pirategame.game.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.bluelinelabs.conductor.Controller
import com.example.pirategame.R
import com.example.pirategame.card.Card
import com.example.pirategame.card.CardUtil
import com.example.pirategame.game.service.GameService
import com.example.pirategame.game.service.IGameService
import com.example.pirategame.game.view.adapter.CardStackAdapter
import com.example.pirategame.game.view.model.InitializeStatsRequest
import com.yuyakaido.android.cardstackview.CardStackLayoutManager
import com.yuyakaido.android.cardstackview.CardStackListener
import com.yuyakaido.android.cardstackview.CardStackView
import com.yuyakaido.android.cardstackview.Direction
import timber.log.Timber

class GameController : Controller(), IGameController, CardStackListener {

    lateinit var gameService: IGameService

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup,
        savedViewState: Bundle?
    ): View {

        val view = inflater.inflate(R.layout.controller_game, container, false)

        gameService = GameService(this)

        val cardLayoutManager = CardStackLayoutManager(applicationContext, this)
        cardLayoutManager.setCanScrollVertical(false)

        val cardStackView = view.findViewById<CardStackView>(R.id.game_card_stack_view)
        cardStackView.layoutManager = CardStackLayoutManager(applicationContext, this)
        cardStackView.layoutManager = cardLayoutManager

        val card: Card? = CardUtil().getCardByType(Card.Type.PORT)

        cardStackView.adapter = CardStackAdapter(listOf(card))


        return view
    }

    override fun onAttach(view: View) {

        gameService.initializeStats()
    }

    override fun initializeStats(request: InitializeStatsRequest) {

        view?.findViewById<TextView>(R.id.game_header_health_stat)?.text = String.format("%s/%s", request.currentHealth, request.maxHealth)
        view?.findViewById<TextView>(R.id.game_header_exp_stat)?.text = String.format("Level %s", request.currentLevel)
        view?.findViewById<TextView>(R.id.game_header_wealth_stat)?.text = request.currentWealth.toString()
        view?.findViewById<TextView>(R.id.game_header_fame_stat)?.text = request.currentFame.toString()
    }

    override fun onCardDisappeared(view: View?, position: Int) {

    }

    override fun onCardDragging(direction: Direction?, ratio: Float) {

    }

    override fun onCardSwiped(direction: Direction?) {

    }

    override fun onCardCanceled() {

    }

    override fun onCardAppeared(view: View?, position: Int) {
        Timber.i("on Card Appeared")
    }

    override fun onCardRewound() {

    }
}