/*
Joey Gilmartin
CS2100
DiceRoll Class
The diceRoll class extends the dice class. It has its own constructor that class the addDie function
in the dice class. It also has a toss method that rolls all the dice in the dice arrayList.
*/
import java.util.ArrayList;

public class DiceRoll extends Dice
{
  
   private static final int NUM_DIE = 5;
   /*
      Constructor DiceRoll creates an DiceRoll object by adding new Die to the dice arrayList.
   */
   public DiceRoll()
   {
      for (int i = 0; i < NUM_DIE; i++)
      {
         super.addDie(new Die());
      }
   }
   /*
      Method toss rolls all the die objects in the dice arrayList.
      @param none
      @return toss
   */
   public void toss()
   {
      for (int i = 0; i < super.getNumDice(); i++)
      {
         super.getDie(i).roll();
      }
   }
   
}