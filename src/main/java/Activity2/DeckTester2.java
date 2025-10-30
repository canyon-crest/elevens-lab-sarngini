package Activity2;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester2 {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"King", "3", "5", "Jack"};
		String[] suits = {"hearts", "spades", "clubs", "diamonds"};
		int[] points = {13, 3, 5, 11};
		Deck2 d = new Deck2(ranks, suits, points);
		
		System.out.println(d);
		System.out.println(d.deal().toString());
		System.out.println(d.isEmpty());
	}
}
