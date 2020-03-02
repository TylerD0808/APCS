// **************************************************************
// ComparePlayers.java
//
// Reads in two Player objects and tells whether they represent
// the same player.
// **************************************************************

public class ComparePlayers {
	public static void main(String[] args) {
		Player player1 = new Player();
		Player player2 = new Player();

		System.out.println("Player 1");
		player1.readPlayer();

		System.out.println("\nPlayer 2");
		player2.readPlayer();

		if (player1.equals(player2)) {
			System.out.println("Same player");
		} else {
			System.out.println("Different player");
		}
	}
}