/*
Joey Gilmartin
CS2100
Twos Class
The Twos class extends the category class. It has one method, evaluate. This method
evaluates the dice for the Twos category.
*/
public class Twos extends Category
{
   /*
      The method evaluate evaluates the dice for category Twos by counting the number
      of twos in the arrayList and multiplying by 2.
      @param Dice d
      @return int
   */
   public int evaluate(Dice d)
   {
      return 2 * d.count(2);
   }  
}