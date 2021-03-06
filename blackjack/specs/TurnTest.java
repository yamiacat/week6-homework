import static org.junit.Assert.*;
import org.junit.*;
import cards.*;
import players.*;
import game.*;

public class TurnTest {
  GameGenerator startGame;
  GameOperator game;
  Rulable blackjackRules = new BlackjackRules();


  @Before
  public void before() {
    startGame = new GameGenerator(blackjackRules, 2 ,1);
    game = new GameOperator(startGame);

  }

  @Test
  public void playersPlayCards() {
    assertEquals(2, game.getTurn().getPlayers().get(0).handCount());
  }

  @Test
  public void bothPlayersPlayCards() {
    assertEquals(2, game.getTurn().getPlayers().get(1).handCount());
  }


}
