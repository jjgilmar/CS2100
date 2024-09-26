/*
Joey Gilmartin
CS2100
Game Class
The Game class has a constructor that creates a game object. It then has a turn method which simulates
one turn of a game of yahtzee. Lastly, it has a playGame method which loops through alternating player 1 and 2 turns
until the game is over. Then it decides a winner (or tie).
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Game
{
   public ScoreCard p1Card;
   public ScoreCard p2Card;
   /*
      Constructor Game creates a Game object and initalizes the player 1 and 2 scorecards.
   */
   public Game()
   {
      p1Card = new ScoreCard();
      p2Card = new ScoreCard();
   }
   /*
      Method turn plays a turn of yahtzee.
      @param ScoreCard s
      @return void
   */
   public void turn(ScoreCard s)
   {
      int numRolls;
      numRolls = 1;
      boolean scored = false;
      
      DiceRoll d = new DiceRoll();
      
      Scanner keyboard = new Scanner(System.in);
      String move;
      
      ArrayList<Boolean> saved = new ArrayList<Boolean>(5);    
      for (int i = 0; i < 5; i++) 
      {
         saved.add(false);
      }
      
      while(!scored)
      {
         
         System.out.print(s);
      
         System.out.printf("******************************\n");
         
         System.out.printf("\nDice:\n");
         for (int i = 0; i < d.getNumDice(); i++)
         {
            System.out.printf("%d: value %s  %s\n", i+1, d.getDie(i).toString(), (saved.get(i))? "SAVED":"");
         }
         
         
         System.out.printf("\nYou have rolled the dice %d time(s). You only get 3 rolls. ", numRolls);
         System.out.print("\nPlease select a die # to toggle it between save and unsave, \"roll\" or \"score\": ");
         move = keyboard.nextLine();
         move = move.toLowerCase();
         
         if (numRolls == 3)
         {
            move = "score";
            System.out.print("\n\nYou are out of rolls, you must score\n\n");
         }
         
         if (move.equals("roll"))
         {
            for (int i = 0; i < d.getNumDice(); i++)
            {
               
               if( !saved.get(i) )
               {
                  d.getDie(i).roll();
               }
            }
            numRolls++;
         }
         
         else if( move.equals("score") )
         {            
            CategoryValue chosen;
            int i = 0;
            
            while (i == 0)
            {
               try
               {
                  System.out.println(d);
                  
                  for (CategoryValue cv : CategoryValue.values())
                  {
               
                     if ( !s.checkScored( cv ) )
                     {
                        System.out.printf("\n%d: %s, %d points", cv.getValue() + 1, cv.toString(), s.getEvaluation(cv, d));
                     }
                  }
                  
                  try
                  {
                     System.out.printf("\nSelect a category that you have not scored in yet: ");
                     int categoryInt = keyboard.nextInt() - 1;
                     chosen = CategoryValue.values()[categoryInt];
                  
                     if ( categoryInt >= 0 && categoryInt <= 12 && !s.checkScored( chosen ) )
                     {
                        s.choose( chosen, d);
                        i++;
                        System.out.printf("\nYou score %d points in %s\n", s.getCategoryScore( chosen ), chosen.toString() );
                        scored = true;
                     }
                  }
                  
                  catch( InputMismatchException e )
                  {
                     System.out.printf("\nPlease enter a valid category number\n" );
                  }
               
               }
               catch( NumberFormatException e )
               {
                  System.out.printf("\nPlease enter a category you have not scored yet\n");
               }
               
               catch( IndexOutOfBoundsException e)
               {
                  System.out.printf("\nPlease enter a valid category number (1-13)\n");
               }
               
            }
         }
         
         else
         {
            try
            {
               int dieNum = Integer.parseInt(move);
               dieNum--;
               if ( saved.get(dieNum) )
               {
                  saved.set(dieNum, false);
               }
               else
               {
                  saved.set(dieNum, true);
               }
            }
            
            catch( NumberFormatException e)
            {
               System.out.printf("\nPlease enter a valid die #\n");
            }
            
            catch( IndexOutOfBoundsException e)
            {
               System.out.printf("\nPlease enter a valid die #\n");
            }
            
         }
      }
      
   }
   /*
      Method playGame calls turn for each palayer 13 times, and then determines a winner.
      @param ScoreCard s
      @return void
   */
   public void playGame()
   {
      ScoreCard p1Card = new ScoreCard();
      ScoreCard p2Card = new ScoreCard();
      
      System.out.printf("*******************************************************\n");
      System.out.printf("%35s\n", "WELCOME TO YAHTZEE");
      System.out.print("*******************************************************\n");
      for (int i = 0; i < 13; i++)
      {
         System.out.printf("\n*** Player 1: ***\n");
         turn(p1Card);
         System.out.printf("\n*** Player 2: ***\n");
         turn(p2Card);
      }
      System.out.printf("\n*** GAME OVER ***\n");
      System.out.printf("\nPlayer 1 Total Score: %d\n", p1Card.score());
      System.out.printf("\nPlayer 2 Total Score: %d\n", p2Card.score());
      
      if (p1Card.score() > p2Card.score())
      {
         System.out.printf("\n*** PLAYER 1 WINS! ***");
      }
      
      else if (p1Card.score() < p2Card.score())
      {
         System.out.printf("\n*** PLAYER 2 WINS! ***");
      }
      
      else
      {
         System.out.printf("\n*** IT'S A TIE! ***");
      }
      
   }
}