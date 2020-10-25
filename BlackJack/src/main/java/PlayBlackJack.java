public class PlayBlackJack {
  public static void main(String[] args){
    Deck deck = new Deck();

    for (int i = 0; i < 52; i++) {

      Card card1 = deck.drawRandomCard();
      System.out.println(card1.getNumber()+ " " + card1.getSuit());
    }

  }
}
