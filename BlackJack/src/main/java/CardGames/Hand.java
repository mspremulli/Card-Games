package CardGames;

import java.util.ArrayList;

public abstract class Hand {
  private ArrayList<Card> cards;

  public Hand(ArrayList<Card> cards) {
    this.cards = cards;
  }

  public void addCard(Card card){
    cards.add(card);
  }

  public Card removeRandomCard(){
    return cards.remove((int) Math.floor(cards.size() * Math.random()));
  }

  public Card removeCard(Card card){
    return cards.remove(cards.indexOf(card));
  }
}
