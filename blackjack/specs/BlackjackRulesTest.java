import static org.junit.Assert.*;
import org.junit.*;
import cards.*;
import players.*;
import game.*;

public class BlackjackRulesTest {
  GameGenerator startGame;
  Rulable blackjackRules;

  @Before
  public void before() {
  blackjackRules = new BlackjackRules();
  startGame = new GameGenerator(blackjackRules, 2 ,1);
  }


  @Test
  public void canGetGameName() {
    assertEquals("Blackjack", startGame.getGameName());
  }

  @Test
  public void rulesContainRankScores() {
    assertEquals(13, blackjackRules.getRankScores().size());
  }


}
