package BlackJack;

public class BlackJackPlayer {
  private BlackjackCard faceUpCard;
  private BlackjackCard faceDownCard;
  private String name;
  private int playerNumber;

  public BlackJackPlayer(String name, int playerNumber) {
    this.faceUpCard = null;
    this.faceDownCard = null;
    this.name = name;
    this.playerNumber = playerNumber;
  }

  public BlackJackPlayer(int playerNumber) {
    this.faceUpCard = null;
    this.faceDownCard = null;
    this.name = "Player" + playerNumber;
    this.playerNumber = playerNumber;
  }

  public String getName() {
    return name;
  }

  public void getCards(BlackjackCard downCard, BlackjackCard upCard){
    faceDownCard = downCard;
    faceUpCard = upCard;
    upCard.isFaceUp = true;
  }

  public BlackjackCard getFaceUpCard() {
    return faceUpCard;
  }

  public BlackjackCard getFaceDownCard() {
    return faceDownCard;
  }


}
