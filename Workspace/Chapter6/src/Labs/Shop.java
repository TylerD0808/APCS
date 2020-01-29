import java.time.Year;
import java.util.ArrayList;
import java.util.Scanner;

public class Shop
{
    public static void main (String[] args)
    {

	Item item;
	String itemName;
	double itemPrice;
	int quantity;
	ShoppingCart cart;

 	Scanner scan = new Scanner(System.in);

	String keepShopping = "y";

	cart = new ShoppingCart();

	do
	    {
		System.out.print ("Enter the name of the item: "); 
		itemName = scan.nextLine();

		System.out.print ("Enter the unit price: ");
		itemPrice = scan.nextDouble();

		System.out.print ("Enter the quantity: ");
		quantity = scan.nextInt();
		scan.nextLine();

		item = new Item(itemName, itemPrice, quantity);

		cart.addToCart(item);

		System.out.println(cart.toString());
		System.out.println();
		System.out.println();
		System.out.print ("Continue shopping (y/n)? ");
		keepShopping = scan.nextLine();
		System.out.println();
	    }
	while (keepShopping.equals("y"));

	System.out.println();
	System.out.println("Please pay " + cart.end());
	System.out.println("\nThank you for shopping with us today!!!");
    }
}