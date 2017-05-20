package cards;
import java.util.*;


public class DeckGenerator {

  private String intendedGame;
  private ArrayList<Card> deck;

  public DeckGenerator(String intendedGame) {
    this.intendedGame = intendedGame;
    this.deck = new ArrayList<Card>();

    CardSuit[] allSuits = CardSuit.values();
    CardRank[] allRanks = CardRank.values();

    for (CardSuit suit : allSuits){
      for (CardRank rank : allRanks){
        Card card = new Card(suit, rank);
        deck.add(card);
      }
    }
    Collections.shuffle(deck);

  }

  public void addCard(Card card) {
    deck.add(card);
  }

  public String getIntendedGame(){
    return this.intendedGame;
  }

  public int countDeck(){
    return deck.size();
  }

  public ArrayList<Card> getDeck(){
    return deck;
  }

  public String printAllCards(){
    String returnString = "";
    for (Card card : deck){
      returnString += card.getCardName() + "\n";
    }
    return returnString;
  }

}
