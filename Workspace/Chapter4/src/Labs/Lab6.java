public class Lab6
{
	public static void main(String[] args)
	{
		for (int i = 0; i < 20; i++)
		{
			int cardChoice = (int)(Math.random()*52);
			Lab6Class myCard = new Lab6Class(cardChoice % 13, cardChoice / 13);
			System.out.println(myCard.getCard());
		}
	}
}