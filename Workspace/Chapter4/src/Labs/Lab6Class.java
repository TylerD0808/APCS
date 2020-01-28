public class Lab6Class
{
	String value, suit;
	int valu, sui;
	
	public Lab6Class(int x, int y)
	{
		valu = x;
		sui = y;
		getValue();
		getSuit();
	}
	
	public void getValue()
	{
		if (valu == 1)
		{
			value = "Ace";
		}
		else if (valu == 11)
		{
			value = "Jack";
		}
		else if (valu == 12)
		{
			value = "Queen";
		}
		else if (valu == 0)
		{
			value = "King";
		}
		else
		{
			value = Integer.toString(valu);
		}
	}
	
	public void getSuit()
	{
		if (sui == 1)
		{
			suit = "Hearts";
		}
		else if (sui == 2)
		{
			suit = "Diamonds";
		}
		else if (sui == 3)
		{
			suit = "Spades";
		}
		else
		{
			suit = "Clubs";
		}
	}
	
	public String getCard()
	{
		return value + " of " + suit;
	}
}
