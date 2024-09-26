/*
Joey Gilmartin
CS2100
TwitterFeed
The TwitterFeed class has constructors that create TwitterFeed ArrayLists. It also
has getters for the feed and ownerScreenName. It has an override toString method that 
can make the TwitterFeed object into a string. The last method is a method
called tweetsBy that takes a screenName and finds tweets by that author.
*/
import java.util.ArrayList;

public class TwitterFeed
{
   // instance variables
   private ArrayList<Tweet> feed;  
    
   // class constant
   private final static int INITIAL_CAPACITY = 100;
   private String ownerScreenName;

   /*
      method/constructor TwitterFeed creates an ArrayList TwitterFeed
      @param String OwnerScreenName
   */
   public TwitterFeed( String ownerScreenName )
   {
      this.ownerScreenName = ownerScreenName;
      feed = new ArrayList<Tweet>(INITIAL_CAPACITY);
   }
   
   /*
      getOwnerScreenName allows the user to get the ownerScreenName of the tweet
      @param none
      @return String ownerScreenName
   */ 
   public String getOwnerScreenName()
   {
      
      return ownerScreenName;
   }
   
   
   /*
      getFeed creates a copy of the feed and returns it.
      @param none
      @return ArrayList<Tweet> feedCopy
   */
   public ArrayList<Tweet> getFeed()
   {
      ArrayList<Tweet> feedCopy = new ArrayList<Tweet>(INITIAL_CAPACITY);
      for(Tweet t : feed)
      {
         feedCopy.add(t);
      }
   
      return feedCopy;
   }
   
   
   /*
      addTweet allows the user to add a tweet to the end of the ArrayList(Twitterfeed)
      by creating the tweet and then adding it.
      @param String screenName, String content
      @return void 
   */ 
   public void addTweet(String screenName, String content)
   {
      Tweet t1 = new Tweet(screenName, content);
      feed.add(t1);
   }
   
   /*
      addTweet allows the user to add a tweet to the end of the ArrayList(Twitterfeed).
      @param Tweet tweet
      @return void
   */ 
   public void addTweet(Tweet tweet)
   {
      feed.add(tweet);
   }
   
   /*
      toString creates a string representation of a twitter feed. It also formats the 
      to have @ prior to the name. On the next line it will print the contentof the tweet.
      @param none
      @return a string
   */
   @Override
   public String toString()
   {  
      String s = "Feed of @" + ownerScreenName + "\n";
      for(Tweet t : feed)
      {
         s += t.toString();
      }
      return s;
   }
   
   /*
      tweetsBy searches through the twitter feed finding tweets written
      by the screenName that was given. It takes these tweets and adds them
      to a new ArrayList tweetsBy.
      @param String screenName
      @return ArrayList<Tweet>
   */
   public ArrayList<Tweet> tweetsBy(String screenName)
   {
      ArrayList<Tweet> tweetsBy = new ArrayList<Tweet>(INITIAL_CAPACITY);
      
      for(Tweet t : feed)
      {
         if(t.getScreenName().equals(screenName))
         {
            tweetsBy.add(new Tweet(t));
         }
      }
      return tweetsBy;
   }

}