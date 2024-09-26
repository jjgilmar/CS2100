/*
Joey Gilmartin
CS2100
Dice Class
The dice class has a constructor that creates an arrayList of 5 die. It also has a alternate constructor that 
takes an integer parameter to set the capacity of the arrayList. The dice class has multiple features such as
adding a die, getting the number of dice, getting a die at an index, removing a die, counting the die, summing 
the die printing the arrayList using a toString.
*/
import java.util.ArrayList;

public class Dice
{
   private ArrayList<Die> dice;
   private static final int DEF_CAP = 5;
   /*
      Constructor Dice creates an Dice object by creating the arrayList.
   */
   public Dice()
   {
      dice = new ArrayList<Die>(DEF_CAP);
   }
   /*
      Constructor Dice( int num ) creates an Dice object by creating the arrayList
      with num indexes in the arrayList.
   */
   public Dice(int num)
   {
      dice = new ArrayList<Die>(num);
   }
   /*
      Method addDie adds a die to the array list.
      @param Die d
      @return void
   */
   public void addDie(Die d)
   {
      dice.add(d);
   }
   /*
      Method getNumDie returns the size of dice.
      @param none
      @return int
   */
   public int getNumDice()
   {
      return dice.size();
   }
   /*
      Method getDie returns the die at the index given.
      @param int i
      @return Die
   */
   public Die getDie(int i)
   {
      return dice.get(i);
   }
   /*
      Method removeDie removes and returns the die at the index given.
      @param int i
      @return Die
   */
   public Die removeDie(int i)
   {
      return dice.remove(i);
   }
   /*
      Method count counts the number of die in Dice with the given value.
      @param int val
      @return int count
   */
   public int count(int val)
   {
      int count = 0;
      for ( Die d : dice)
      {
         if ( d.getValue() == val )
         {
            count++;
         }
      }
      return count;
   }
   /*
      Method sum sums the value of all the die in the arrayList
      @param none
      @return int sum
   */
   public int sum()
   {
      int sum = 0;
      for (Die d : dice)
      {
         sum += d.getValue();
      }
      return sum;
   }
   /*
      Method contains checks to see if the Dice arrayList contains a given value
      @param int value
      @return boolean
   */
   public boolean contains(int val)
   {
      for ( Die d : dice)
      {
         if ( d.getValue() == val )
         {
            return true;
         }
      }
      return false;
   }
   /*
      Method toString prints the dice arrayList
      @param none
      @return String
   */
   @Override
   public String toString()
   {
      String s = "Dice:";
      for ( Die d : dice)
      {
         s+= String.format("\n%d:  value %d", dice.indexOf(d) + 1, d.getValue());
      }
      return s;
   }
}