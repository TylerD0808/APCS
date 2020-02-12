import java.util.Arrays;

public class ArrayFun
{
    public static void main(String[]args)
    {
        int array1[] = {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};
        int array2[] = {7, 4, 2, 7, 3, 4, 6, 7, 8, 9, 7, 0, 10, 7, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8, 7};

        System.out.println(Arrays.toString(array1));
        System.out.println("Sum of spots 3-6: " + sumOfSpots(array1, 3, 6));
        System.out.println("Sum of spots 2-9: " + sumOfSpots(array1, 2, 9));

        System.out.println("\n# of 4s: " + numCounter(array1, 4));
        System.out.println("# of 9s: " + numCounter(array1, 9));
        System.out.println("# of 7s: " + numCounter(array1, 7));

        System.out.println("\nNew array with all 7s removed: " + Arrays.toString(numRemove(array1, 7)));
        array1 = numRemove(array1, 7);
        System.out.println("# of 7s: " + numCounter(array1, 7));



        System.out.println(Arrays.toString(array2));
        System.out.println("Sum of spots 3-16: " + sumOfSpots(array2, 3, 16));
        System.out.println("Sum of spots 2-9: " + sumOfSpots(array2, 2, 9));

        System.out.println("\n# of 0s: " + numCounter(array2, 0));
        System.out.println("# of 3s: " + numCounter(array2, 3));
        System.out.println("# of 7s: " + numCounter(array2, 7));

        System.out.println("\nNew array with all 7s removed: " + Arrays.toString(numRemove(array2, 7)));
        array2 = numRemove(array2, 7);
        System.out.println("# of 7s: " + numCounter(array2, 7));
    }

    public static int sumOfSpots(int array[], int start, int end)
    {
        int sum = 0;

        while (start <= end)
        {
            sum += array[start];
            start++;
        }

        return sum;
    }

    public static int numCounter(int array[], int num)
    {
        int count = 0;

        for (int a = 0; a < array.length; a++)
        {
            if (array[a] == num)
            {
                count++;
            }
        }

        return count;
    }

    public static int[] numRemove(int array[], int num)
    {
        int[] newArray = new int [array.length - numCounter(array, num)];
        int b = 0;

        for (int a = 0; a < array.length; a++)
        {
            if (array[a] != num)
            {
                newArray[b] = array[a];
                b++;
            }
        }

        return newArray;
    }
}
