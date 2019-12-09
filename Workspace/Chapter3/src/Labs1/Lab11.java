package Labs1;
// ***************************************************************
//   Election.java
//
//   This file contains a program that tallies the results of
//   an election.  It reads in the number of votes for each of
//   two candidates in each of several precincts.  It determines
//   the total number of votes received by each candidate, the
//   percent of votes received by each candidate, the number of 
//   precincts each candidate carries, and the 
//   maximum winning margin in a precinct.
// **************************************************************

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab11
{
    public static void main (String[] args)
    {
	int votesForPolly = 0;  // number of votes for Polly in each precinct
	int votesForErnest = 0; // number of votes for Ernest in each precinct
	int totalPolly = 0;     // running total of votes for Polly
	int totalErnest = 0;    // running total of votes for Ernest
	int totalVote;
	int pollyWin = 0;
	int ernestWin = 0;
	int tie = 0;
	String response;    // answer (y or n) to the "more precincts" question

	Scanner scan = new Scanner(System.in);

	System.out.println ();
	System.out.println ("Election Day Vote Counting Program");
	System.out.println ();
	
	System.out.print("Do you have any precincts to report? (y or n) ");
	response = scan.next();
	
	while (response.equalsIgnoreCase("y"))
	{
		System.out.print("How many votes did Polly receive? ");
		votesForPolly = scan.nextInt();
		totalPolly = totalPolly + votesForPolly;
		
		System.out.print("How many votes did Ernest receive? ");
		votesForErnest = scan.nextInt();
		totalErnest = totalErnest + votesForErnest;
		
		if (votesForPolly > votesForErnest)
		{
			pollyWin++;
		}
		else if (votesForPolly < votesForErnest)
		{
			ernestWin++;
		}
		else
		{
			tie++;
		}
		
		System.out.println();
		System.out.print("Do you have any more precincts to report? (y or n) ");
		response = scan.next();
	}
	
	
	totalVote = votesForPolly + votesForErnest;
	
	DecimalFormat df = new DecimalFormat ("#0.##");
	double percent1 = 100.0 * votesForPolly / totalVote;
	double percent2 = 100.0 * votesForErnest / totalVote;
	
	System.out.println();
	System.out.println("\t# of Votes\tPercent\t\tPrecincts Won");
	System.out.println("Polly\t" + totalPolly + "\t\t" + df.format(percent1) + "%\t\t" + pollyWin);
	System.out.println("Ernest\t"+ totalErnest + "\t\t" + df.format(percent2) + "%\t\t" + ernestWin);
	System.out.println();
	
	if (tie == 1)
	{
		System.out.println("Polly and Ernest tied " + tie + " precinct");
	}
	else
	{
		System.out.println("Polly and Ernest tied " + tie + " precincts");
	}
	
	// Initializations

	// Loop to "process" the votes in each precinct

	// Print out the results
    }
}