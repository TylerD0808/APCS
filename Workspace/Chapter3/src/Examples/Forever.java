public class Forever
{
   //-----------------------------------------------------------------
   //  Prints ever-decreasing integers in an INFINITE LOOP!
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      int count = 1;

      while (count <= 25)
      {
         System.out.println (count);
         count = count--;
      }

      System.out.println ("Done");  // this statement is never reached
   }
}
