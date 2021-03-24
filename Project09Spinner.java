package project09;

import java.util.Random;

public class Project09Spinner {
	public static final int DEFAULT_NUMBER_OF_SIDES=6;
	private int value;
	private int numberOfSides;
	private Random randomizer;
	
	public Project09Spinner() {
		this.randomizer = new Random();
		this.setNumberOfOptions(Project09Spinner.DEFAULT_NUMBER_OF_SIDES);
		this.setValue(this.spin());
		
	}
	public int getValue() {
		return this.value;
	}
	private void setValue(int newValue) {
		this.value=newValue;
	}
	public int getNumberOfOptions() {
		return this.numberOfSides;
	}
	private void setNumberOfOptions(int newNumberOfSides) {
		this.numberOfSides = newNumberOfSides;
	}
	public int spin() {
		this.setValue(this.randomizer.nextInt(this.getNumberOfOptions())+1);;
		return this.getValue();
	}
}// ending bracket fo classs
