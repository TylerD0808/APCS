import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouse {
    public static ArrayList<Integer> getListOfFactors(int number) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int k = 2; k < number; k++) {
            if (number % k == 0) {
                list.add(k);
            }
        }

        return list;
    }

    public static void keepOnlyCompositeNumbers(List<Integer> nums) {
        for (int l = 0; l < nums.size(); l++) {
            if (getListOfFactors(nums.get(l)).isEmpty()) {
                nums.remove(l);
            }
        }
    }
}