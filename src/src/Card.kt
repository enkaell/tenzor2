package src

class Card {
    var rank: Int = 0
    var suit: String
        private set


    enum class RankName(val rank: Int){
        jack(11),
        queen(12),
        king(13),
        ace(14),
    }
    enum class SuitName(val suit: String){
        clubs("clubs"),
        diamonds("diamonds"),
        hearts("hearts"),
        spades("spades");
    }

    internal constructor(rank: Int, suit: String) {
        this.suit = suit
        this.rank = rank
        if (SuitName.values().equals(this.suit) == false) println("Wrong suit value")
        if (rank > maxRank) maxRank = rank
    }

    internal constructor(suit: String) {
        this.suit = suit
        rank = maxRank + 1
    }

    override fun toString(): String {
        var rang: String = Integer.toString(this.rank)
        when (rang) {
            "11" -> rang = RankName.jack.name
            "12" -> rang = RankName.queen.name
            "13" -> rang = RankName.king.name
            "14" -> rang = RankName.ace.name
        }
        return rang
    }


    val isStandart: Boolean
        get() = rank >= 6 && rank <= 14

    fun isGreater(card: Card): Int {
        return Integer.compare(rank, card.rank)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Card

        if (rank != other.rank) return false
        if (suit != other.suit) return false

        return true
    }

    override fun hashCode(): Int {
        var result = rank
        result = 31 * result + suit.hashCode()
        return result
    }

    companion object {
        var maxRank = 0
        fun cardEquals(card1: Card, card2: Card): Int {
            return SuitName.valueOf(card1.suit).ordinal - SuitName.valueOf(card2.suit).ordinal
        }
    }
}