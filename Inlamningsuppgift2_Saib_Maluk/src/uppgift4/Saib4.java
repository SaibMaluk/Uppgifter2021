package uppgift4;

import java.util.Scanner; 


public class Saib4 {






	  

	public static void main(String[] args) { 

	  

	int secretDigit1; 

	int secretDigit2; 

	  

	  

	secretDigit1 = (int) (Math.random() * 9 + 1); 

	secretDigit2 = (int) (Math.random() * 9 + 1); 

	       

	Scanner keyboard = new Scanner(System.in);  

	{ 

	        int guess1; 

	        int guess2; 

	  

	        System.out.print("Enter your guess in two digits. First digit: "); 

	  

	        guess1 = keyboard.nextInt(); 

	         

	        System.out.print("Second digit: "); 

	  

	        guess2 = keyboard.nextInt(); 

	  

	        System.out.printf ("Your guess is " + guess1 + guess2 + ". "); 

	        { 

	 if (guess1 != guess2)

	        if (guess1 == secretDigit1 && guess2 == secretDigit2) 

	  

	            System.out.println("Congratulations! You win 10000 SEK"); 

	  

	      else if (guess1 == secretDigit2 && guess2 == secretDigit1) 

	  

	  

	            System.out.println("Congratulations! You win 5000 SEK"); 

	  

	      else if (guess1 == secretDigit2 || guess2 == secretDigit1) 

	  

	          System.out.println("Congratulations! You win 1000 SEK"); 

	  

	}   

	 { System.out.println("Your guess is incorrect"); 

	  
	  		 System.out.println("ERROR as both digits are the same!"); 

	  

	} 

	       

	  

	         

	} 

	 

	 

	 

	} 

	} 


