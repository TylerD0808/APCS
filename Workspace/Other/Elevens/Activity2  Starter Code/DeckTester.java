import java.io.StringBufferInputStream;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 * 
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		String[] rank1 = { "Jack", "8", "Ace" };
		String[] suit1 = { "Clubs" };
		int[] value1 = { 11, 8, 1 };
		Deck deck1 = new Deck(rank1, suit1, value1);

		String[] rank2 = { "King", "4", "7" };
		String[] suit2 = { "Hearts", "Diamonds" };
		int[] value2 = { 13, 4, 7 };
		Deck deck2 = new Deck(rank2, suit2, value2);

		String[] rank3 = { "9", "2", "Queen" , "7"};
		String[] suit3 = { "Spades", "Hearts", "Clubs" };
		int[] value3 = { 9, 2, 12 , 7};
		Deck deck3 = new Deck(rank3, suit3, value3);

		System.out.println("Deck\tisEmpty\tSize");
		System.out.println("--------------------");
		System.out.println("Deck1\t" + deck1.isEmpty() + "\t" + deck1.size());
		System.out.println("Deck2\t" + deck2.isEmpty() + "\t" + deck2.size());
		System.out.println("Deck3\t" + deck3.isEmpty() + "\t" + deck3.size());

		System.out.println();
		System.out.println("Deck1 deal: " + deck1.deal());
		System.out.println("Deck2 deal: " + deck2.deal());
		System.out.println("Deck3 deal: " + deck3.deal());

		System.out.println();
		System.out.println("Deck1: " + deck1.toString() + "-------------------------------");
		System.out.println("Deck2: " + deck2.toString() + "-------------------------------");
		System.out.println("Deck3: " + deck3.toString());
	}
}
