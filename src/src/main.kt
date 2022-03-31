package src

import java.util.*

class main {
    companion object constructor(args: Array<String?>?)

    init {
        val card = Card(10, "diamonds")
        val card1 = Card("clubs")
        System.out.println(card.getRank())
        System.out.println(card1.getRank())
        System.out.println(card.equals(card))
        System.out.println(card.hashCode())
        System.out.println(card.cardEquals(card1))
        val deck: Deck = Deck.CreateDeck(true)
        val pulledCards: ArrayList<Card> = ArrayList()
        for (i in 0..17) {
            pulledCards.add(deck.takeCard())
        }
        val indexToDeck: Int = Random().nextInt(pulledCards.size())
        val cardToDeck: Card = pulledCards.get(indexToDeck)
        pulledCards.remove(indexToDeck)
        deck.returnToDeck(cardToDeck)
        System.out.println(deck.toString())
        deck.shakeDeck()
        System.out.println(deck.toString())
        val root = Folder("root")
        val gameWoW = File("WoW", "exe", root)
        val games = Folder("games", root, gameWoW)
        val gameCS = File("CS", "exe", games)
        System.out.println(games.returnChilds())
        System.out.println(gameWoW.path)
        System.out.println(gameWoW.returnParent())
        System.out.println(gameCS.path)
    }
}