public class BlackjackCard {
    private int number; //1-13 11=J, 12=Q, 13=K, 1=A
    private int value;
    private int suit; //1 clubs 2 diamonds, 3 hearts, 4 spades
    public boolean isFaceUp;

    public BlackjackCard(int number, int suit) {
        this.number = number;
        value = number;
        this.suit = suit;
        isFaceUp = false;
    }

    public int getNumber() {
        return number;
    }

    public int getSuit() {
        return suit;
    }

    public String displayCard() {
        String suitName;
        String cardName;
        suitName = switch (suit) {
            case 1 -> "C";
            case 2 -> "D";
            case 3 -> "H";
            default -> "S";
        };

        cardName = switch (number) {
            case 1 -> "A";
            case 11 -> "J";
            case 12 -> "Q";
            case 13 -> "K";
            default -> "" + number;
        };
        return cardName + " " + suitName;
    }
}
