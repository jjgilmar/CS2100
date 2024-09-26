/*
Joey Gilmartin
CS2100
Person
The person class has constructors that can create person objects. It has getters
and setters for its 3 instance variables name, address, and phone. It also
has toString and equals methods.
*/
public class Person
{
   private String name, address, phone;
   
   /*
      Constructor Person creates an person object
      @param String name, address, phone
   */
   public Person (String name, String address, String phone)
   {
      this.name = name;
      this.address = address;
      this.phone = phone;
   }
   
   /*
      method getName gets the Name
      @param none
      @return String Name
   */
   public String getName()
   {
      return name;
   }
   
   /*
      method getAddress gets the address
      @param none
      @return String address
   */
   public String getAddress()
   {
      return address;
   }
   
   /*
      method getPhone gets the Phone number
      @param none
      @return String phone
   */
   public String getPhone()
   {
      return phone;
   }
   
   /*
      method setName sets the Name
      @param String n
      @return void
   */
   public void setName(String n)
   {
      name = n;
   }
   
   /*
      method setAddress sets the Address
      @param String a
      @return void
   */
   public void setAddress(String a)
   {
      address = a;
   }
   
   /*
      method setPhone sets the Phone number
      @param String p
      @return void
   */
   public void setPhone(String p)
   {
      phone = p;
   }
   
   /*
      method toString converts the person object to a string
      @param none
      @return String
   */ 
   @Override
   public String toString()
   {
      return (name + ",  " + address + ",  " + phone);
   }
   
   /*
      method equals checks to see if 2 person ojbects are equal by 
      comparing their instance variables
      @param none
      @return boolean
   */ 
   @Override
   public boolean equals(Object other)
   {
      Person otherPerson = (Person) other;
      if (otherPerson == null)
         return false;
      else
      {
         return (name.equals(otherPerson.name) &&
         address.equals(otherPerson.address) &&
         phone.equals(otherPerson.phone));
         
      }
   }
}
