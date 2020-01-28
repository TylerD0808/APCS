package Labs1;

public class Lab7Class
{
    int num;
    int den;

    public Lab7Class(int n, int d)
    {
        num = n;
        den = d;
    }
    
    public static Lab7Class add(Lab7Class x, Lab7Class y) 
    {
        return new Lab7Class(x.num * y.den + y.num * x.den, x.den * y.den);
    }
    
    public static Lab7Class subtract(Lab7Class x, Lab7Class y) 
    {
        return new Lab7Class(x.num * y.den - y.num * x.den, x.den * y.den);
    }
    
    public static Lab7Class multiply(Lab7Class x, Lab7Class y) 
    {
        return new Lab7Class(x.num * y.num, x.den * y.den);
    }
    
    public static Lab7Class divide(Lab7Class x, Lab7Class y) 
    {
        return new Lab7Class(x.num * y.den, x.den * y.num);
    }

}