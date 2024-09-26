/*
Joey Gilmartin
CS2100
Tweet
The Tweet class has constructors that create Tweet objects. It also
has getters and setters for all instance variables allowing for the objects
to be changed. Lastly, it has override methods that can make the tweet 
object into a string and compare to tweet objects to see if they are equal.
*/
public class Tweet
{
   //class variable
   public final static int MAX_CHARS = 140;
   
   //instance variables
   private String screenName;
   private String content;
   
   /*
      method/ constructor Tweet creates a tweet object and shortens the content of
      the tweet to 140 chars
      @param String screenName
      @param String content
   */
   public Tweet(String screenName, String content)
   {
      if (content.length() > MAX_CHARS)
      {
         this.content = content.substring(0, MAX_CHARS);
      }
      else
      {
         this.content = content;
      } 
      
      this.screenName = screenName;
   }
   
   /*
      Copy Constructor Tweet creates a deep copy of a tweet object
      @param Tweet other
   */
   public Tweet(Tweet other)
   {
      this(other.screenName, other.content);
   }

   /*
      toString creates a string representation of a tweet. It also formats the  screenName 
      to have @ prior to the name. On the next line it will print the contentof the tweet.
      @param none
      @return a string
   */
   @Override
   public String toString()
   {
      return String.format("@%s \n \"%s\" \n", screenName, content);
   }
  
   /*
      equals overrides .equals() to determine if 2 tweets are equal
      2 tweets are equal if their screenNames and content are the same 
      @param Object other
      @return boolean
   */
   @Override
   public boolean equals(Object other)
   {
      Tweet tOther = (Tweet)other;
      return this.screenName.equals(tOther.screenName)
               && this.content.equals(tOther.content);
      
   }
   
   /*
      setScreenName allows the user to set the screenName
      @param String screenName
      @return void
   */
   public void setScreenName(String screenName)
   {
      this.screenName = screenName;
   }
   
   /*
      setContent allows the user to set the content of the tweet
      @param String content
      @return void
   */
   public void setContent(String content)
   {
      this.content = content;
   }
   
   /*
      getScreenName allows the user to get the screenName of the tweet
      @param none
      @return String screenName
   */
   public String getScreenName()
   {
      return screenName;
   }
   
   /*
      getContent allows the user to get the content of the tweet
      @param none
      @return String content
   */
   public String getContent()
   {
      return content;
   }

}