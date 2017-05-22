package game;
import cards.*;
import players.*;
import java.util.*;


public class Score {

  private Turn turn;
  private ArrayList<Player> players;
  private HashMap<Player, Integer> scoreHash;
  ArrayList<Player> winningPlayers;

  public Score(Turn turn) {
    this.winningPlayers = new ArrayList<Player>();
    this.players = players;
    this.turn = turn;
    ArrayList<Player> players = turn.getPlayers();

    HashMap<Player, Integer> scoreHash = new HashMap<>();

    for (Player player : players) {
      Integer score = player.getHandScore();
      scoreHash.put(player, score);
    }

    int maxValueInMap = (Collections.max(scoreHash.values()));
    for (Map.Entry <Player, Integer> entry : scoreHash.entrySet()) {
      if (entry.getValue() == maxValueInMap) {
        winningPlayers.add(entry.getKey());
      }
    }
  }

  public ArrayList<Player> getWinningPlayers() {
    return this.winningPlayers;
  }



  public String reportWinningPlayers() {
    String returnList = "";
    for (Player player : this.winningPlayers) {
      returnList += (player.getName() + ", ");
    }
    return returnList;
  }

}
