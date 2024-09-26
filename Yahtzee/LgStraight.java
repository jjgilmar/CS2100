/*
Joey Gilmartin
CS2100
LgStraight Class
The LgStraight class extends the category class. It has one method, evaluate. This method
evaluates the dice for a large straight (5 values in a row).
*/
public class LgStraight extends Category
{
   /*
      The method evaluate evaluates the dice for a large straight.
      @param Dice d
      @return int
   */
   public int evaluate(Dice d)
   {
      if (d.count(2) == 1 && d.count(3) == 1 && d.count(4) == 1 && d.count(5) == 1)
      {
         return 40;
      }
      return 0;
   }  
}