package cards;
import java.util.*;
import game.*;

public class DeckGenerator {

  private Rulable intendedGame;
  private ArrayList<Scorable> deck;
  private int numberOfPacks;

  public DeckGenerator(Rulable intendedGame, int numberOfPacks) {
    this.intendedGame = intendedGame;
    this.deck = new ArrayList<Scorable>();
    this.numberOfPacks = numberOfPacks;

    CardSuit[] allSuits = CardSuit.values();
    CardRank[] allRanks = CardRank.values();

    for (int i = 0; i < this.numberOfPacks; i++) {
      for (CardSuit suit : allSuits){
        for (CardRank rank : allRanks){
          Scorable card = new Card(suit, rank);
          deck.add(card);
        }
      }
    }

    for (Scorable card : this.deck) {
      Integer score = (intendedGame.getRankScores()).get(card.getRank());
      int intScore = score.intValue();
      card.setScore(intScore);
    }


    Collections.shuffle(deck);

  }

  public void addCard(Scorable card) {
    deck.add(card);
  }

  public String getIntendedGame() {
    return this.intendedGame.getGameName();
  }

  public int countDeck() {
    return deck.size();
  }

  public ArrayList<Scorable> getDeck() {
    return deck;
  }


  public Scorable dealCard() {
    return (this.deck.remove(0));
  }

// THIS WAS MADE TO PRINT ALL TO CONSOLE JUST TO SEE WHATS GOING ON IN THE DECK
  public String printAllCards(){
    String returnString = "";
    for (Scorable card : deck){
      returnString += card.getCardName() + "\n";
    }
    return returnString;
  }

}
