package BlackJack;

import CardGames.Card;
import CardGames.Deck;
import java.util.ArrayList;

public class BlackJackDeck extends Deck {

  public BlackJackDeck(ArrayList<Card> deck) {
   
    this.deck = deck;
  }
  public BlackJackDeck(){
    super();
  }

}
