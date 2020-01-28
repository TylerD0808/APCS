package Labs1;
// **********************************************************
//   Count.java
//
//   This program reads in strings (phrases) and counts the 
//   number of blank characters and certain other letters
//   in the phrase.
// **********************************************************

import java.util.Scanner;

public class Lab13
{
  public static void main (String[] args)
  {
      String phrase;    // a string of characters
         

	Scanner scan = new Scanner(System.in);

      System.out.println ();
      System.out.println ("Character Counter");
      System.out.println ();
     
      System.out.print ("Enter a sentence or phrase: ");
      phrase = scan.nextLine();
      
      while (!phrase.equalsIgnoreCase("quit"))
      {
    	  int countBlank = 0, countA = 0, countE = 0, countS = 0, countT = 0;  
          int length = phrase.length();    
          char ch;
          
    	  for (int i = 0; i < length; i++)
          {
    		  ch = phrase.charAt(i);
        	  
    		  switch(ch)
    		  {
    		  case ' ':
    			  countBlank++;
    			  break;
    		  case 'a':
    			  countA++;
    			  break;
    		  case 'A':
    			  countA++;
    			  break;
    		  case 'e':
    			  countE++;
    			  break;
    		  case 'E':
    			  countE++;
    			  break;
    		  case 's':
    			  countS++;
    			  break;
    		  case 'S':
    			  countS++;
    			  break;
    		  case 't':
    			  countT++;
    			  break;
    		  case 'T':
    			  countT++;
    			  break;
    		  }
          }

          System.out.println();
          System.out.println("Number of blank spaces: " + countBlank);
          System.out.println("Number of A's: " + countA);
          System.out.println("Number of E's: " + countE);
          System.out.println("Number of S's: " + countS);
          System.out.println("Number of T's: " + countT);
          System.out.println();
          
          System.out.println("Please enter another phrase. Type \"quit\" to quit ");
          phrase = scan.nextLine();
     }
     }
}