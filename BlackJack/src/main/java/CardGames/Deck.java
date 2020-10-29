package CardGames;

import java.util.ArrayList;

public abstract class Deck {
    protected ArrayList<Card> deck;
    private int numberOfSuits = 4;
    private int numberOfCardsPerSuit = 13;

    //default constructor
    public Deck() {
        deck = new ArrayList<>();
        for (int cardNumber = 1; cardNumber <= numberOfCardsPerSuit; cardNumber++) {
            for(int suit = 1; suit <= numberOfSuits; suit++){
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
        deck.addAll(cardsToShuffle);
        return deck;
    }
}
