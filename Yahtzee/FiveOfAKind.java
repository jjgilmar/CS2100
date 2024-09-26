/*
Joey Gilmartin
CS2100
FiveOfAKind Class
The FiveOfAKind class extends the category class. It has one method, evaluate. This method
evaluates the dice for Five of A Kind.
*/
public class FiveOfAKind extends Category
{
   /*
      The method evaluate evaluates the dice for five of the same die values.
      @param Dice d
      @return int
   */
   public int evaluate(Dice d)
   {
      if (d.count(1) == 5 || d.count(2) == 5 || d.count(3) == 5 || d.count(4) == 5 || d.count(5) == 5 || d.count(6) == 5)
      {
         return 50;
      }
      return 0;
   }  
   
}