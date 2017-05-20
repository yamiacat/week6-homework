package cards;

public interface Scorable {

  public CardSuit getSuit();
  public CardRank getRank();
  public String getCardName();
  public int getValue();

}
