import cards.*;
import players.*;
import game.*;
import java.util.*;


public class Runner {
  public static void main(String[] args) {
    int numberOfPlayers;
    int numberOfPacks;
    Scanner in = new Scanner(System.in);
    GameGenerator game;

    System.out.println("Welcome to BLACKJACKOPOLIS...");
    System.out.println("How many players? (between 1 - 3)");
    numberOfPlayers = in.nextInt();

    System.out.println("How many packs of cards in the deck?");
    numberOfPacks = in.nextInt();

    game = new GameGenerator("Blackjack", numberOfPlayers, numberOfPacks);

    


    // System.out.println(generatedDeck.printAllCards());

  }
}
