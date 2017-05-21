package game;

import java.util.*;
import cards.*;


public class BlackjackRules implements Rulable {

  private String gameName;
  private HashMap <CardRank, Integer> rankScores;
  private HashMap <CardSuit, Integer> suitScores;

  public BlackjackRules() {
    this.gameName = "Blackjack";
    this.rankScores = new HashMap<CardRank, Integer>();
    this.suitScores = new HashMap<CardSuit, Integer>();

    rankScores.put(CardRank.ACE, 11);
    rankScores.put(CardRank.TWO, 2);
    rankScores.put(CardRank.THREE, 3);
    rankScores.put(CardRank.FOUR, 4);
    rankScores.put(CardRank.FIVE, 5);
    rankScores.put(CardRank.SIX, 6);
    rankScores.put(CardRank.SEVEN, 7);
    rankScores.put(CardRank.EIGHT, 8);
    rankScores.put(CardRank.NINE, 9);
    rankScores.put(CardRank.TEN, 10);
    rankScores.put(CardRank.JACK, 10);
    rankScores.put(CardRank.QUEEN, 10);
    rankScores.put(CardRank.KING, 10);

    suitScores.put(CardSuit.CLUBS, 0);
    suitScores.put(CardSuit.DIAMONDS, 0);
    suitScores.put(CardSuit.HEARTS, 0);
    suitScores.put(CardSuit.SPADES, 0);

  }

  public String getGameName() {
    return this.gameName;
  }

  public HashMap<CardRank, Integer> getRankScores() {
    return this.rankScores;
  }

  public HashMap<CardSuit, Integer> getSuitScores(){
    return this.suitScores;
  }

}
