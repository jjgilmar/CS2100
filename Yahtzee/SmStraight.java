/*
Joey Gilmartin
CS2100
SmStraight Class
The SmStraight class extends the category class. It has one method, evaluate. This method
evaluates the dice for a small straight (4 values in a row).
*/
public class SmStraight extends Category
{
   
   public int evaluate(Dice d)
   {
      /*
      The method evaluate evaluates the dice for a small straight.
      @param Dice d
      @return int
      */
      if (d.contains(3) && d.contains(4))
      {
         if(d.contains(1) && d.contains(2))
         {
            return 30;
         }
         if(d.contains(5) && d.contains(6))
         {
            return 30;
         }
         if(d.contains(2) && d.contains(5))
         {
            return 30;
         }
      }
      
      return 0;
   }  
}