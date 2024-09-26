import java.util.Date;

public class HourlyEmployee extends Employee
{
   private double wageRate;
   private double hours;
   
   public HourlyEmployee(String first, String last, Date d, double w, double h)
   {
      super(first,last,d);
      wageRate = w;
      hours = h;
   
   }

   public double getWageRate ()
   {
      return wageRate;
   }
   
   public double getHours()
   {
      return hours;
   }
   
   public void setWageRate (double wageRate)
   {
      this.wageRate = wageRate;
   }
   
   public void setHours(double hours)
   {
      this.hours = hours;
   }
   
   @Override
   public String toString()
   {
      return String.format("%s\n%.1f hours at $%.2f", super.toString(), hours, wageRate);
   }
   
   @Override
   public boolean equals(Object other)
   {
      HourlyEmployee hOther = (HourlyEmployee) other;
      if (other == null)
         return false;
    
      return super.equals(other) && this.hours == hOther.hours && this.wageRate == hOther.wageRate;
   }
}