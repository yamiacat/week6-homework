package game;

import cards.*;
import players.*;
import java.util.*;

public class GameOperator {

  private GameGenerator game;
  private Turn turn;
  private Score score;

  public GameOperator(GameGenerator game) {
    this.game = game;
    Turn turn = new Turn(game);
    this.turn = turn;
    Score score = new Score(turn);
    this.score = score;
  }

  public Turn getTurn() {
    return this.turn;
  }

  public Score getScoreResults() {
    return this.score;
  }


}
