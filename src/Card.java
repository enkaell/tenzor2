import java.util.Arrays;

public class Card {
    private int rank;
    private String suit;
    public static int maxRank;

    Card(int rank, String suit)
    {
        this.suit = suit;
        String [] data = {"diamonds","clubs", "hearts", "spades"};
        if (Arrays.asList(data).contains(suit)==false)
            System.out.println("Wrong suit value");
        if (this.rank>maxRank)
            maxRank = this.rank;
        else
            this.rank = rank;
    }
    Card(String suit)
    {
        this.suit = suit;
        this.rank = maxRank+1;
    }
    public int getRank() {
        return rank;
    }
    public String getSuit() {
        return suit;
    }

    public String ToString() {
        String [] data = {"Jack", "Queen", "King", "Ace", "Joker"};
        String rank = Integer.toString(getRank());
        switch (rank) {
            case "10":
                rank = data[0];
                break;
            case "11":
                rank = data[1];
                break;
            case "12":
                rank = data[2];
                break;
            case "13":
                rank = data[3];
                break;
            case "14":
                rank = data[4];
                break;
        }
        return rank;
    }
    public boolean equals(Card firstCard, Card secondCard){
        return firstCard.rank == secondCard.rank && firstCard.suit == secondCard.suit;
    }
    public int hashcode(Card card){

    }
    public static void main(String[] args) {
        Card card = new Card (10,"diamonds");
        Card card1 = new Card("clubs");

        System.out.println(card.getRank());
        System.out.println(card1.getRank());
        System.out.println(card.equals(card,card));
    }
}
