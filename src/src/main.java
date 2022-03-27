package src;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Card card = new Card(10, "diamonds");
        Card card1 = new Card("clubs");

        System.out.println(card.getRank());
        System.out.println(card1.getRank());
        System.out.println(card.equals(card));
        System.out.println(card.hashCode());
        System.out.println(card.cardEquals(card1));

        Deck deck = Deck.CreateDeck(true);
        ArrayList<Card> pulledCards = new ArrayList<>();

        for (int i = 0; i < 18; i++) {
            pulledCards.add(deck.takeCard());
        }

        int indexToDeck = new Random().nextInt(pulledCards.size());
        Card cardToDeck = pulledCards.get(indexToDeck);
        pulledCards.remove(indexToDeck);

        deck.returnToDeck(cardToDeck);
        System.out.println(deck.toString());

        deck.shakeDeck();
        System.out.println(deck.toString());

    }
}