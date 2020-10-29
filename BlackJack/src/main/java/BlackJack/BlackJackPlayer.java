package BlackJack;

import CardGames.Card;

import java.util.ArrayList;

public class BlackJackPlayer {
  private ArrayList<Card> hand;
  private String name;
  private int playerNumber;

  public BlackJackPlayer(String name, int playerNumber) {
    hand = new ArrayList<>();
    this.name = name;
    this.playerNumber = playerNumber;
  }

  public BlackJackPlayer(int playerNumber) {
    hand = new ArrayList<>();
    this.name = "Player" + playerNumber;
    this.playerNumber = playerNumber;
  }

  public String getName() {
    return name;
  }

  public ArrayList<Card> getHand() {
    return hand;
  }

  public void addCard(Card card){
    hand.add(card);
  }

}
