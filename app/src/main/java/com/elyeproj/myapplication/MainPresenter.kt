package com.elyeproj.myapplication

import com.elyeproj.proto.Card
import com.elyeproj.proto.Heart
import com.elyeproj.proto.Result
import com.elyeproj.proto.Spade

class MainPresenter (val view: MainView) {

    fun fetchData() {
        val card1 = Card.newBuilder().setHeart(Heart.newBuilder().build()).build()
        val card2 = Card.newBuilder().setSpade(Spade.newBuilder().build()).build()
        val result = Result.newBuilder().addCards(card1).addCards(card2).build()
        view.showData(result.toString())
    }
}
