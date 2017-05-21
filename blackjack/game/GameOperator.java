package game;

import cards.*;
import players.*;
import java.util.*;

public class GameOperator {

  private ArrayList<Player> playerList;
  private ArrayList<Scorable> deck;
  private HashMap <Player, ArrayList<Scorable>> allHands;


  public GameOperator(GameGenerator game) {
    this.playerList = game.getPlayers();
    this.deck = game.getDeck();
    this.allHands = new HashMap<Player, ArrayList<Scorable>>();

    for (Player player : playerList) {
      player.receiveCard(this.deck.remove(0));
      player.playCard();
      // player.receiveCard(this.deck.remove(0));
      // player.playCard();
    }
  }

  public ArrayList<Player> getPlayers(){
    return this.playerList;
  }

  public HashMap <Player, ArrayList<Scorable>> getAllHands() {
    for (Player player : playerList) {
      allHands.put(player, player.getHand());
    }
  return this.allHands;
  }

  public String reportAllHands(){
    String returnString = "";
    for (Player player : playerList) {
      returnString += player.getName() + " plays: ";
      for (Scorable card : player.getHand()){
        returnString += card.getCardName() + "\n";
      }
    }
    return returnString;
  }

}
