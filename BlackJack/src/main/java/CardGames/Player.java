package CardGames;

import java.util.ArrayList;

public abstract class Player {
  protected ArrayList<Card> hand;
  protected int handValue;
  protected String name;
  protected int playerNumber;

  public Player(String name, int playerNumber) {
    handValue = 0;
    hand = new ArrayList<>();
    this.name = name;
    this.playerNumber = playerNumber;
  }

  public Player(int playerNumber) {
    handValue = 0;
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

  public int getHandValue() {
    return handValue;
  }

  public void addCard(Card card){
    hand.add(card);
    handValue += card.value;
  }


}
