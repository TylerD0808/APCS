package Labs1;

public class Lab5Class1
{
	private Lab5Class2 die1;
	private Lab5Class2 die2;
	
	public Lab5Class1()
	{
		die1 = new Lab5Class2();
		die2 = new Lab5Class2();
		roll();
	}
	
	public Lab5Class1 (int facesDie1, int facesDie2)
	{
		die1 = new Lab5Class2(facesDie1);
		die2 = new Lab5Class2(facesDie2);
		roll();
	}
	
	public void roll()
	{
		die1.roll();
		die2.roll();
	}
	
	public int getDie1FaceValue()
	{
		return die1.getFaceValue();
	}
	
	public int getDie2FaceValue()
	{
		return die2.getFaceValue();
	}
	
	public boolean equals (Lab5Class1 other)
	{
		boolean result = die1.getFaceValue() == other.getDie1FaceValue() 
				&& die2.getFaceValue() == other.getDie2FaceValue();
		return result;
	}
	
	public String toString()
	{
		return "Die1: " + die1.getFaceValue() + "Die2: " + die2.getFaceValue();
	}
}
