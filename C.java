import java.util.*;
public class C.java
{

  public static void main (String[]args)
  {
 double c = 0, b = 0,d=0;
      System.out.print ("1. addition \n");
      System.out.print ("2. subtraction \n");
      System.out.print ("3. division \n");
      System.out.print ("4. multiplication \n");
      System.out.println ("chose any operation name:");
     
    Scanner scan = new Scanner (System.in);
    String namevalue = scan.next();
   int val1 = namevalue.compareTo("addition");
     
         if(val1 == 0){
	System.out.println (" how many numbers u want to add ? :");
	int addnumber = scan.nextInt ();
	for (int i = 0;i < addnumber;i++)
	 {
	    Double add = scan.nextDouble();
	    b+=add;
	System.out.println((float)b);
      }
         }
    
            int val2 = namevalue.compareTo("subtraction");  
             if(val2==0)
         {
             System.out.println (" how many numbers u want to sub ? :");
	int subnumber = scan.nextInt ();
	for (int i = 0;i <= subnumber;i++)
	  {
	    Double sub = scan.nextDouble();
         d-=sub; 
	     System.out.println((float)d);
         }   
         }
         
         int val3 = namevalue.compareTo("division");  
             if(val3==0)
         {
             System.out.println (" enter only 2 numbers ? :");
	int divnumber = scan.nextInt ();
	Double divnum1 =scan.nextDouble();
	  Double divnum2 =scan.nextDouble();
         d=divnum1 / divnum2;
	     System.out.println((float)d);
         }   
         }
         
      

}
}
