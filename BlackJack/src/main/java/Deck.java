public class Deck {
    ArrayList<Card> deck= new ArrayList<>();

    //default constructor
    public Deck() {
        for (int cardNumber = 1; cardNumber < 14; cardNumber++) {
            for(int suit = 1; suit < 4; suit++){
                deck.add(new Card(cardNumber, suit));
            }
        }
    }

    public Card drawRandomCard(){
        int randNum = Math.floor(1 + deck.size() * (Math.random() + 1));
        return deck.get(randNum);
    }

}
