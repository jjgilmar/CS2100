/*
Joey Gilmartin
CS2100
Category Class
The category class is an abstract class. It has variables score and used with getters for both variables.
It has an abstract method evaluate that is overwritten in every category. Additionally, it has a method
addValue that calls evaluate, sets the score, and sets used to true.
*/
public abstract class Category
{
   private int score;
   private boolean used;
   
   /*
      The abstract method evaluate is overwritten in every category.
      @param Dice d
      @return int
   */
   public abstract int evaluate(Dice d);
   /*
      The method addValue calls evaluate, sets the score to the return value of evaluate,
      and sets used to true.
      @param Dice d
      @return void
   */
   public void addValue(Dice d)
   {
      score += evaluate(d);
      used = true;
   }
   /*
      The method getScore returns score
      @param none
      @return int
   */
   public int getScore()
   {
      return score;
   }
   /*
      The method getUsed returns used
      @param none
      @return boolean
   */
   public boolean getUsed()
   {
      return used;
   }
}