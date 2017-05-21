package game;

import java.util.*;
import game.*;
import cards.*;

   public interface Rulable {
      public String getGameName();
      public HashMap<CardRank, Integer> getRankScores();
      public HashMap<CardSuit, Integer> getSuitScores();
   }
