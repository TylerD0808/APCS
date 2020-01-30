import java.util.Scanner;
import java.io.File;
import java.io.IOException;


public class SquareTest {
    public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("magicData.txt"));

		int count = 1;                 //count which square we're on
		int size = scan.nextInt();     //size of next square

		//Expecting -1 at bottom of input file
		while (size != -1)
	    {
			Square square = new Square(size);

			square.readSquare(scan);

			System.out.println("\n******** Square " + count + " ********");
			
			square.printSquare();
			System.out.println();
			
			for (int y = 0; y < size; y++) {
				System.out.print("Row " + y + " sum: " + square.sumRow(y) + "\n");
			}

			System.out.println();

			for (int v = 0; v < size; v++) {
				System.out.print("Column " + v + " sum: " + square.sumCol(v) + "\n");
			}
				
			System.out.println();

			System.out.println("Diagnol 1 sum: " + square.sumMainDiag());
			System.out.println("Diagnol 2 sum: " + square.sumOtherDiag());

			System.out.println();

			if (square.magic() == true) {
				System.out.println("Square " + count + " is a magic square");
			}
			else {
				System.out.println("Square " + count + " is NOT a magic square");
			}
			
			System.out.println();
			
			//get size of next square
			size = scan.nextInt();
			count++;
	    }
    }
}