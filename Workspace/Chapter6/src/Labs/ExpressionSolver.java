import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class ExpressionSolver {
    ArrayList<Integer> num = new ArrayList<Integer>();
    ArrayList<Character> operator = new ArrayList<Character>();
    ArrayList<Integer> space = new ArrayList<Integer>();

    public ExpressionSolver(String s) {
        int start = 0;

        findSpaces(s);

        for (int k = 0; k < space.size() - 1; k++) {
            num.add(Integer.parseInt(s.substring(start, space.get(k))));
            start = space.get(k) + 1;
            operator.add(s.charAt(start));
            k++;
            start = space.get(k) + 1;
        }

        num.add(Integer.parseInt(s.substring(start)));
        solveExpression(s);
    }

    public void findSpaces(String s) {
        for (int t = 0; t < s.length(); t++) {
            if (s.charAt(t) == ' ') {
                space.add(t);
            }
        }
    }

    public void solveExpression(String s) {
        int temp;
        int u = 0;

        while (u < operator.size()) {
            if (operator.get(u) == '*' || operator.get(u) == '/') {
                if (operator.get(u) == '*') {
                    temp = num.get(u) * num.get(u + 1);
                } else {
                    temp = num.get(u) / num.get(u + 1);
                }

                num.set(u, temp);
                num.remove(u + 1);
                operator.remove(u);
            }

            u++;
        }

        u = 0;

        while (u < operator.size()) {
            if (operator.get(u) == '+') {
                temp = num.get(u) + num.get(u + 1);
            } else {
                temp = num.get(u) - num.get(u + 1);
            }
            num.set(u, temp);
            num.remove(u + 1);
            operator.remove(u);

            u++;
        }
    }

    public String toString() {
        return "" + num.get(0);
    }
}