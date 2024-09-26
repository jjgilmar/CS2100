/*
Joey Gilmartin
CS2100
FullHouse Class
The FullHouse class extends the category class. It has one method, evaluate. This method
evaluates the dice for a full house (3 of one die value, 2 of another).
*/
public class FullHouse extends Category
{
   /*
      The method evaluate evaluates the dice for a full house( 3 of one die value and 2 of another)
      @param Dice d
      @return int
   */
   public int evaluate(Dice d)
   {
      if (d.count(1) == 3 || d.count(2) == 3 || d.count(3) == 3 || d.count(4) == 3 || d.count(5) == 3 || d.count(6) == 3)
      {
         if (d.count(1) == 2 || d.count(2) == 2 || d.count(3) == 2 || d.count(4) == 2 || d.count(5) == 2 || d.count(6) == 2)
         {
            return 25;
         }
      }
      return 0;
   }  
}