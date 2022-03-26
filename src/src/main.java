package src;

public class main {
    public static void main(String[] args) {
        Card card = new Card(10, "diamonds");
        Card card1 = new Card("clubs");

        System.out.println(card.getRank());
        System.out.println(card1.getRank());
        System.out.println(card.equals(card));
        System.out.println(card.hashCode());
        System.out.println(card.cardEquals(card1));

    }
}