
/*
Joey Gilmartin
CS2100
FourOfAKind Class
The FourOfAKind class extends the category class. It has one method, evaluate. This method
evaluates the dice for Four of A Kind.
*/
public class FourOfAKind extends Category
{
   /*
      The method evaluate evaluates the dice for four of the same die values.
      @param Dice d
      @return int
   */
   public int evaluate(Dice d)
   {
      if (d.count(1) >= 4 || d.count(2) >= 4 || d.count(3) >= 4 || d.count(4) >= 4 || d.count(5) >= 4 || d.count(6) >= 4)
      {
         return d.sum();
      }
      return 0;
   }  
}