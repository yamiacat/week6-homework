import static org.junit.Assert.*;
import org.junit.*;
import cards.*;
import players.*;

public class PlayerTest {

  Player player1;
  Scorable card1;

  @Before
  public void before() {
    player1 = new Player("Lemmy");
    card1 = new Card(CardSuit.SPADES, CardRank.ACE);
  }

  @Test
  public void canGetPlayerName() {
    assertEquals("Lemmy", player1.getName());
  }

  @Test
  public void testHandStartsEmpty(){
    assertEquals(0, player1.handCount());
  }


  @Test
  public void testUnplayedHandStartsEmpty(){
    assertEquals(0, player1.unplayedHandCount());
  }

  @Test
  public void canReceiveCard(){
    player1.receiveCard(card1);
    assertEquals(1, player1.unplayedHandCount());
  }

  

}
