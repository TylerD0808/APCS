package Labs1;

public class Lab5
{

	public static void main(String[] args)
	{
		Lab5Class1 dice1 = new Lab5Class1();
		Lab5Class1 dice2 = new Lab5Class1(20, 20);
		
		int boxCarCount1 = 0;
		int boxCarCount2 = 0;
		
		for (int numRolls = 0; numRolls < 1000; numRolls++)
		{
			dice1.roll();
			dice2.roll();
			
			if (dice1.getDie1FaceValue() == 6 && dice1.getDie2FaceValue() == 6)
			{
				boxCarCount1++;
			}
			
			if (dice2.getDie1FaceValue() == 6 && dice2.getDie2FaceValue() == 6)
			{
				boxCarCount2++;
			}
		}
		
		System.out.println("Dice rolled box cars " + boxCarCount1 + " times out of 1000");
		System.out.println("Dice2 rolled box cars " + boxCarCount2 + " times out of 1000");
		//System.out.println(toString);
	}
}
