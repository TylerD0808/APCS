import java.util.*;

public class ListMostFreq {

    // method go will return the value
    // that appears the most
    // if several numbers all appear
    // the same number of times
    // return the first number found

    public static int go(List<Integer> ray) {
        int most = 0;
        int num = 0;
        int[] numArray = new int[ray.size()];
        int raySize = ray.size();

        while (ray.isEmpty() == false) {
            int h = 0;
            int g = ray.get(0);
            int n = 1;
            while (h < raySize) {
                if (g == ray.get(h)) {
                    n++;
                    ray.remove(h);
                    raySize--;
                } else {
                    h++;
                }
            }

            if (n > most) {
                most = n;
                num = g;
            }
        }
        /*
         * for (int z = 0; z < ray.size(); z++) { for (int h = 0; h < ray.size(); h++) {
         * if (ray.get(h) == ray.get(0)) { n++; ray.remove(h); } } if (n > largest) {
         * largest = n; num = ray.get(0); } n = 0; }
         */
        return num;
    }
}
