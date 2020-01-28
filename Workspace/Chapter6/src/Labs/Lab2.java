public class Lab2
{
    public static void main(String[]args)
    {
        int[] a = {-99, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12345};
        int[] b = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, -99};
        int[] c = {10, 20, 30, 40, 50, -11818, 40, 30, 20, 10};
        int[] d = {32767};
        int[] e = {255, 255};
        int[] f = {9, 10, -88, 100, -555, 1000};

        System.out.println(findSmallest(a));
        System.out.println(findSmallest(b));
        System.out.println(findSmallest(c));
        System.out.println(findSmallest(d));
        System.out.println(findSmallest(e));
        System.out.println(findSmallest(f));

        System.out.println();

        int[] g = {-99, 1, 2, 3, 4, 5, 6, 6, 6, 6, 6, 7, 8, 9, 10, 12345, 5, 5, 5, 5};
        int[] h = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, -99};
        int[] i = {10, 20, 30, 40, 50, 10, 10, 40, 30, 20, 10};
        int[] j = {32767};
        int[] k = {255, 255};
        int[] l = {9, 10, -88, 100, -555, 1000};
        int[] m = {10, 10, 10, 11, 456, 10, 10, 2, 2, 2, 2, 2, 2, 2};
        int[] n = {-111, 1, 2, 3, 9, 11, 20, 30};
        int[] o = {9, 8, 7, 6, 5, 4, 3, 2, 0, -2, -989};
        int[] p = {12, 12, 15, 18, 21, 23, 1000};
        int[] q = {250, 19, 17, 15, 13, 13, 13, 13, 11, 10, 9, 6, 3, 2, 1, 1};
        int[] r = {9, 10, -8, 10000, -5000, 1000};

        System.out.println(findRepeat(g));
        System.out.println(findRepeat(h));
        System.out.println(findRepeat(i));
        System.out.println(findRepeat(j));
        System.out.println(findRepeat(k));
        System.out.println(findRepeat(l));
        System.out.println(findRepeat(m));
        System.out.println(findRepeat(n));
        System.out.println(findRepeat(o));
        System.out.println(findRepeat(p));
        System.out.println(findRepeat(q));
        System.out.println(findRepeat(r));

        
    }

    public static int findSmallest(int[] a)
    {
        int num = a[0];

        for (int i = 1; i < a.length; i++)
        {
            if (num > a[i])
            {
                num = a[i];
            }
        }

        return num;
    }

    public static boolean findRepeat(int[] a)
    {
        int num = a[0];
        
        for (int j = 1; j < a.length; j++)
        {
            for (int i = j; i < a.length; i++)
            {
                if (num == a[i])
                {
                    return false;
                }
            }
    
            num = a[j];
        }

        return true;
    }
}