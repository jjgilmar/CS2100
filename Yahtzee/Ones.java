/*
Joey Gilmartin
CS2100
Ones Class
The ones class extends the category class. It has one method, evaluate. This method
evaluates the dice for the ones category.
*/
public class Ones extends Category
{
   /*
      The method evaluate evaluates the dice for category Ones by counting the number
      of ones in the arrayList.
      @param Dice d
      @return int
   */
   public int evaluate(Dice d)
   {
      return d.count(1);
   }  
}