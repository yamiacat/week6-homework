// import static org.junit.Assert.*;
// import org.junit.*;
// import cards.*;
// import players.*;
// import game.*;
// import org.mockito.*;
// import static org.mockito.Mockito.*;
//
// public class ScoreTest {
//
//   GameGenerator startGame;
//   GameOperator game;
//   Rulable blackjackRules = new BlackjackRules();
//   Scorable card;
//
//   @Before
//   public void before() {
//     startGame = new GameGenerator(blackjackRules, 2, 1);
//     game = new GameOperator(startGame);
//     card = mock(Scorable.class);
//   }
//
//   @Test
//   public void acesGoSoft() {
//     when(card.playCard()).thenReturn(CardRank.ACE);
//     // assertEquals(12, game.getTurn().getPlayers().get(0))
//   }
//
// }
