package game;

import game.*;
import cards.*;
import players.*;
import java.util.*;

public class GameGenerator {

  private Rulable intendedGame;
  private int numberOfPlayers;
  private int numberOfPacks;
  private ArrayList<Player> potentialPlayerList;
  private ArrayList<Player> playerList;
  private Player player0;
  private Player player1;
  private Player player2;
  private Player player3;
  private DeckGenerator deck;

  public GameGenerator(Rulable intendedGame, int numberOfPlayers, int numberOfPacks) {
    this.intendedGame = intendedGame;
    this.numberOfPlayers = numberOfPlayers;
    this.numberOfPacks = numberOfPacks;
    this.potentialPlayerList = new ArrayList<Player>();
    this.playerList = new ArrayList<Player>();
    this.deck = new DeckGenerator(this.intendedGame, this.numberOfPacks);


    //PREGENERATED PLAYERS
    Player player0 = new Player("The Dealer");
    Player player1 = new Player("Lemmy");
    Player player2 = new Player("Max");
    Player player3 = new Player("Nigel");

    potentialPlayerList.add(player0);
    potentialPlayerList.add(player1);
    potentialPlayerList.add(player2);
    potentialPlayerList.add(player3);


    for (int i = 0; i < this.numberOfPlayers; i++) {
      playerList.add(potentialPlayerList.get(i));
    }



  }


  public String getGameName() {
    return this.intendedGame.getGameName();
  }

  public int countPlayers() {
    return this.playerList.size();
  }

  public ArrayList<Player> getPlayers(){
    return this.playerList;
  }

  public String listPlayerNames() {
    String returnList = "";
    for (Player player : this.playerList) {
      returnList += (player.getName() + ", ");
    }
    return returnList;
  }

  public int countPacks(){
    return this.numberOfPacks;
  }

  public ArrayList<Scorable> getDeck(){
    return this.deck.getDeck();
  }

}
