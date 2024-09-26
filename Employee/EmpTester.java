import java.util.Date;

public class EmpTester
{
   public static void main(String [] args)
   {
      Date d = new Date();
      Employee e1 = new Employee("Bob","Jones",d);
      
      HourlyEmployee he = new HourlyEmployee ("Jo", "Jones", d, 32.50, 41.25);
      SalariedEmployee se = new SalariedEmployee("Sue", "Smith", d, 72000);
      
      System.out.println(  );
      
   }

}