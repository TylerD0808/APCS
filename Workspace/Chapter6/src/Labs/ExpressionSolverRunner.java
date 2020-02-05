import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class ExpressionSolverRunner {
    public static void main(String[] args) {
        System.out.println();
        ExpressionSolver exps = new ExpressionSolver("3 * 5");
        System.out.println(exps.toString());
    }
}