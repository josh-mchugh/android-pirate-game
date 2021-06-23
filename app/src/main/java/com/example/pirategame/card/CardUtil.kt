package com.example.pirategame.card

import com.example.pirategame.R

class CardUtil {

    fun getCardsMap(): Map<Card.Type, Card> {

        return cards()
    }

    fun getCardByType(type: Card.Type): Card? {

        return cards()[type]
    }

    private fun cards(): Map<Card.Type, Card> {

        val cards = HashMap<Card.Type, Card>()

        cards[Card.Type.PORT] = Card(
            R.mipmap.card_port,
            "After years of saving up, you finally bought yourself a ship",
            Action("Guess we are doing this", Card.Type.SAILING),
            Action("Weigh anchor!", Card.Type.PORT),
            Card.Type.PORT
        )
        cards[Card.Type.SAILING] = Card(
            R.mipmap.card_ship_merchant,
            "The winds are favourable today and crew spirits are high",
            Action("Turn hard to port!", Card.Type.SIRENS),
            Action("To starboard, lads!", Card.Type.PIRATES),
            Card.Type.SAILING
        )
        cards[Card.Type.SIRENS] = Card(
            R.mipmap.card_siren,
            "Your ship approaches Siren's Reef. The songs lure you in.",
            Action("Oh no", Card.Type.SIRENS_OP_1),
            Action("(Lass) Wave to the Sirens", Card.Type.SIRENS_OP_2),
            Card.Type.SIRENS
        )
        cards[Card.Type.SIRENS_OP_1] = Card(
            R.mipmap.card_siren,
            "The Sirens are wary, but leave you alone and allow you to pass through",
            Action("Onwards!", Card.Type.SAILING),
            Action("That was close", Card.Type.SAILING),
            Card.Type.SIRENS_OP_1
        )
        cards[Card.Type.SIRENS_OP_2] = Card(
            R.mipmap.card_siren,
            "The Sirens wave back and boost the crew's morale",
            Action("What nice songs", Card.Type.SAILING),
            Action("Yo ho ho!", Card.Type.SAILING),
            Card.Type.SIRENS_OP_2
        )
        cards[Card.Type.PIRATES] = Card(
            R.mipmap.card_ship_pirate,
            "Your scout spots an approaching pirate ship",
            Action("All hands on deck!", Card.Type.PIRATES_OP_1),
            Action("Attempt to flee", Card.Type.PIRATES_OP_2),
            Card.Type.PIRATES
        )
        cards[Card.Type.PIRATES_OP_1] = Card(
            R.mipmap.card_ship_pirate,
            "You won, but not without taking damage to the broadside",
            Action("It is what it is", Card.Type.SAILING),
            Action("Still victorious, I say!", Card.Type.SAILING),
            Card.Type.PIRATES_OP_1
        )
        cards[Card.Type.PIRATES_OP_2] = Card(
            R.mipmap.card_ship_pirate,
            "You manage to outrun the pirates, but not without taking some mast damage",
            Action("Aaaarrrrgh!", Card.Type.SAILING),
            Action("That was close", Card.Type.SAILING),
            Card.Type.PIRATES_OP_2
        )

        return cards
    }
}