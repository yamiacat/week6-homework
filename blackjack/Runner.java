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
    GameOperator game;
    Rulable blackjackRules = new BlackjackRules();

    System.out.println("Welcome to BLACKJACKOPOLIS...");

    System.out.println("How many players? (between 1 - 3)");
    numberOfPlayers = in.nextInt();

    System.out.println("How many packs of cards in the deck?");
    numberOfPacks = in.nextInt();

    startGame = new GameGenerator(blackjackRules, numberOfPlayers+1, numberOfPacks);

    System.out.println("OK. This game of " + startGame.getGameName() + " is being played with a " + startGame.countPacks() + " pack deck.");
    System.out.println(startGame.listPlayerNames() + "are at the table.\n");

    game = new GameOperator(startGame);

    System.out.println(game.getTurn().reportAllHands());

    System.out.println(game.getTurn().reportAllHandScores()+ "!");

    System.out.println(game.getScoreResults().reportWinningPlayers() + " scores highest!");

    // System.out.println(game.printAllCards());

  }
}
