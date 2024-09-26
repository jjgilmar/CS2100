/*
Joey Gilmartin
CS2100
Truck
The truck class extends the vehicle class. It 2 constructors (one takes a person
and one takes the instance variables that make up a person and creates the person).
It has getters and setters for all of its instance variables and inherits all methods
in vehicle. It also has toString and equals methods.
*/
public class Truck extends Vehicle
{
   private int capacity, numAxles;
   private final static int DEF_CAPACITY = 1;
   private final static int DEF_AXLES = 2;
   
   /*
      Constructor Truck creates an Truck object
      @param Person p 
      @param String make, model
      @param int year, mileage, capacity, numAxles
   */
   public Truck (Person p, String make, String model, int year, int mileage, int capacity, int numAxles)
   {
      super(p, make, model, year, mileage);
      this.capacity = capacity;
      this.numAxles = numAxles;
   }
   
   /*
      Constructor Truck creates an Truck object 
      @param String name, address, phone, 1make, model
      @param int year, mileage, capacity, numAxles
   */
   public Truck (String name, String address, String phone, String make, String model, int year, int mileage)
   {
      super(new Person(name, address, phone), make, model, year, mileage);
      capacity = DEF_CAPACITY;
      numAxles = DEF_AXLES;
   }
   
   /*
      method getCapacity gets the capacity
      @param none
      @return int capacity
   */
   public int getCapacity()
   {
      return capacity;
   }
   /*
      method getNumAxles gets the numAxles
      @param none
      @return int numAxles
   */
   public int getNumAxles()
   {
      return numAxles;
   }
   /*
      method setCapacity sets the capacity
      @param int capacity
      @return void
   */
   public void setCapacity(int capacity)
   {
      this.capacity = capacity;
   }
   /*
      method setNumAxles sets the numAxles
      @param int numAxles
      @return void
   */
   public void setNumAxles(int axles)
   {
      numAxles = axles;
   }
   /*
      method toString converts the truck object to a string
      @param none
      @return String
   */ 
   @Override
   public String toString()
   {
      return String.format("%s %d ton %d axles", super.toString(), capacity, numAxles);
   }
   /*
      method equals checks to see if 2 truck ojbects are equal by 
      comparing their instance variables and using its super class's
      equals constructor
      @param none
      @return boolean
   */ 
   @Override
   public boolean equals(Object other)
   {
      Truck tOther = (Truck) other;
      
      if (other == null)
         return false;
    
      return super.equals(other) && 
            this.capacity == tOther.capacity &&
            this.numAxles == tOther.numAxles;
   }
}
