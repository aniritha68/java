import java.util.*;
public class Calculator
{

  public static void main (String[]args)
  {
    int c = 0, b = 0,d=0;
      System.out.print ("1. addition \n");
      System.out.print ("2. subtraction \n");
      System.out.print ("3. div \n");
      System.out.print ("4. multiplication \n");
      System.out.println ("chose any operation name:");
    Scanner scan = new Scanner (System.in);
    String namevalue = scan.next();
   int val1 = namevalue.compareTo("addition");
     
         if(val1 == 0){
	System.out.println (" how many numbers u want to add ? :");
	int addnumber = scan.nextInt ();
	for (int i = 0;i <= addnumber;i++)
	  {
	    int add = scan.nextInt ();
         b+=add; 
	     System.out.println(b);
	  }
         }
    
            int val2 = namevalue.compareTo("subtraction");  
             if(val2==0)
         {
             System.out.println (" how many numbers u want to sub ? :");
	int subnumber = scan.nextInt ();
	for (int i = 0;i <= subnumber;i++)
	  {
	    int sub = scan.nextInt ();
         d-=sub; 
	     System.out.println(d);
         }   
         }
         
         int val3 = namevalue.compareTo("divition");  
             if(val3==0)
         {
             System.out.println (" enter only 2 numbers ? :");
	int divnumber = scan.nextInt ();
	for (int i = 0;i <= divnumber;i++)
	  {
	    int sub = scan.nextInt ();
         d-=sub; 
	     System.out.println(d);
         }   
         }
         
      
// else if (namevalue==subtraction)
// {
//   int subnumber =scan.nextint();
//     for(int i=0;i<=subnumber;i++)
//     {
//         addnumber[i]=input.nextInt();
//     }  
// }
}
}
  

