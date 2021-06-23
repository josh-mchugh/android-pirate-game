package com.example.pirategame.card

data class Card (
    var imageId: Int,
    var text: String,
    var leftAction: Action,
    var rightAction: Action,
    var type: Type
) {

    enum class Type {
        PORT,
        SAILING,
        SIRENS,
        SIRENS_OP_1,
        SIRENS_OP_2,
        PIRATES,
        PIRATES_OP_1,
        PIRATES_OP_2
    }
}