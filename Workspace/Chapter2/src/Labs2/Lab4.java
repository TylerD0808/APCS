import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
public class Lab4
{
    // ---------------------------------------------------
    //  main reads in the price per pound of a deli item
    //  and number of ounces of a deli item then computes
    //  the total price and prints a "label" for the item
    //  --------------------------------------------------

    public static void main (String[] args)
    {
        final double OUNCES_PER_POUND = 16.0;

        double pricePerPound;  // price per pound
        double weightOunces;   // weight in ounces
        double weight;               // weight in pounds  
        double totalPrice;       // total price for the item
      
        Scanner scan = new Scanner(System.in);
       
        DecimalFormat fmt = new DecimalFormat("0.##");
        NumberFormat money = NumberFormat.getCurrencyInstance();

        System.out.println ("Welcome to the CS Deli!!\n ");
        
        System.out.print ("Enter the price per pound of your item (dollars): ");
        pricePerPound = scan.nextDouble();
        String pricePerPound1 = money.format(pricePerPound);
        		
        System.out.print ("Enter the weight (ounces): ");
        weightOunces = scan.nextDouble();
        
        System.out.println();
        System.out.println();

        weight = weightOunces / OUNCES_PER_POUND;
        weight = new Double(fmt.format(weight)).doubleValue();
        
        totalPrice = pricePerPound * weight;
        String totalPrice1 = money.format(totalPrice);

        System.out.println("***** CS Deli *****");
        System.out.println();
        System.out.println("Unit Price: " + pricePerPound1 + " per pound");
        System.out.println("Weight: " + weight + " pounds");
        
        System.out.println();
        System.out.println("TOTAL: " + totalPrice1);
        // Print the label using the formatting objects 
        // fmt for the weight in pounds and money for the prices
    }
}