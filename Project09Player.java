package project09;

//gets user name
//gets current square number(0-100)

public class Project09Player {
	private int currentSquareNumber;
	private String name;
	//Main program
	public Project09Player(String newName) {
		this.setName(newName);
		this.setCurrentSquareNumber(0);
	}
	// get current square number
	public int getCurrentSquareNumber() {
		return this.currentSquareNumber;
	}
	//set current square number
	private void setCurrentSquareNumber(int newCurrentSquareNumber) {
		this.currentSquareNumber=newCurrentSquareNumber;
	}
	
	public void updateCurrentSquareNumber(int update) {
		this.setCurrentSquareNumber(this.getCurrentSquareNumber()+update);
	}	
	//Gets name
	public String getName() {
		return this.name;
	}
	//sets name
	private void setName(String newName) {
		this.name=newName;
	}
	
}// closing bracket of class
