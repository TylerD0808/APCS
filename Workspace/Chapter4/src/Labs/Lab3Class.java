public class Lab3Class
{
	int boxesSold;
	String name;
	
	public Lab3Class(String name1)
	{
		name = name1;
		boxesSold = 0;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void updateSales(int boxes)
	{
		boxesSold += boxes;
	}
	
	public String toString()
	{
		return name + ": " + boxesSold + " boxes";
	}
}
