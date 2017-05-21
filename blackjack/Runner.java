import cards.*;
import players.*;
import game.*;
import java.util.*;


public class Runner {

  public static void main(String[] args) {
    int numberOfPlayers;
    int numberOfPacks;
    Scanner in = new Scanner(System.in);
    GameGenerator startGame;

    System.out.println("Welcome to BLACKJACKOPOLIS...");
    pressReturnToContinue();
    System.out.println("How many players? (between 1 - 3)");
    numberOfPlayers = in.nextInt();

    System.out.println("How many packs of cards in the deck?");
    numberOfPacks = in.nextInt();

    startGame = new GameGenerator("Blackjack", numberOfPlayers+1, numberOfPacks);

    System.out.println("OK. This game of " + startGame.getGameName() + " is being played with a " + startGame.countPacks() + " pack deck.");
    System.out.println(startGame.listPlayerNames() + "are at the table.");

    // System.out.println("Press any key to play...");
    // in.nextLine();

    // System.out.println(generatedDeck.printAllCards());

  }
}
