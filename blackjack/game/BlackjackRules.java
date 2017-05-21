package game;

  public class BlackjackRules implements Rulable {

    private String gameName;

    public BlackjackRules() {
      this.gameName = "Blackjack";
    }

  public String getGameName() {
    return this.gameName;
  }

  }
