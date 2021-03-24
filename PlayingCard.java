package inClass;

public class PlayingCard {
private final Suit suit;
private final Rank rank;
public PlayingCard(Suit newSuit, Rank newRank) {
this.suit = newSuit;
this. rank = newRank;
}// Ending bracket of constructor
public Suit getSuit() {
return this. suit;
}// Ending bracket of method getSuit
public Rank getRank() {
return this. rank;
}// Ending bracket of method getRank
public String toString() {
return this. rank.getName() + " of " + this.suit.getSuit();
}// Ending bracket of method toString
public String toSymbol() {
return "" + this.rank.getValue() + this.suit.getSymbol();
}// Ending bracket of method toSymbol
}// Ending bracket of class PlayingCard

