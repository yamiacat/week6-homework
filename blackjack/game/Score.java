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
    this.turn = turn;
    ArrayList<Player> players = turn.getPlayers();

    HashMap<Player, Integer> scoreHash = new HashMap<>();
    this.scoreHash = scoreHash;


// TESTED THIS BY CHANGING ALL CARD SCORES TO 11

    for (Player player : players) {
      ArrayList<Scorable> hand = player.getHand();
      Integer score = 0;
      for (Scorable card : hand) {
        score += card.getScore();
      if (score > 21) {
        score -= 10;
        }
      }

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

  public String reportAllHandScores() {
    String returnList = "";
    for (Map.Entry <Player, Integer> entry: scoreHash.entrySet()) {
      returnList += (entry.getKey().getName() + " scores " + entry.getValue() + "\n");
      }
    return returnList;
  }

  public String reportWinningPlayers() {
    String returnList = "";
    for (Player player : this.winningPlayers) {
      returnList += (player.getName() + ", ");
    }
    return returnList;
  }

}
