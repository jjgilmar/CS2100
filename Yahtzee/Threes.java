/*
Joey Gilmartin
CS2100
Threes Class
The Threes class extends the category class. It has one method, evaluate. This method
evaluates the dice for the Threes category.
*/
public class Threes extends Category
{
   /*
      The method evaluate evaluates the dice for category Threes by counting the number
      of twos in the arrayList and multiplying by 3.
      @param Dice d
      @return int
   */
   public int evaluate(Dice d)
   {
      return 3 * d.count(3);
   }  
}