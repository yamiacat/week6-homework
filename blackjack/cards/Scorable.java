package cards;

public interface Scorable {

  public CardSuit getSuit();
  public CardRank getRank();
  public String getCardName();
  public int getScore();
  public void setScore(int newScore);

}
