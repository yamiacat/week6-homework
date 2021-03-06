import static org.junit.Assert.*;
import org.junit.*;
import cards.*;

public class CardTest {

  Card card1;

  @Before
  public void before() {
    card1 = new Card(CardSuit.SPADES, CardRank.ACE);
    // card1.setValue(11);
  }

  @Test
  public void canGetSuit() {
    assertEquals(CardSuit.SPADES, card1.getSuit());
  }


  @Test
  public void canGetRank() {
    assertEquals(CardRank.ACE, card1.getRank());
  }

  @Test
  public void canGetCardName() {
    assertEquals("ACE of SPADES", card1.getCardName());

  }


  // @Test
  // public void canGetScore(){
  //   assertEquals(11, card1.getScore());
  // }
  //
  // @Test
  // public void canSetScore(){
  //   card1.setScore(1);
  //   assertEquals(1, card1.getScore());
  // }

}
