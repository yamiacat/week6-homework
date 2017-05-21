import static org.junit.Assert.*;
import org.junit.*;
import cards.*;

public class DeckGeneratorTest {

  DeckGenerator deck;
  DeckGenerator doubleDeck;

  @Before
  public void before() {
    deck = new DeckGenerator("Blackjack", 1);
  }


  @Test
  public void canGetIntendedGame() {
    assertEquals("Blackjack", deck.getIntendedGame());
  }


  @Test
  public void canCountDeck() {
    assertEquals(52, deck.countDeck());
  }

  @Test
  public void canHaveMultiplePackDeck() {
    doubleDeck = new DeckGenerator("Blackjack", 2);
    assertEquals(104, doubleDeck.countDeck());
  }

  @Test
  public void canDealACard() {
    deck.dealCard();
    assertEquals(51, deck.countDeck());
  }
}
