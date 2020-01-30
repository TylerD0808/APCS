// ***************************************************************
//   Shop.java
//
//   Uses the Item class to create items and add them to a shopping
//   cart stored in an ArrayList.
// ***************************************************************

import java.util.ArrayList;
import java.util.Scanner;
import java.text.NumberFormat;

public class Shop
{
    public static void main (String[] args)
    {

	NumberFormat n = NumberFormat.getCurrencyInstance();
	Item item;
	String itemName;
	double itemPrice;
	int quantity;
	int totalPrice = 0;

	ArrayList<Item> cart = new ArrayList<Item>();
 	Scanner scan = new Scanner(System.in);

	String keepShopping = "y";

	do {
		System.out.print ("Enter the name of the item: "); 
		itemName = scan.nextLine();

		System.out.print ("Enter the unit price: ");
		itemPrice = scan.nextDouble();

		System.out.print ("Enter the quantity: ");
		quantity = scan.nextInt();

		item = new Item(itemName, itemPrice, quantity);
		cart.add(item);
		totalPrice += (item.getPrice() * item.getQuantity());
		
		System.out.println("************\tCart\t************");

		System.out.println("Item\tPrice\tAmount\tTotal Price");
		for (int h = 0; h < cart.size(); h++) {
			System.out.println(cart.get(h));
		}

		System.out.println();

		System.out.print("Continue shopping (y/n)? ");
		scan.nextLine();
		keepShopping = scan.nextLine();

		System.out.println();
	    }
	while (keepShopping.equals("y"));

	System.out.println("Total Price: " + n.format(totalPrice));
    }
}