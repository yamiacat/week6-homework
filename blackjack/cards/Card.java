package cards;

public class Card implements Scorable {

  private CardSuit suit;
  private CardRank rank;
  private int score;

  public Card(CardSuit suit, CardRank rank) {
    this.suit = suit;
    this.rank = rank;
    this.score = score;
  }

  public CardSuit getSuit(){
    return this.suit;
  }

  public CardRank getRank(){
    return this.rank;
  }

  public String getCardName() {
    String returnString = "";
    returnString += this.rank.name();
    returnString += " of ";
    returnString += this.suit.name();
    return returnString;
  }

  public int getScore(){
    return this.score;
  }

  public void setScore(int newScore){
    this.score = newScore;
  }



}
