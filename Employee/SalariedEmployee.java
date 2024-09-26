import java.util.Date;

public class SalariedEmployee extends Employee
{
   private double salary;
   
   public SalariedEmployee (String f, String l, Date d, double s)
   {
      super(f, l, d);
      salary = s;
   
   }
   
   public double getSalary()
   {
      return salary;
   }
   
   public void setSalary(double s)
   {
      salary = s;
      
   }
   
   @Override
   public String toString()
   {
      return String.format("%s\nSalary = $%.2f", super.toString(), salary);
   }
   
   @Override
   public boolean equals(Object other)
   {
      SalariedEmployee sOther = (SalariedEmployee) other;
      if (other == null)
         return false;
    
      return super.equals(other) && this.salary == sOther.salary;
   }
}

