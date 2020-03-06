import java.util.*;
public class Game1{
  public static void main (String[]args) {
     char[] chararray = {'a','b','c','d','e'};
     char[] chararray1 ={ '&','&','&','&','&'};
int c=0,k=0;
	System.out.println(	" clue: building block of English");
    for (int i =0; i <chararray.length; i++) {
        
          	System.out.println ("guess the " + i + " character? \n" + "CHANCE" + i );
	Scanner scan = new Scanner (System.in);
	char str = scan.next().charAt(0);
          for(int j=0; j <chararray.length; j++){
		  if(chararray[j]==str){
	 System.out.println("your guess is right");
	 c++;
	         chararray1[j]=chararray[j];
	          k++;
	        chararray[j]=0;
            System.out.println(chararray1);} }
      if(c==0)
		    System.out.println("your guess is wrong");
		    c=0;}
      if(k==5)
		    System.out.println("you win!/n" + "GAME OVER");
		    else{
		        System.out.println("you loose!"+ "GAME OVER");}}}
