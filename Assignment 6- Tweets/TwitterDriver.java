/*
Joey Gilmartin
CS2100
Book
The TwitterDriver class tests the methods in the Tweet and 
TwitterFeed classes. It takes tweets from a file and prints 
the output. 
*/
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
public class TwitterDriver
{
   public static void main(String [] args) throws IOException
   {
      //variables
      Scanner input = new Scanner(new File ("feed.txt"));
      String screenName;
      String content;
      
      //file
      File f = new File("feed.txt");
      Scanner infile = new Scanner(f);
      //read screenName first
      screenName = infile.nextLine();
      //create twitter feed
      TwitterFeed feed = new TwitterFeed( screenName );
      
      //read from file
      while(infile.hasNext())
      {
         screenName = infile.nextLine();
         content = infile.nextLine();
         Tweet t = new Tweet ( screenName, content );
         feed.addTweet(t); 
      }
      //test toString
      System.out.println(feed.toString());
      //test tweetsBy
      System.out.println(feed.tweetsBy("BillGates").toString());
      //close infile
      input.close();
      
   }
}