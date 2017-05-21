package players;
import java.util.*;
import cards.*;

public class Player {

  private String name;
  private ArrayList<Scorable> hand;
// //USEFUL IN OTHER GAMES
  private ArrayList<Scorable> unplayedHand;

  public Player(String name) {
    this.name = name;
    this.hand = new ArrayList<Scorable>();
    this.unplayedHand = new ArrayList<Scorable>();
  }


  public String getName() {
    return this.name;
  }

  public int handCount() {
    return this.hand.size();
  }

  public int unplayedHandCount() {
    return this.unplayedHand.size();
  }

  public void receiveCard(Scorable card) {
    this.unplayedHand.add(card);
  }

  public void playCard() {
    if (unplayedHandCount() > 0) {
      hand.add(unplayedHand.remove(0));
    }
  }

  public ArrayList<Scorable> getHand() {
    return this.hand;
  }

  public int getHandScore(){
    int total = 0;
    for (Scorable card : this.hand) {
      total += card.getScore();
    }
    return total;
  }

}
