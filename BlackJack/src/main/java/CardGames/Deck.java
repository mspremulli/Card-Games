package CardGames;

import java.util.ArrayList;

public class Deck {
    protected ArrayList<Card> deck;

    //default constructor
    public Deck() {
        deck = new ArrayList<>();
        for (int cardNumber = 1; cardNumber < 14; cardNumber++) {
            for(int suit = 1; suit < 5; suit++){
                deck.add(new Card(cardNumber, suit));
            }
        }
    }

    public Deck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public Card drawRandomCard(){
        int randNum = (int) Math.floor(deck.size() * (Math.random()));
        return deck.remove(randNum);
    }

    public ArrayList<Card> shuffle (ArrayList<Card> cardsToShuffle){
        cardsToShuffle.forEach(card -> deck.add(card));
        return deck;
    }
}
