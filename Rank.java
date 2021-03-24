package inClass;

public enum Rank {
DEUCE(2, "Deuce"), TREY(3, "Trey"), FOUR(4, "Four"),
FIVE(5, "Five"), SIX(6, "Six"), SEVEN(7, "Seven"),
EIGHT(8, "Eight"), NINE(9, "Nine"), TEN(10, "Ten"),
JACK(11, "Jack"), QUEEN(12, "Queen"), KING(13, "King"),
ACE(14, "Ace");
	private int value;
	private String name;

private Rank(int newValue, String newName) {
this.value = newValue;
this.name = newName;
}// Ending bracket of constructor

public int getValue() {
return this.value;
}// Ending bracket of method getValue

public String getName() {
return this.name;
}// Ending bracket of method getName
}// Ending bracket of enum Rank
