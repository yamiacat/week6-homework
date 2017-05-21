package game;

import java.util.*;
import cards.*;
import players.*;

public interface Turnable {


  public ArrayList<Player> getPlayers();
  public HashMap <Player, ArrayList<Scorable>> getAllHands();
  public String reportAllHands();
  public String printAllCards();
}
