package Labs1;
// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades, 
//   compute the average, and return a string containing student’s info. 
// ****************************************************************
import java.util.Scanner;

public class Lab2Class
{
    String name;
    double test1, test2, average;

    Scanner scan = new Scanner (System.in);
    
    public Lab2Class(String studentName)
    {
	name = studentName;
    }
    
    public String toString()
    {
    	return "Name: " + name + "\tScore 1: " + test1 + "\tScore 2: " + test2;
    }

    public void inputGrades()
    {
		System.out.println("Enter the first test score: ");
		test1 = scan.nextDouble();
		System.out.println("Enter the second test score: ");
		test2 = scan.nextDouble();
    }

    public double getAverage() 
    {
    	average = (test1 + test2) / 2;
    	return average;
    }

    public String getName()
    {
    	return name;
    }

}