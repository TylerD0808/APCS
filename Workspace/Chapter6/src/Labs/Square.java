import java.util.Scanner;

public class Square {
    int[][] square;

    // --------------------------------------
    // create new square of given size
    // --------------------------------------
    public Square(int size) {
        square = new int[size][size];
    }

    // --------------------------------------
    // return the sum of the values in the given row
    // --------------------------------------
    public int sumRow(int row) {
        int rowSum = 0;
        for (int c = 0; c < square.length; c++) {
            rowSum += square[row][c];
        }
    }

    // --------------------------------------
    // return the sum of the values in the given column
    // --------------------------------------
    public int sumCol(int col) {
        int colSum = 0;
        for (int r = 0; r < square.length; r++) {
            colSum += square[r][col];
        }
    }

    // --------------------------------------
    // return the sum of the values in the main diagonal
    // --------------------------------------
    public int sumMainDiag() {
        int diag1Sum = 0;
        for (int i = 0; i < square.length; i++) {
            diag1Sum += square[i][i];
        }
    }

    // --------------------------------------
    // return the sum of the values in the other ("reverse") diagonal
    // --------------------------------------
    public int sumOtherDiag() {
        int diag2Sum = 0;
        for (int k = 0; k < square.length; k++) {
            diag2Sum += square[k][(square.length - 1) - k];
        }
    }

    // --------------------------------------
    // return true if the square is magic (all rows, cols, and diags have
    // same sum), false otherwise
    // --------------------------------------
    public boolean magic() {
        for (int x = 0; x < square.length; x++) {
            if (sumRow(x) != sumRow(0)) {
                return false;
            }
            if (sumCol(x) != sumCol(0)) {
                return false;
            }
        }
        if (sumMainDiag() != sumOtherDiag()) {
            return false;
        }

        if (sumRow(0) == sumCol(0) && sumCol(0) == sumMainDiag()) {
            return true;
        }
        else {
            return false;
        }
    }

    // --------------------------------------
    // read info into the square from the input stream associated with the
    // Scanner parameter
    // --------------------------------------
    public void readSquare(Scanner scan) {
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square.length; col++) {
                square[row][col] = scan.nextInt();
            }
        }
    }

    // --------------------------------------
    // print the contents of the square, neatly formatted
    // --------------------------------------
    public void printSquare() {
        for (int g = 0; g < square.length; g++) {
            for (int h = 0; h < square.length; h++) {
                System.out.print(square[g][h]);
            }
            System.out.print("\n");
        }
    }

}