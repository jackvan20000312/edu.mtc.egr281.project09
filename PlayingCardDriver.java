package inClass;

public class PlayingCardDriver {

	private static PlayingCard[] deck;

	public static void main(String[] args) {

		deck = new PlayingCard [52];

		int index = 0;

		for(Suit s : Suit.values()) {

			for(Rank r : Rank.values()) {

				deck [index] = new PlayingCard(s, r);
				++index;

			}// Ending bracket of foreach(Rank)

		}// Ending bracket of foreach(Suit)

		for(PlayingCard pc : deck) {
			System.out.println(pc.toString() + " --- " + pc.toSymbol());
		}// Ending bracket of foreach(deck)

		System.out.println(deck[7].toString());

	}// Ending bracket of method main
	
}// Ending bracket of class PlayingCardDriver