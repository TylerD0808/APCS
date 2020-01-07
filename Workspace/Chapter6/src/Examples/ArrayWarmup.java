public class ArrayWarmup
{
	public static void main(String args[])
	{
		double[] nums = new double[25];

        for(int spot = 0; spot < nums.length; spot++)
		{
		    nums[spot] = Math.pow(3, spot);
        }
        
        for (double item : nums)
		{
			System.out.print(item + "  ");
		}
	}
}