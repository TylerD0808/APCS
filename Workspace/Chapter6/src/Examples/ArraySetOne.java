import static java.lang.System.*;
import java.util.*;

public class ArraySetOne
{
  public static void main(String[] args)
  {
		int[][] nums = new int[10][8];  //all spots set to zero to start

		System.out.println(nums.length);
		System.out.println(nums[2].length);

		nums[0][1] = 231;
		nums[4][1] = 756;
		nums[2][1] = 123;
		
		for (int i = 0; i < nums.length; i++)
		{
			System.out.println(Arrays.toString(nums[i]));
		}
		

		//out.println(Arrays.toString(nums[0]));
		//out.println(nums[1]);
		//out.println(nums[4]);
		//out.println(nums[4/2]);
  }
}