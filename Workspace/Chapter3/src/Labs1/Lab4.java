package Labs1;
// ****************************************************************
// Dates.java
//
// Determine whether a 2nd-millenium date entered by the user
// is valid          
// ****************************************************************
import java.util.Scanner;

public class Lab4
{
    public static void main(String[] args)
    {
	int month, day, year;   //date read in from user
	int daysInMonth;        //number of days in month read in 
	boolean monthValid, yearValid, dayValid;  //true if input from user is valid
	boolean leapYear;       //true if user's year is a leap year

      Scanner scan = new Scanner(System.in);
      System.out.print("Please enter a month by it's number (i.e. January = 1, February = 2, etc.): ");
      month = scan.nextInt();
      
      System.out.print("Please enter the day: ");
      day = scan.nextInt();
      
      System.out.print("Please enter a year from 1000 to 1999: ");
      year = scan.nextInt();
      
      if ((month >= 1) && (month <= 12))
      {
    	  monthValid = true;
      }
      else
      {
    	  monthValid = false;
      }
      
      if ((year >= 1000) && (year <= 1999))
      {
    	  yearValid = true;
      }
      else
      {
    	  yearValid = false;
      }
      
      if ((year % 4) == 0)
      {
    	  if ((year % 100) == 0)
    	  {
    		  if ((year % 400) == 0)
    		  {
    			  leapYear = true;
    		  }
    		  else
    		  {
    			  leapYear = false;
    		  }
    	  }
    	  else
    	  {
    		  leapYear = true;
    	  }
      }
      else
      {
    	  leapYear = false;
      }

      if (monthValid == true)
      {
    	  if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
    	  {
    		  daysInMonth = 31;
    	  }
    	  else if (month == 4 || month == 6 || month == 9 || month == 11)
    	  {
    		  daysInMonth = 30;
    	  }
    	  else 
    	  {
    		  if (leapYear == true) 
    		  {
    			  daysInMonth = 29;
    		  }
    		  else
    		  {
    			  daysInMonth = 28;
    		  }
    	  }
      }
      else
      {
    	  daysInMonth = 0;
      }
      
      if (day <= daysInMonth)
      {
    	  dayValid = true;
      }
      else
      {
    	  dayValid = false;
      }
      
      System.out.println();
      
      if (monthValid == true && dayValid == true && yearValid == true)
      {
    	  System.out.println("Date is valid");
    	  if (leapYear == true)
    	  {
    		  System.out.print("It is a leap year");
    	  }
    	  else
    	  {
    		  System.out.print("It is NOT a leap year");
    	  }
      }
      else
      {
    	  System.out.print("Date is NOT valid");
      }
    }
}