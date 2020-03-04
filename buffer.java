import java.util.*;
import java.lang.*;


public class buffer
{
  public static void main (String[]args)
  {
    StringBuffer buffer = new StringBuffer ("ani");
    StringBuffer buffernew = new StringBuffer ("_n_");


    String str1;
    
    for (int i = 1; i <= buffer.length (); i++)
      {
	System.out.println ("guess the " + i + " character? \n" + "CHANCE " +i);
	Scanner scan = new Scanner (System.in);
	String str = scan.next ();
	if (str.equals (str.toUpperCase ()))
	    str1 = str.toLowerCase ();
	else
	    str1 = str;
	   
int val=buffer.indexOf(str1);
if(val == -1 )
{
System.out.println("your guess is Wrong");
}
else{
    System.out.println("your guess is correct");
}
 
      }
  }
}
