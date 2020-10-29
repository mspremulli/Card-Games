package BlackJack;

import CardGames.Card;
import java.util.ArrayList;
import java.util.Scanner;

public class PlayBlackJack {
  private static ArrayList<BlackJackPlayer> players = new ArrayList<>();
  private static BlackJackPlayer dealer = new BlackJackPlayer("Dealer",0);
  private static BlackJackDeck deck = new BlackJackDeck();

  private static void addPlayer() {
    players.add(new BlackJackPlayer(players.size() + 1));
  }

  private static void createPlayers(){
    int numberOfPlayers = 4;
    for (int i = 0; i < numberOfPlayers; i++) {
      addPlayer();
    }
  }

  private static void deal(){
    dealer.getCards(deck.drawRandomCard(), deck.drawRandomCard());

    players.forEach(player -> player.getCards(deck.drawRandomCard(), deck.drawRandomCard()));
  }

  private static void display() {
    System.out.print(dealer.getName() + "  ");
    System.out.print(dealer.getFaceDownCard().displayCard() + "  ");
    System.out.println(dealer.getFaceUpCard().displayCard());

    players.forEach(player -> {
      System.out.print(player.getName() + "  ");
//      System.out.print(player.getFaceDownCard().displayCard() + "  ");
      System.out.println(player.getFaceUpCard().displayCard());
    });
  }

  public static void main(String[] args){

//    Test();
    createPlayers();
    deal();
    display();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Hit or stay? ");
    String response = scanner.nextLine();
    if(response.equals("h")){
      players.get(0).getFaceDownCard();
    }

  }

  private static void Test(){
    BlackJackDeck deck = new BlackJackDeck();
    for (int i = 0; i < 52; i++) {

      Card card1 = deck.drawRandomCard();
      System.out.println(card1.getNumber()+ " " + card1.getSuit());
    }
  }

}
