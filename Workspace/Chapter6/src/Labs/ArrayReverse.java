import java.util.Scanner;
import java.util.Arrays;

public class ArrayReverse
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please enter an integer: ");
        int num = scan.nextInt();

        System.out.println();
        scan.nextLine();

        System.out.print("Please enter " + num + " numbers: ");
        String a = scan.nextLine();

        int[] array = new int[num];
        int length = array.length;
        int startSpot = 0;
        String b;

        for (int i = 0; i < (length - 1); i++)
        {
            int spot = a.indexOf(' ', startSpot);
            b = a.substring(startSpot, spot);
            array[i] = Integer.parseInt(b);
            startSpot = spot + 1;
        }

        b = a.substring(startSpot);
        array[length - 1] = Integer.parseInt(b);

        System.out.println();

        System.out.println(Arrays.toString(array));

        System.out.println();

        //System.out.println(Arrays.toString(reverse(array)));

        reverse(array);
        System.out.print(Arrays.toString(array));
    }

    public static int[] reverse(int[] a)
    {
        int s;
        int l = a.length;
        int y = l - 1;

        for (int x = 0; x < (l / 2); x++)
        {
            s = a[y];
            a[y] = a[x];
            a[x] = s;
            y--;
        }

        return a;
    }
}