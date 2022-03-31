package src

import java.util.Arrays
import java.util.Objects

class Card {
    var rank = 0
        private set
    var suit: String
        private set

    internal constructor(rank: Int, suit: String) {
        this.suit = suit
        val data = arrayOf("diamonds", "clubs", "hearts", "spades")
        if (Arrays.asList(data).contains(suit) === false) System.out.println("Wrong suit value")
        if (this.rank > maxRank) maxRank = this.rank else this.rank = rank
    }

    internal constructor(suit: String) {
        this.suit = suit
        rank = maxRank + 1
    }

    @Override
    override fun toString(): String {
        val data = arrayOf("Jack", "Queen", "King", "Ace", "Joker")
        var rank: String = Integer.toString(rank)
        when (rank) {
            "10" -> rank = data[0]
            "11" -> rank = data[1]
            "12" -> rank = data[2]
            "13" -> rank = data[3]
            "14" -> rank = data[4]
        }
        return rank
    }

    fun equals(card: Card): Boolean {
        return rank == card.rank && suit === card.suit
    }

    @Override
    override fun hashCode(): Int {
        return Objects.hash(rank, suit)
    }

    val isStandart: Boolean
        get() = rank >= 6 && rank <= 14

    fun isGreater(card: Card): Int {
        return Integer.compare(rank, card.rank)
    }

    fun cardEquals(card: Card): Int {
        val data = arrayOf("clubs", "diamonds", "spades", "hearts")
        return Arrays.asList(data).indexOf(suit) - Arrays.asList(data).indexOf(card.suit)
    }

    companion object {
        var maxRank = 0
        fun cardEquals(card1: Card, card2: Card): Int {
            val data = arrayOf("clubs", "diamonds", "spades", "hearts")
            return Arrays.asList(data).indexOf(card1.suit) - Arrays.asList(data).indexOf(card2.suit)
        }
    }
}