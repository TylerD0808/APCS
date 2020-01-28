public class Practice
{
    public static void main(String[]args)
    {
        String a = "hi";
        String b = a;
        String c = "hi";
        String d = new String("hi");
        System.out.println(a ==b);
        System.out.println(b == c);
        System.out.println(c ==d);
        System.out.println(a.equals(b));
        System.out.println(b.equals(c));
        System.out.println(c.equals(d));
    }
}