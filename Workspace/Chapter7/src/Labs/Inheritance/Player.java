// **********************************************************
// Player.java
//
// Defines a Player class that holds information about an athlete.
// **********************************************************

import java.util.Scanner;

public class Player {
    private String name;
    private String team;
    private int jerseyNumber;

    public boolean equals(Player player) {
        if (player.getTeam().equals(team) && player.getNumber() == jerseyNumber) {
            return true;
        } else {
            return false;
        }
    }

    public void readPlayer() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Name: ");
        name = scan.nextLine();

        System.out.print("Team: ");
        team = scan.nextLine();

        System.out.print("Jersey number: ");
        jerseyNumber = scan.nextInt();
    }

    public String getTeam() {
        return team;
    }

    public int getNumber() {
        return jerseyNumber;
    }
}