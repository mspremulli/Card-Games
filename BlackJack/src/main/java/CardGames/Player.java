package CardGames;

public abstract class Player {
  private Card faceUpCard;
  private Card faceDownCard;
  private String name;
  private int playerNumber;

  public Player(String name, int playerNumber) {
    this.faceUpCard = null;
    this.faceDownCard = null;
    this.name = name;
    this.playerNumber = playerNumber;
  }

  public Player(int playerNumber) {
    this.faceUpCard = null;
    this.faceDownCard = null;
    this.name = "Player" + playerNumber;
    this.playerNumber = playerNumber;
  }

  public String getName() {
    return name;
  }

  public void getCards(Card downCard, Card upCard){
    faceDownCard = downCard;
    faceUpCard = upCard;
    upCard.isFaceUp = true;
  }

  public Card getFaceUpCard() {
    return faceUpCard;
  }

  public Card getFaceDownCard() {
    return faceDownCard;
  }


}
