/*
Joey Gilmartin
CS2100
Die Class
The die class has a constructor to create a die by assigning a value to a number ranging 1 to 6.
It also has a roll feature which changes the value of the die. The toString method prints the value
in the form of a string. Lastly it has a getter for the its private variable value.
*/
import java.util.Random;

public class Die
{
   private static Random r = new Random();
   private int value;
   private static final int SIDES = 6;
   
   /*
      Constructor Die creates an Die object
      Sets the value to a random int between 1-6.
   */
   public Die()
   {
      value = r.nextInt( SIDES ) + 1;
   }
   /*
      Method roll 'rolls the die' by changing the value to a random int between 1-6.
      @param none
      @return none
   */
   public void roll()
   {
      value = r.nextInt( SIDES ) + 1;
   }
   /*
      Method getValue returns the value
      @param none
      @return int value
   */
   public int getValue()
   {
      return value;
   }
   /*
      Method toString returns the value as a string
      @param none
      @return String
   */
   @Override
   public String toString()
   {
      return String.valueOf(value);
   }
}