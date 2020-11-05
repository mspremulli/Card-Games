package BlackJack;

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

  private static void bet(){
    Scanner scanner = new Scanner(System.in);
    players.forEach(player -> {
      System.out.println(player.getName() + ": Enter your bet: ");
      player.currentBet = scanner.nextInt();
    });
  }

  private static void updateMoney(){
    players.forEach(player -> player.currentMoney += player.currentBet);
  }

  private static void deal(){
    dealer.addCard(deck.drawRandomCard());
    dealer.addCard(deck.drawRandomCard());

    players.forEach(player -> {
      player.addCard(deck.drawRandomCard());
      player.addCard(deck.drawRandomCard());
    });
  }

  private static void display() {
    System.out.print(dealer.getName() + "  ");
    dealer.getHand().forEach(card -> System.out.print(card.displayCard() + " "));
    System.out.println(dealer.getHandValue());

    players.forEach(player -> {
      System.out.print(player.getName() + "  ");
      player.getHand().forEach(card -> System.out.print(card.displayCard() + " "));
      System.out.println(player.getHandValue());
    });
  }

  public static void playRound(){
    while (dealer.getHandValue() < 17) {
      dealer.addCard(deck.drawRandomCard());
    }

    Scanner scanner = new Scanner(System.in);

    for (var player : players) {
      if (dealer.getHandValue() > 21) {
        display();
        System.out.println("Dealer Busts. Everyone Wins!");
        break;
      }
      while (true) {
        display();

        System.out.println();

        if (player.getHandValue() == 21) {
          System.out.println("Blackjack!");
          break;
        }

        System.out.println(player.getName() + ": Hit or stay? ");

        String response = scanner.nextLine();
        if (response.toLowerCase().equals("h")) {
          player.addCard(deck.drawRandomCard());
          if (player.getHandValue() > 21) {
            System.out.println("Bust!");
            break;
          } else if (player.getHandValue() == 21) {
            System.out.println("21!");
            break;
          }
        } else break;
      }
    }
    updateMoney();
  }

  public static void main(String[] args) {
    createPlayers();
    while (true) {
      bet();
      deal();
      playRound();

      System.out.println("Play again? (y/n)");
      Scanner scanner = new Scanner(System.in);
      String keepPlaying = scanner.nextLine();
      if(!keepPlaying.equals("y")) break;
    }

    players.forEach(player ->  System.out.println(player.getName() + " has $" + player.currentMoney + "."));
  }

}
