/*
Joey Gilmartin
CS2100
ScoreCard Class
The ScoreCard class has a constructor that creates an arrayList full of each category. The 
ScoreCard class uses the enumerated types given in CategoryValue to perform multiple functions that
scorecard needs such as choose, getEvaluation, checkScored, getCategoryScore, scoreTop, scoreBottom, and toString. 
*/
import java.util.ArrayList;
public class ScoreCard
{
   private ArrayList<Category> scorecard;
   private int yahtzeeBonus;
   private static final int NUM_CATS = 13;
   /*
      Constructor ScoreCard creates a ScoreCard object by creating the arrayList, initializing
      yahtzee bonus, as well as adding each of the categories to the scorecard.
   */
   public ScoreCard()
   {
        scorecard = new ArrayList<>(NUM_CATS);
        yahtzeeBonus = 0;
        
        scorecard.add(new Ones());
        scorecard.add(new Twos());
        scorecard.add(new Threes());
        scorecard.add(new Fours());
        scorecard.add(new Fives());
        scorecard.add(new Sixes());
        scorecard.add(new ThreeOfAKind());
        scorecard.add(new FourOfAKind());
        scorecard.add(new FullHouse());
        scorecard.add(new SmStraight());
        scorecard.add(new LgStraight());
        scorecard.add(new FiveOfAKind());
        scorecard.add(new Chance());
   }
   /*
      Method choose takes a category value and dice and calls addValue for the given category.
      @param CategoryValue cv, Die d
      @return void
   */
   public void choose(CategoryValue cv, Dice d)
   {
      Category category = scorecard.get(cv.getValue());
      category.addValue(d);
   }
   /*
      Method getEvaluation takes a category value and dice and calls evaluate for the given category.
      @param CategoryValue cv, Die d
      @return int
   */
   public int getEvaluation(CategoryValue cv, Dice d)
   {
      Category category = scorecard.get(cv.getValue());
      return category.evaluate(d);
   }
   /*
      Method checkScored takes a category value and calls getUsed for the given category.
      @param CategoryValue cv
      @return boolean
   */
   public boolean checkScored(CategoryValue cv)
   {
      Category category = scorecard.get(cv.getValue());
      return category.getUsed();
   }
   /*
      Method getCategoryScored takes a category value and calls getScore for the given category.
      @param CategoryValue cv
      @return int
   */
   public int getCategoryScore(CategoryValue cv)
   {
      Category category = scorecard.get(cv.getValue());
      return category.getScore();
   }
   /*
      Method scoreTop scores the top of the scorecard and adds a bonus if it is over 63.
      @param none
      @return int
   */
   public int scoreTop()
   {
      int topScore = 0;
      for (int i = 0; i <= 5; i++)
      {
         topScore += scorecard.get(i).getScore();
      }
      if (topScore > 63)
      {
         topScore += 35;
      }
      return topScore;
   }
   /*
      Method scoreBottom scores the top of the scorecard.
      @param none
      @return int
   */
   public int scoreBottom()
   {
      int bottomScore = 0;
      for (int i = 6; i < 12; i++)
      {
         bottomScore += scorecard.get(i).getScore();
      }
      return bottomScore;
   }
   /*
      Method score scores the scorecard by adding scoreTop() and scoreBottom().
      @param none
      @return int
   */
   public int score()
   {
      return scoreTop() + scoreBottom();
   }
   /*
      Method getYahtzeeBonus gets yahtzeeBonus.
      @param none
      @return int
   */
   private int getYahtzeeBonus()
   {
      return yahtzeeBonus;
   }
   /*
      Method toString formats and returns the ScoreCard in a String Format.
      @param none
      @return String s
   */
   public String toString()
   {
      String s = String.format("\nCurrent Scorecard:");
      for (CategoryValue cv : CategoryValue.values())
      {
        s +=  String.format("\n%s: %d", cv.toString(), scorecard.get(cv.getValue()).getScore());
      }
      s +=  String.format("\n%s: %d", "Yahtzee Bonus", getYahtzeeBonus());
      s +=  String.format("\n%s: %d", "Upper Total", scoreTop());
      s +=  String.format("\n%s: %d", "Lower Total", scoreBottom());
      s +=  String.format("\n%s: %d\n\n", "Total", score());
      
      return s;
      }
   
   
}