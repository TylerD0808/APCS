public class EntryTask
{
    public static void main(String[]args)
    {
        int a[] = new int[10];
        for (int i = 0; i < a.length; i++)
        {
            a[i] = 7 * i;
        }

        String b[] = {"Hello", "world", "it", "is", "great", "to", "be", "back"};

        double c[] = new double[100];
        for (int y = 0; y < c.length; y++)
        {
            c[y] = y + 1;
            if (checkVal(3, c[y]) == true)
            {
                System.out.print(c[y] + " ");
            }
        }


        System.out.println();
    }

    public static boolean checkVal(int b, double c)
    {
        if (c % b == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}