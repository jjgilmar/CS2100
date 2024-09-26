/*
Joey Gilmartin
CS2100
Author
The author class has constructors that create author objects. It also
has getters and setters which allow for the object to be changed. Lastly,
it has override methods that can change the author object to a string and
compare to author objects to see if they are equal.
*/
public class Author
{
   // instance variables
   private String fName;
   private String lName;
   private String email;
   
   //constructors
   /*
      Constructor Author creates an author object
      @param fName, lName, email
      @return an author object
   */
   public Author(String first, String last, String mail)
   {
      fName = first;
      lName = last;
      email = mail;
   }
   
   //copy constructor
   /*
      Copy Constructor Author creates a copy of a Author object
      @param Author other
      @return an Author object
   */
   public Author(Author other)
   {
      this(other.fName, other.lName, other.email);
   }
   /*
      method getfName gets the fName
      @param none
      @return String fName
   */
   public String getfName()
   {
      return fName;
   }
      /*
      method setIsbn sets the fName
      @param String first
      @return void
   */
   public void setfName(String first)
   {
      fName = first;
   }  
   /*
      method getlName gets the lName
      @param none
      @return String lName
   */
   public String getlName()
   {
      return lName;
   }
   /*
      method setlName sets the lName
      @param String last
      @return void
   */
   public void setlName(String last)
   {
      lName = last;
   }   
   /*
      method getEmail gets the email
      @param none
      @return String email
   */
   public String getEmail()
   {
      return email;
   }
   /*
      method setEmail sets the Email
      @param String mail
      @return void
   */
   public void setEmail(String mail)
   {
      email = mail;
   }  
   /*
      method toString converts the author object to a string
      @param none
      @return String
   */   
   @Override
   public String toString()
   {
      return String.format("%s %s <%s>", fName, lName, email);
   }
   /*
      method equals checks to see if 2 authors are equal by comparing their first and last names
      @param none
      @return boolean
   */  
   @Override
   public boolean equals(Object other)
   {
      Author aOther = (Author)other;
      
      return this.fName.equals(aOther.fName)
               && this.lName.equals(aOther.lName);
   }
}