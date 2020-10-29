package BlackJack;

import CardGames.Card;
import CardGames.Player;

public class BlackJackPlayer extends Player {

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
    if(card.value == 1) card.value = 11;
    handValue += card.value;
  }

}
