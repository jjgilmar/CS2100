/*
Joey Gilmartin
CS2100
GameDriver
GameDriver is a simple file that creates a game object and calls the playGame function in the game class.
*/
public class GameDriver
{
   public static void main (String args[])
   {
      Game g = new Game();
      g.playGame();
   }
}