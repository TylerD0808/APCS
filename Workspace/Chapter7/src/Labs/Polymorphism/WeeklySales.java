// *************************************************************
//    WeeklySales.java
//
//    Sorts the sales staff in descending order by sales.
// ************************************************************

import java.util.Scanner;

public class WeeklySales {
    public static void main(String[] args) {
        Salesperson[] salesStaff;
        Scanner scan = new Scanner(System.in);
        int num, sales;
        String first, last;

        System.out.print("How many Salespeople? ");
        num = scan.nextInt();
        scan.nextLine();
        salesStaff = new Salesperson[num];

        System.out.println();

        for (int t = 0; t < salesStaff.length; t++) {
            System.out.print("First name of person " + (t + 1) + ": ");
            first = scan.nextLine();
            System.out.print("Last name of person " + (t + 1) + ": ");
            last = scan.nextLine();
            System.out.print("Total sales of person " + (t + 1) + ": ");
            sales = scan.nextInt();
            scan.nextLine();
            System.out.println();
            salesStaff[t] = new Salesperson(first, last, sales);
        }

        /*
         * salesStaff[0] = new Salesperson("Jane", "Jones", 3000); salesStaff[1] = new
         * Salesperson("Daffy", "Duck", 4935); salesStaff[2] = new Salesperson("James",
         * "Jones", 3000); salesStaff[3] = new Salesperson("Dick", "Walter", 2800);
         * salesStaff[4] = new Salesperson("Don", "Trump", 1570); salesStaff[5] = new
         * Salesperson("Jane", "Black", 3000); salesStaff[6] = new Salesperson("Harry",
         * "Taylor", 7300); salesStaff[7] = new Salesperson("Andy", "Adams", 5000);
         * salesStaff[8] = new Salesperson("Jim", "Doe", 2850); salesStaff[9] = new
         * Salesperson("Walt", "Smith", 3000);
         */

        Sorting.insertionSort(salesStaff);

        System.out.println("\nRanking of Sales for the Week\n");

        for (Salesperson s : salesStaff)
            System.out.println(s);
    }
}