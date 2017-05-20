package players;
import java.util.*;
import cards.*;

public class Player {

  private String name;
  private ArrayList<Card> hand;
// //USEFUL IN OTHER GAMES
//   private ArrayList<Card> unplayedHand;

  public Player(String name) {
    this.name = name;
    this.hand = new ArrayList<Card>();
  }


}
