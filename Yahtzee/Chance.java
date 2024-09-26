/*
Joey Gilmartin
CS2100
Chance Class
The Chance class extends the category class. It has one method, evaluate. This method
evaluates the dice and sums their values.
*/
public class Chance extends Category
{
   /*
      The method evaluate evaluates the dice by taking the sum of their values.
      @param Dice d
      @return int
   */
   public int evaluate(Dice d)
   {
      return d.sum();
   }  
}