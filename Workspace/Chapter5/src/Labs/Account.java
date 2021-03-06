public class Account
{
  private double balance;
  private String name;
  private long acctNum;
  static int numAccts = 0;

  //----------------------------------------------
  //Constructor -- initializes balance, owner, and account number
  //----------------------------------------------
  public Account(double initBal, String owner, long number)
  {
    balance = initBal;
    name = owner;
    acctNum = number;
  }

  public static int numAccounts()
  {
    return numAccts;
  }

  public Account(double initBal, String owner)
  {
      balance = initBal;
      name = owner;
      acctNum = (int)((Math.random() * 9999) + 1);
  }

  public Account(String owner)
  {
    name = owner;
    balance = 0.0;
    acctNum = (int)((Math.random() * 9999) + 1);
  }
  //----------------------------------------------
  // Checks to see if balance is sufficient for withdrawal.
  // If so, decrements balance by amount; if not, prints message.
  //----------------------------------------------
  public void withdraw(double amount)
  {
    if (balance >= amount)
       balance -= amount;
    else
       System.out.println("Insufficient funds");
  }

  public void withdraw(double amount, double fee)
  {
    if (balance >= (amount + fee))
    {
      balance -= (amount + fee);
    }
    else
    {
      System.out.println("Insufficient funds");
    }
  }

  //----------------------------------------------
  // Adds deposit amount to balance.
  //----------------------------------------------
  public void deposit(double amount)
  {
    balance += amount;
  }

  //----------------------------------------------
  // Returns balance.
  //----------------------------------------------
  public double getBalance()
  {
    return balance;
  }

  public long getAcctNumber()
  {
    return acctNum;
  }
  //----------------------------------------------
  // Returns a string containing the name, account number, and balance.
  //----------------------------------------------

  public String printSummary()
  {
    return "Name: " + name + "\nBalance: " + balance + "\nAccount Number: " + acctNum;
  }
}