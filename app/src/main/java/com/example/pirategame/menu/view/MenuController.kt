package com.example.pirategame.menu.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bluelinelabs.conductor.Controller
import com.bluelinelabs.conductor.RouterTransaction
import com.bluelinelabs.conductor.changehandler.FadeChangeHandler
import com.example.pirategame.R
import com.example.pirategame.game.view.GameController
import kotlinx.android.synthetic.main.controller_menu.view.*

class MenuController : Controller(),
    IMenuController {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup,
        savedViewState: Bundle?
    ): View {

        val view: View = inflater.inflate(R.layout.controller_menu, container, false)
        view.new_game_btn.setOnClickListener { changeNewGameScreen() }

        return view
    }

    override fun changeNewGameScreen() {

        val routerTransaction: RouterTransaction = RouterTransaction.with(GameController())
            .pushChangeHandler(FadeChangeHandler())
            .popChangeHandler(FadeChangeHandler())

        router.pushController(routerTransaction)
    }
}