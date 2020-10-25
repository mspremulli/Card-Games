import java.util.ArrayList;

public class Deck {
    ArrayList<Card> deck= new ArrayList<>();

    //default constructor
    public Deck() {
        for (int cardNumber = 1; cardNumber < 14; cardNumber++) {
            for(int suit = 1; suit < 5; suit++){
                deck.add(new Card(cardNumber, suit));
            }
        }
    }

    public Card drawRandomCard(){
        int randNum = (int) Math.floor(deck.size() * (Math.random()));
        return deck.remove(randNum);
    }

}
