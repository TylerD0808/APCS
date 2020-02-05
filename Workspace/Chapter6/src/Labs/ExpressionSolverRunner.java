import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class ExpressionSolverRunner {
    public static void main(String[] args) {
        ExpressionSolver exps = new ExpressionSolver("3 + 5");
        System.out.println("3 + 5 = " + exps.toString());

        exps = new ExpressionSolver("3 * 5");
        System.out.println("3 * 5 = " + exps.toString());

        exps = new ExpressionSolver("3 - 5");
        System.out.println("3 - 5 = " + exps.toString());

        exps = new ExpressionSolver("3 / 5");
        System.out.println("3 / 5 = " + exps.toString());

        exps = new ExpressionSolver("5 / 5 * 2 + 8 / 2 + 5");
        System.out.println("5 / 5 * 2 + 8 / 2 + 5 = " + exps.toString());

        exps = new ExpressionSolver("5 * 5 + 2 / 2 - 8 + 5 * 5 - 2");
        System.out.println("5 * 5 + 2 / 2 - 8 + 5 * 5 - 2 = " + exps.toString());
    }
}