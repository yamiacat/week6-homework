import static org.junit.Assert.*;
import org.junit.*;
import cards.*;
import players.*;
import game.*;

public class GameOperatorTest {
  GameGenerator startGame;
  GameOperator game;

  @Before
  public void before() {
    startGame = new GameGenerator("Blackjack", 2 ,1);
    game = new GameOperator(startGame);
  }

  @Test
  public void playersPlayCard() {
    assertEquals(1, game.getPlayers().get(0).handCount());
  }

  @Test
  public void bothPlayersPlayCard() {
    assertEquals(1, game.getPlayers().get(1).handCount());
  }


}
