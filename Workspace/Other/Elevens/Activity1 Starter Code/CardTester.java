/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 * 
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card("Jack", "Clubs", 11);
		Card card2 = new Card("8", "Hearts", 8);
		Card card3 = new Card("Ace", "Spades", 1);

		System.out.println("Card\tRank\tSuit\tValue");
		System.out.println("-----------------------------");
		System.out.println("Card1\t" + card1.rank() + "\t" + card1.suit() + "\t" + card1.pointValue());
		System.out.println("Card2\t" + card2.rank() + "\t" + card2.suit() + "\t" + card2.pointValue());
		System.out.println("Card3\t" + card3.rank() + "\t" + card3.suit() + "\t" + card3.pointValue());

		System.out.println();
		System.out.println("Card1 matches card2: " + card1.matches(card2));
		System.out.println("Card1 matches card3: " + card1.matches(card3));
		System.out.println("Card2 matches card3: " + card2.matches(card3));

		System.out.println();
		System.out.println("Card1: " + card1.toString());
		System.out.println("Card2: " + card2.toString());
		System.out.println("Card3: " + card3.toString());
	}
}
