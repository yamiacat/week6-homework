import cards.*;
import java.util.*;


public class Runner {
  public static void main(String[] args) {
    DeckGenerator generatedDeck = new DeckGenerator("Blackjack");

    System.out.println("Cards are:");
    // ArrayList<Card> deck = GeneratedDeck.getDeck();

    System.out.println(generatedDeck.printAllCards());

  }
}
