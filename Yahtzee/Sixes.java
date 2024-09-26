/*
Joey Gilmartin
CS2100
Sixes Class
The Sixes class extends the category class. It has one method, evaluate. This method
evaluates the dice for the Sixes category.
*/
public class Sixes extends Category
{
   /*
      The method evaluate evaluates the dice for category Sixes by counting the number
      of twos in the arrayList and multiplying by 6.
      @param Dice d
      @return int
   */
   public int evaluate(Dice d)
   {
      return 6 * d.count(6);
   }  
}