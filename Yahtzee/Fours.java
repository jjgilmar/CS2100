/*
Joey Gilmartin
CS2100
Fours Class
The Fours class extends the category class. It has one method, evaluate. This method
evaluates the dice for the Fours category.
*/
public class Fours extends Category
{
   /*
      The method evaluate evaluates the dice for category Fours by counting the number
      of twos in the arrayList and multiplying by 4.
      @param Dice d
      @return int
   */
   public int evaluate(Dice d)
   {
      return 4 * d.count(4);
   }  
}