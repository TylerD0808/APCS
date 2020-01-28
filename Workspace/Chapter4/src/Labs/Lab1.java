import java.text.NumberFormat;

public class Lab1
{
    public static void main(String[] args)
    {
    NumberFormat nf = NumberFormat.getCurrencyInstance();
    Lab1Class acct1, acct2;

	acct1 = new Lab1Class(1000, "Sally", 1111);
	acct2 = new Lab1Class(500, "Joe", 1112);

	acct2.deposit(100);
	acct1.withdraw(50);

	System.out.println(nf.format(acct1.chargeFee()));
	System.out.println(nf.format(acct2.chargeFee()));


	

	acct2.changeName("Joseph");

	System.out.println();
	System.out.println("-------------------------------");
	System.out.println("\tAccount Summary");
	System.out.println("-------------------------------");
	System.out.println(acct1.toString());
	System.out.println(acct2.toString());
    }
}