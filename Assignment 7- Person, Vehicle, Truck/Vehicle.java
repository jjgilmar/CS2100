/*
Joey Gilmartin
CS2100
Vehicle
The vehicle class has constructors that can create vehicle objects. It has
getters and setters for all instance variables and has a toString and equals method. 
*/
public class Vehicle
{
   private Person owner;
   private String make, model;
   private int year, mileage;
   
   /*
      Constructor Vehicle creates an vehicle object
      @param Person p 
      @param String make, model
      @param int year, mileage
   */
   public Vehicle (Person p, String make, String model, int year, int mileage)
   {
      owner = p;
      this.make = make;
      this.model = model;
      this.year = year;
      this.mileage = mileage;
   }
   
   /*
      Constructor Vehicle creates an vehicle object
      @param Person p 
      @param String make, model
      @param int year
   */
   public Vehicle (Person p, String make, String model, int year)
   {
      owner = p;
      this.make = make;
      this.model = model;
      this.year = year;
      mileage = 0;
   }
   
   /*
      method getOwner gets the owner
      @param none
      @return Person owner
   */
   public Person getOwner()
   {
      return owner;
   }
   /*
      method getMake gets the make
      @param none
      @return String make
   */
   public String getMake()
   {
      return make;
   }
   /*
      method getModel gets the model
      @param none
      @return String model
   */
   public String getModel()
   {
      return model;
   }
   /*
      method getYear gets the year
      @param none
      @return int year
   */
   public int getYear()
   {
      return year;
   }
   /*
      method getMileage gets the Mileage
      @param none
      @return int mileage
   */
   public int getMileage()
   {
      return mileage;
   }
   /*
      method setOwner sets the owner
      @param Person p
      @return void
   */
   public void setOwner(Person p)
   {
      owner = p;
   }
   /*
      method setMake sets the make
      @param String make
      @return void
   */
   public void setMake(String make)
   {
      this.make = make;
   }
   /*
      method setModel sets the model
      @param String model
      @return void
   */
   public void setModel(String model)
   {
      this.model = model;
   }
   /*
      method setYear sets the year
      @param int year
      @return void
   */
   public void setYear(int year)
   {
      this.year = year;
   }
   /*
      method setMileage sets the mileage
      @param int mileage
      @return void
   */
   public void setMileage(int mileage)
   {
      this.mileage = mileage;
   }
   /*
      method toString converts the vehicle object to a string
      @param none
      @return String
   */ 
   @Override
   public String toString()
   {
      return String.format("%s \n%s %s %d %d miles", owner.toString(), make, model, year, mileage);
   }
   /*
      method equals checks to see if 2 vehicle ojbects are equal by 
      comparing their instance variables
      @param none
      @return boolean
   */ 
   @Override 
   public boolean equals(Object other)
   {
      Vehicle vOther = (Vehicle) other;
      if (other == null)
         return false;
         
      return this.owner.equals(vOther.owner)
               && this.make.equals(vOther.make)
               && this.model.equals(vOther.model)
               && this.year == vOther.year
               && this.mileage == vOther.mileage;
   }
}
