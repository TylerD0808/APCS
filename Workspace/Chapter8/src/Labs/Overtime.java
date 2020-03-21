// ****************************************************************
//   Overtime.java
//
//   Reads a file of employee payroll information and determines
//   how many employees worked more than 40 hours.
// ****************************************************************

import java.util.Scanner;

public class Overtime {
	public static void main(String[] args) {
		String fileName; // Name of the file containing employee data
		Scanner scan = new Scanner(System.in);

		System.out.println("\nPayroll Program");
		System.out.print("Enter the name of the file containing payroll data: ");
		fileName = scan.nextLine();

		Payroll payroll = new Payroll();
		payroll.readPayrollInfo(fileName);

		System.out.println();

		System.out.println("Number of workers who worked overtime: " + payroll.numOvertime());
	}
}