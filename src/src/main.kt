package src
    fun main(){
        val card = Card(11, "diamonds")
        val card1 = Card("clubs")
        val card2 = Card(10, "diamonds")
        println(card.equals(card2))
        println(card.hashCode())
        println(Card.cardEquals(card1, card2))
        println(card.toString())
    }
