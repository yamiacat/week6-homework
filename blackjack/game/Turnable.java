// I HAVE NO CLUE WHETHER THIS IS A USEFUL THING TO DO WITH AN INTERFACE?

package game;

import java.util.*;
import cards.*;
import players.*;

public interface Turnable {


  public ArrayList<Player> getPlayers();
  public String reportAllHands();
  public String printAllCards();
}
