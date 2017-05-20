package game;

import cards.*;
import players.*;
import java.util.*;

public class GameGenerator {

  private String gameName;
  private int numberOfPlayers;
  private ArrayList<Player> potentialPlayerList;
  private ArrayList<Player> playerList;
  private Player player0;
  private Player player1;
  private Player player2;
  private Player player3;

  public GameGenerator(String gameName, int numberOfPlayers) {
    this.gameName = gameName;
    this.numberOfPlayers = numberOfPlayers;
    this.potentialPlayerList = new ArrayList<Player>();
    this.playerList = new ArrayList<Player>();


    //PREGENERATED PLAYERS
    Player player0 = new Player("Dealer");
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
    return this.gameName;
  }

  public int countPlayers() {
    return this.playerList.size();
  }

  public ArrayList<Player> getPlayers(){
    return this.playerList;
  }
}
