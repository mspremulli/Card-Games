public class Card {
    private int number;//1-13
    private int suit;//1 clubs 2 diamonds, 3 hearts, 4 spades

    public Card(int number, int suit) {
        this.number = number;
        this.suit = suit;
    }


    public int getNumber() {
        return number;
    }

    public int getSuit() {
        return suit;
    }
}
