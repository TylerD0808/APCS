// ******************************************************************
//   Fib.java
//
//   A utility class that provide methods to compute elements of the
//   Fibonacci sequence.
// ******************************************************************
public class Fib {

    // --------------------------------------------------------------
    // Recursively computes fib(n)
    // --------------------------------------------------------------
    public static int fib1(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib1(n - 1) + fib1(n - 2);
        }
    }

    public static int fib2(int n) {
        int[] array = new int[n + 1];
        array[0] = 0;
        array[1] = 1;

        for (int k = 2; k < n + 1; k++) {
            array[k] = array[k - 1] + array[k - 2];
        }

        return array[n];
    }
}