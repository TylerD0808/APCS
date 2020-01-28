import java.util.Scanner;

public class Calculator
{
   public static void main (String[] args)
   {
    double firstNum, secondNum, result = 0;
    int operand;
    
    Scanner x = new Scanner(System.in);
    System.out.println("Please enter a double: ");
    firstNum = x.nextDouble();
    System.out.println("Please enter another double: ");
    secondNum = x.nextDouble();
    System.out.println("Please enter an number for an operand (1 = +, 2 = -, 3 = *, 4 = /): ");
    operand = x.nextInt();
    
    if (operand == 1)
    {
    	result = firstNum + secondNum;
    }
    else if (operand == 2)
    {
    	result = firstNum - secondNum;
    }
    else if (operand == 3)
    {
    	result = firstNum * secondNum;
    }
    else
    {
    	result = firstNum / secondNum;
    }

    System.out.println(result);
  }
}