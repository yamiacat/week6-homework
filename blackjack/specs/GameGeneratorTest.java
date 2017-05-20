import static org.junit.Assert.*;
import org.junit.*;
import game.*;

public class GameGeneratorTest {

  GameGenerator game;

  @Before
  public void before(){
    game = new GameGenerator("Blackjack", 2);
  }


  @Test
  public void canGetGameName(){
    assertEquals("Blackjack", game.getGameName());
  }

  @Test
  public void canGetNumberOfPlayers() {
    assertEquals(2, game.countPlayers());
  }

  @Test
  public void firstPlayerIsTheDealer() {
    assertEquals("Dealer", game.getPlayers().get(0).getName());
  }

  @Test
  public void canHaveFourPlayers() {
  GameGenerator bigGame = new GameGenerator("Blackjack", 4);
    assertEquals(4, bigGame.countPlayers());
  }

}
