import cards.*;
import players.*;
import java.util.*;


public class Runner {
  public static void main(String[] args) {
    DeckGenerator generatedDeck = new DeckGenerator("Blackjack");

    System.out.println("Cards are:");
    System.out.println(generatedDeck.printAllCards());

  }
}
