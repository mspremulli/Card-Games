import java.util.ArrayList;

public class BlackjackDeck {
    ArrayList<BlackjackCard> deck= new ArrayList<>();

    //default constructor
    public BlackjackDeck() {
        for (int cardNumber = 1; cardNumber < 14; cardNumber++) {
            for(int suit = 1; suit < 5; suit++){
                deck.add(new BlackjackCard(cardNumber, suit));
            }
        }
    }

    public BlackjackCard drawRandomCard(){
        int randNum = (int) Math.floor(deck.size() * (Math.random()));
        return deck.remove(randNum);
    }

}
