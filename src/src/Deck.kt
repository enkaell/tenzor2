package src

import java.util.*

class Deck private constructor(jokers: Boolean) {
    private val deck: ArrayList<Card> = ArrayList<Card>()
    var random: Random = Random()
    fun randomCard(): Card {
        return deck.get(random.nextInt(deck.size()))
    }

    fun shakeDeck() {
        Collections.shuffle(deck, random)
    }

    //    public void sortDeck() {
    //        Collections.sort(this.deck, new Comparator<Deck>() {
    //            @Override
    //            public int compare(Deck d1, Deck d2) {
    //                return (d1);
    //            }
    //        });
    //    }
    fun takeCard(): Card {
        val index: Int = random.nextInt(deck.size())
        val card: Card = deck.get(index)
        deck.remove(index)
        return card
    }

    fun returnToDeck(card: Card?) {
        if (deck.contains(card)) System.out.println("The card is already in your deck") else deck.add(card)
    }

    val isEmpty: Boolean
        get() = deck.size() === 0

    override fun toString(): String {
        var data = String()
        if (!isEmpty) {
            for (card in deck) data += card.toString().toString() + ", "
        }
        return data
    }

    companion object {
        fun CreateDeck(jokers: Boolean): Deck {
            return Deck(jokers)
        }
    }

    init {
        val suits: ArrayList<String> = ArrayList(Arrays.asList("clubs", "diamonds", "spades", "hearts"))
        if (jokers) {
            val joker1 = Card(15, "hearts")
            val joker2 = Card(15, "spades")
            deck.addAll(Arrays.asList(joker1, joker2))
        }
        for (i in 2..14) {
            for (j in 0 until suits.size()) {
                deck.add(Card(i, suits.get(j)))
            }
        }
        shakeDeck()
    }
}