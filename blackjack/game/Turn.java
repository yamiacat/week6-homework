package game;
import cards.*;
import players.*;
import java.util.*;


public class Turn implements Turnable {

  private ArrayList<Player> playerList;
  private ArrayList<Scorable> deck;


  public Turn(GameGenerator game) {
    this.playerList = game.getPlayers();
    this.deck = game.getDeck();


    for (Player player : playerList) {
      player.receiveCard(this.deck.remove(0));
      player.playCard();
      player.receiveCard(this.deck.remove(0));
      player.playCard();
    }


  }

  public ArrayList<Player> getPlayers(){
    return this.playerList;
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

  public String reportAllHandScores() {
    String returnList = "";
    for (Player player : playerList) {
      returnList += (player.getName() + " scores " + player.getHandScore() + ", ");
    }
    return returnList;
  }

  public String printAllCards(){
    String returnString = "";
    for (Scorable card : deck){
      returnString += card.getCardName() + " scoring " + card.getScore() + "\n";
    }
    return returnString;
  }


}
