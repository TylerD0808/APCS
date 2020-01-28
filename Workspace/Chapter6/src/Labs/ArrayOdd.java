import java.util.Arrays;

public class ArrayOdd
{
    public static void main(String[]args)
    {
        int[] array1 = {2, 4, 6, 8, 10, 12, 14};
        int[] array2 = {2, 3, 4, 5, 6, 7, 8, 9};
        int[] array3 = {2, 10, 20, 21, 23, 24, 40, 55, 60, 61};

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));

        System.out.println();

        System.out.println("Odds - " + oddArray(array1));
        System.out.println("Even - " + evenArray(array1));

        System.out.println();
        
        System.out.println("Odds - " + oddArray(array2));
        System.out.println("Even - " + evenArray(array2));
        
        System.out.println();
        
        System.out.println("Odds - " + oddArray(array3));
        System.out.println("Even - " + evenArray(array3));
    }

    public static boolean evenCheck(int[] a, int b)
    {
            if (a[b] % 2 == 0)
            {
                return true;
            }
            else
            {
                return false;
            }
    }

    public static int evenNum(int[] a)
    {
        int even = 0;

        for (int i = 0; i < a.length; i++)
        {
            if (a[i] % 2 == 0)
            {
                even++;
            }
        }

        return even;
    }

    public static int oddNum(int[] a)
    {
        int odd = 0;

        for (int i = 0; i < a.length; i++)
        {
            if (a[i] % 2 == 1)
            {
                odd++;
            }
        }

        return odd;
    }

    public static String evenArray(int[] a)
    {
        int length1 = evenNum(a);
        int[] array1 = new int[length1];
        int num1 = 0;

        for (int i = 0; i < a.length; i++)
        {
            if (evenCheck(a, i) == true)
            {
                array1[num1] = a[i];
                num1++;
            }
        }

        return Arrays.toString(array1);
    }

    public static String oddArray(int[] a)
    {
        int length2 = oddNum(a);
        int[] array2 = new int[length2];
        int num2 = 0;

        for (int i = 0; i < a.length; i++)
        {
            if (evenCheck(a, i) == false)
            {
                array2[num2] = a[i];
                num2++;
            }
        }

        return Arrays.toString(array2);
    }
}