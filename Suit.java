package inClass;

public enum Suit {
	HEARTS("Hearts", '\u2665'), DIAMONDS("Diamonds",'\u2666'), 
	CLUBS("Clubs",'\u2663'), SPADES("Spades",'\u2660');
	
	private String suit;
	private char symbol;
	private Suit(String newSuit, char newSymbol) {
		this.suit = newSuit;
		this.symbol=newSymbol;
		
	}//ending bracket of constructor

public String getSuit() {
	return this.suit;
}//ending bracket of method getSuit


public char getSymbol() {
	return this.symbol;
}//ending bracket of method getSymbol

}// ending bracket of enum Suit
