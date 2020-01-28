import java.util.Scanner;

public class Lab7{
    
	public static void main(String args[])
	{
        int num1, num2, den1 = 1, den2 = 2;
        String operation;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first fraction's numerator: ");
        num1 = scan.nextInt();
        
        System.out.println("Enter the first fraction's denominator: ");
        den1 = scan.nextInt();
        
        while (den1 == 0)
        {
        	System.out.println("Invalid input. Please try again: ");
        	den1 = scan.nextInt();
        }
   
        System.out.println("Enter the second fraction's numerator: ");
        num2 = scan.nextInt();
        
        System.out.println("Enter the second fraction's denominator: ");
        den2 = scan.nextInt();
        
        while (den2 == 0)
        {
        	System.out.println("Invalid input. Please try again: ");
        	den2 = scan.nextInt();
        }
        
        System.out.println("Enter an operation (add, subtract, multiply, divide): ");
        operation = scan.next();

        Lab7Class r1 = new Lab7Class(num1,den1);
        Lab7Class r2 = new Lab7Class(num2,den2);
        Lab7Class result;
        
        switch(operation)
        {
        case "add":
        result = Lab7Class.add(r1,r2);
        break;
        
        case "subtract":
        result = Lab7Class.subtract(r1,r2);
        break;
        
        case "multiply":
        result = Lab7Class.multiply(r1,r2);
        break;
        
        case "divide":
        result = Lab7Class.divide(r1,r2);
        break;
        
        default:
        throw new IllegalArgumentException("Error: Operation not recognized");
    }        
       
       System.out.println(result.num + " / " + result.den);
    }

}