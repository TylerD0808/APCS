import static java.lang.System.*;

public class ArrayLoopTwo
{
	public static void main(String args[])
	{
		int[] nums = new int[6];

		for(int spot=0; spot<nums.length; spot++)
		{
		    nums[spot] = spot*4;
		}

		for (int item : nums)
		{
			out.print(item + " ");
		}//use a for each loop to print out the array		
	
	}
}