import java.text.NumberFormat;

public class ShoppingCart {
    private int itemCount; // total number of items in the cart
    private double totalPrice; // total price of items in the cart
    private int capacity; // current cart capacity
    private Item[] cart;
    String contents = "\nShopping Cart\n" + "\nItem\t\tUnit Price\tQuantity\tTotal\n";
    NumberFormat fmt = NumberFormat.getCurrencyInstance();

    // -----------------------------------------------------------
    // Creates an empty shopping cart with a capacity of 5 items.
    // -----------------------------------------------------------
    public ShoppingCart() {
        capacity = 5;
        itemCount = 0;
        totalPrice = 0.0;
        cart = new Item[capacity];
    }

    // -------------------------------------------------------
    // Adds an item to the shopping cart.
    // -------------------------------------------------------
    public void addToCart(Item item) {
        
        if (itemCount == capacity) {
            increaseSize();
        }

        cart[itemCount] = item;
        totalPrice += (item.getPrice() * item.getQuantity());
        itemCount += 1;
    }

    // -------------------------------------------------------
    // Returns the contents of the cart together with
    // summary information.
    // -------------------------------------------------------
    public String toString() {
        
        int i = 0;
        System.out.print(contents);

        while (i < itemCount)
        {
            System.out.print("\n" + cart[i].getName() + "\t\t" + fmt.format(cart[i].getPrice()) + "\t\t" + cart[i].getQuantity()
                + "\t\t" + fmt.format(cart[i].getPrice() * cart[i].getQuantity()));
            i++;
        }
        /*
         * for (int i = 0; i < itemCount; i++) { System.out.print("\n" +
         * cart[i].getName() + "\t\t" + fmt.format(cart[i].getPrice()) + "\t\t" +
         * cart[i].getQuantity() + "\t\t" + fmt.format(cart[i].getPrice() *
         * cart[i].getQuantity())); }
         */

        return "";
    }

    // ---------------------------------------------------------
    // Increases the capacity of the shopping cart by 3
    // ---------------------------------------------------------
    private void increaseSize() {
        Item[] temp = new Item[cart.length];
        for (int k = 0; k < cart.length; k++) {
            temp[k] = cart[k];
        }

        cart = new Item[cart.length + 3];

        for (int i = 0; i < temp.length; i++) {
            cart[i] = temp[i];
        }

        capacity = cart.length;
    }

    public String end() {
        return fmt.format(totalPrice);
    }
}