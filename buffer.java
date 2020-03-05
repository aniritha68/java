/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;



public class Main
{
  public static void main (String[]args)
  {
     char[] chararray = {'a','b','c','d','e'};
     char[] chararray1 ={ '&','&','&','&','&'};

int c=0;
    for (int i =0; i <chararray.length; i++)
      {
          	System.out.println ("guess the " + i + " character? \n" + "CHANCE " + i);
	Scanner scan = new Scanner (System.in);
	char str = scan.next().charAt(0);
          for(int j=0; j <chararray.length; j++){
		  if(chararray[j]==str){
		   c++;   
	 System.out.println("your guess is right");
	         chararray1[j]=chararray[j];
	        chararray[j]=0;
            System.out.println(chararray1);}
          	
      }
      if(c==0)
          {
		    System.out.println("your guess is wrong");}
			c=0;

  	
}		

}

	
}

  

