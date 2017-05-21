import static org.junit.Assert.*;
import org.junit.*;
import game.*;

public class GameGeneratorTest {

  GameGenerator game;
  Rulable blackjackRules = new BlackjackRules();

  @Before
  public void before(){
    game = new GameGenerator(blackjackRules, 2, 1);
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
    assertEquals("The Dealer", game.getPlayers().get(0).getName());
  }

  @Test
  public void canHaveFourPlayers() {
  GameGenerator bigGame = new GameGenerator(blackjackRules, 4, 4);
    assertEquals(4, bigGame.countPlayers());
  }

  @Test
  public void canHaveFourPacks() {
  GameGenerator bigGame = new GameGenerator(blackjackRules, 4, 4);
    assertEquals(4, bigGame.countPacks());
  }

}
