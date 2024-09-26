/*
Joey Gilmartin
CS2100
Fives Class
The Fivess class extends the category class. It has one method, evaluate. This method
evaluates the dice for the Fives category.
*/
public class Fives extends Category
{
   /*
      The method evaluate evaluates the dice for category Fives by counting the number
      of twos in the arrayList and multiplying by 5.
      @param Dice d
      @return int
   */
   public int evaluate(Dice d)
   {
      return 5 * d.count(5);
   }  
}