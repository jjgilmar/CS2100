
public class ListTester
{

	public static void main(String [] args)
	{
      final int N = 10000;
	   long time1,time2, diff;
      ListInterface<Integer> list1 = new ListArrayBased<>();
      ListInterface<Integer> list2 = new ListReferenceBased<>();
      
      // testing add to beginning 
      time1 = System.currentTimeMillis();
      // ** TO DO **
      for (int i = 1; i < N; i++)
      {
         list1.add(1, 10);
      }
      
      //add to the beginning of an array based list N times
      time2 = System.currentTimeMillis();
      diff = time2-time1;
      System.out.println("array, add beginning: "+diff);
      
      time1 = System.currentTimeMillis();
      for (int i = 1; i < N; i++)
      {
         list2.add(1, 10);
      }
      
      //add to the beginning of a ref based list N times
      time2 = System.currentTimeMillis();
      diff = time2-time1;
      System.out.println("ref based, add beginning: "+diff);
      
      
      System.out.println("*************************");
      
      
      // testing add to end
      time1 = System.currentTimeMillis();
      for (int i = 1; i < N; i++)
      {
         list1.add(list1.size(), 10);
      }
      
      //add to the end of an array based list N times
      time2 = System.currentTimeMillis();
      diff = time2-time1;
      System.out.println("array, add end: "+diff);
      
      
      time1 = System.currentTimeMillis();
      for (int i = 1; i < N; i++)
      {
         list2.add(list2.size(), 10);
      }
      
      //add to the end of a ref based list N times
      time2 = System.currentTimeMillis();
      diff = time2-time1;
      System.out.println("ref based, add end: "+diff);
      
      
      System.out.println("*************************");
      
      
      //Remove from beginning of list
      time1 = System.currentTimeMillis();
      for (int i = 1; i < N; i++)
      {
         list1.remove(1);
      }
      
      //remove from the beginning of an array based list N times
      time2 = System.currentTimeMillis();
      diff = time2-time1;
      System.out.println("array, remove beginning: "+diff);
      
      time1 = System.currentTimeMillis();
      for (int i = 1; i < N; i++)
      {
         list2.remove(1);
      }
      
      //remove from the beginning of a ref based list N times
      time2 = System.currentTimeMillis();
      diff = time2-time1;
      System.out.println("ref based, remove beginning: "+diff);
      
      
      System.out.println("*************************");
      
      
      // •	Remove from end of list
      time1 = System.currentTimeMillis();
      for (int i = 1; i < N; i++)
      {
         list1.remove(list1.size());
      }
      
      //remove from the end of an array based list N times
      time2 = System.currentTimeMillis();
      diff = time2-time1;
      System.out.println("array, remove end: "+diff);
      
      time1 = System.currentTimeMillis();
      for (int i = 1; i < N; i++)
      {
         list2.remove(list2.size());
      }
      
      //remove from the end of a ref based list N times
      time2 = System.currentTimeMillis();
      diff = time2-time1;
      System.out.println("ref based, remove end: "+diff);
      
      
      System.out.println("*************************");
      
      //List traversal (use provided method)
      time1 = System.currentTimeMillis();
      displayList(list1);
      time2 = System.currentTimeMillis();
      diff = time2-time1;
      System.out.println("array based, traverse: "+ diff);
      
      time1 = System.currentTimeMillis();
      displayList(list2);
      time2 = System.currentTimeMillis();
      diff = time2-time1;
      System.out.println("ref based, traverse: "+ diff);
	}
   // Traverse list displaying data in teach item
	public static void displayList(ListInterface list)
	{
		for (int i = 1; i<=list.size();i++)
			//System.out.println(list.get(i));
         list.get(i); 
	}
}