package cards;

public class Card {

  private CardSuit suit;
  private CardRank rank;
  // private int value;

  public Card(CardSuit suit, CardRank rank) {
    this.suit = suit;
    this.rank = rank;
    // this.value = value;
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
  //
  // public int getValue(){
  //   return this.value;
  // }
  //
  // public void setValue(int newValue){
  //   this.value = newValue;
  // }



}
