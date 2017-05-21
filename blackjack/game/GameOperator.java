package game;

import cards.*;
import players.*;
import java.util.*;

public class GameOperator {

  private GameGenerator game;
  private Turn turn;

  public GameOperator(GameGenerator game) {
    this.game = game;
    Turn turn = new Turn(game);
    this.turn = turn;

  }

  public Turn getTurn() {
    return this.turn;
  }


}
