/*
Joey Gilmartin
CS2100
Book
The Book class has constructors that create Book objects. It also
has getters and setters for all instance variables allowing for the objects
to be changed. Lastly, it has override methods that can make the book 
object into a string and compare to book objects to see if they are equal.
*/
public class Book
{
   // instance variables
   private String isbn;
   private String title;
   private Author author;
   private String publisher;
   private int numPages;
   
   //constructors
   /*
      Constructor book creates a book object
      @param isbn, title, author, publisher, numPages
      @return a book object
   */
   public Book(String isbn, String title, Author author, String publisher, int numPages)
   {
      this.isbn = isbn;
      this.title = title;
      this.author = author;
      this.publisher = publisher;
      this.numPages = numPages;
      
   }
      
   //copy constructor
   /*
      Copy Constructor book creates a deep copy of a book object
      @param book other
      @return a book object
   */
   public Book(Book other)
   {
      this(other.isbn, other.title, other.author, other.publisher, other.numPages);
   
   }
   /*
      method getIsbn gets the isbn
      @param none
      @return isbn
   */
   public String getIsbn()
   {
      return isbn;
   }
   /*
      method setIsbn sets the isbn
      @param isbn
      @return void
   */
   public void setIsbn(String isbn)
   {
      this.isbn = isbn;
   } 
   /*
      method getTitle gets the title
      @param none
      @return String title
   */
   public String getTitle()
   {
      return title;
   }
   /*
      method setTitle sets the title
      @param String title
      @return none
   */
   public void setTitle(String title)
   {
      this.title = title;
   } 
   /*
      method getAuthor gets the author
      @param none
      @return Author author
   */
   public Author getAuthor()
   {
      return author;
   }
   /*
      method setAuthor sets the author
      @param Author author
      @return void
   */
   public void setAuthor(Author author)
   {
      this.author = author;
   } 
    /*
      method getPublisher gets the publisher
      @param none
      @return String publisher
   */
   public String getPublisher()
   {
      return publisher;
   }
    /*
      method setPublisher sets the author
      @param String publisher
      @return void
   */
   public void setPublisher(String publisher)
   {
      this.publisher = publisher;
   }    
   /*
      method getNumPages gets the number of pages
      @param none
      @return int numPages
   */  
   public int getNumPages()
   {
      return numPages;
   }
   /*
      method setNumPages sets the number of pages
      @param int numPages
      @return void
   */ 
   public void setNumPages(int num)
   {
      numPages = num;
   }  
   /*
      method toString converts the book object to a string
      @param none
      @return String
   */ 
   @Override
   public String toString()
   {
      return String.format("%s, %s (ISBN-10 #%s, %d pages)", title, author, isbn, numPages);
   }
   /*
      method equals checks to see if 2 books are equal by comparing their isbn, title, and author
      @param none
      @return boolean
   */ 
   @Override
   public boolean equals(Object other)
   {
      Book bOther = (Book)other;
      
      return this.isbn.equals(bOther.isbn)
               && this.title.equals(bOther.title)
               && this.author.equals(bOther.author);
   }
}