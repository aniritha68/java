import java.util.*;
import java.lang.*;


public class Game
{
	public static void main(String[] args) {
		StringBuffer buffer =new StringBuffer("ani");
		String strconvert = sb.toString();
		 StringBuffer buffernew =new StringBuffer("*n*");
	
		
		int store;
		for(int i=1;i<=buffer.length();i++){
		        System.out.println("guess the " + i + " character? \n" + "CHANCE " + i);
		       Scanner scan=new Scanner(System.in);
		          char charval=scan.next().charAt(0);
		        if(charval >= 97 && charval <= 123){
		              store=charval;}
		              else{
		                  store = Character.toLowerCase(charval);
		              }
		  //for(int j=0;j<=buffernew.length();j++)
		  //  {
		  //    int va=buffernew.indexOf("ani");
		  //    System.out.println(va);
		  // }
		    
		}
	}
}
