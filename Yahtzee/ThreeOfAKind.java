/*
Joey Gilmartin
CS2100
ThreeOfAKind Class
The ThreeOfAKind class extends the category class. It has one method, evaluate. This method
evaluates the dice for Three of A Kind.
*/
public class ThreeOfAKind extends Category
{
   /*
      The method evaluate evaluates the dice for three of the same die values.
      @param Dice d
      @return int
   */
   public int evaluate(Dice d)
   {
      if (d.count(1) >= 3 || d.count(2) >= 3 || d.count(3) >= 3 || d.count(4) >= 3 || d.count(5) >= 3 || d.count(6) >= 3)
      {
         return d.sum();
      }
      return 0;
   }  
}