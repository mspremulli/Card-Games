package BlackJack;

import CardGames.Card;
import CardGames.Player;

public class BlackJackPlayer extends Player {
  private boolean hasAcebe11;
  public int currentMoney;
  public int currentBet;

  public BlackJackPlayer(String name, int playerNumber) {
    super(name, playerNumber);
  }

  public BlackJackPlayer(int playerNumber) {
    super(playerNumber);
  }

  @Override
  public void addCard(Card card){
    hand.add(card);
    if(card.value > 10) card.value = 10;
    if(card.value == 1) {
      card.value = 11;
      hasAcebe11 = true;
    }
    handValue += card.value;

    if(handValue > 21 && hasAcebe11){
      handValue -= 10;
      hasAcebe11 = false;
    }

  }

}
