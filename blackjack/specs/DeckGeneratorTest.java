import static org.junit.Assert.*;
import org.junit.*;
import cards.*;

public class DeckGeneratorTest {

  DeckGenerator deck;

  @Before
  public void before(){
    deck = new DeckGenerator("Blackjack");
  }


  @Test
  public void canGetIntendedGame(){
    assertEquals("Blackjack", deck.getIntendedGame());
  }


  @Test
  public void canCountDeck(){
    assertEquals(52, deck.countDeck());
  }



}
