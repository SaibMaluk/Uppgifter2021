package uppgift1;
import java.util.Scanner;


public class Saib1 {

	public static void main(String[] args) {

		      int vokCount = 0; 

		      int spaceCount = 0; 

		      int konCount = 0; 

		      System.out.println("Skriv en mening :"); 

		      Scanner scanning = new Scanner(System.in); 

		      String mening = scanning.nextLine(); 

		  

		      for (int i=0 ; i<mening.length(); i++) { 

		         char ch = mening.charAt(i); 

		         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == 'y'||ch == 'å'||ch == 'ä'||ch == 'ö'){ 

		            vokCount ++; 

		         } 

		         else if (ch ==' ') 

		        	 spaceCount ++; 

		         } 

		      konCount = mening.length()  - (vokCount + spaceCount); 

		      System.out.println("Mening innehåller "+ vokCount + " vokaler"); 

		      System.out.println("Mening innehåller "+ konCount + " konsonanter"); 
       

		   } 
	  
}


