//****************************************************************************************
//Author: Jacob Vaught       Modified: 10/22/20, 10/26/2020
//
//EGR-281  Project 09  			  Due: 10/28/20
//****************************************************************************************

/*
* Each player begins at square 0.
* If spin takes player past square #100, don't move, end turn.
* TODO Add more Constants...
*/
package project09;

import java.util.Scanner;



public class Project09 {
	public static final int FINAL_SQUARE=100;
//just spent SOOOO much time making this
	//Also this is based of of the Lowes logo on any lowes cashier computer
//ERROR Message	
public static final String ERROR_MESSAGE=
			"EEEEEEEEEEEEEEEEEEEEEEEEEEE     RRRRRRRRRR                      RRRRRRRRRR                         OOOOOOOOOOOOOOOOOOOOO       RRRRRRRRRR                      !!!!\n" + 
			"EEEEEEEEEEEEEEEEEEEEEEEEEEE     RRRRRRRRRRRRR                   RRRRRRRRRRRRR                     OOOOOOOOOOOOOOOOOOOOOOO      RRRRRRRRRRRRR                   !!!!\n" + 
			"EE                              RR         RRRRR                RR         RRRRR                 OO                     OO     RR         RRRRR                !!!!\n" + 
			"EE                              RR            RRRRR             RR            RRRRR             OO                       OO    RR            RRRRR             !!!!\n" + 
			"EE                              RR              RRRR            RR              RRRR            OO                       OO    RR              RRRR            !!!!\n" + 
			"EE                              RR                RRRR          RR                RRRR          OO                       OO    RR                RRRR          !!!!\n" + 
			"EE                              RR                 RRRR         RR                 RRRR         OO                       OO    RR                 RRRR         !!!!\n" + 
			"EE                              RR                 RRRRR        RR                 RRRRR        OO                       OO    RR                 RRRRR        !!!!\n" + 
			"EE                              RR                RRRR          RR                RRRR          OO                       OO    RR                RRRR          !!!!\n" + 
			"EE                              RR             RRRRR            RR             RRRRR            OO                       OO    RR             RRRRR            !!!!\n" + 
			"EE                              RR           RRRRR              RR           RRRRR              OO                       OO    RR           RRRRR              !!!!\n" + 
			"EE                              RR        RRRRR                 RR        RRRRR                 OO                       OO    RR        RRRRR                 !!!!\n" + 
			"EEEEEEEEEEEEEEEEEEEEEEEEEEE     RRRRRRRRRRRRRRR                 RRRRRRRRRRRRRRR                 OO                       OO    RRRRRRRRRRRRRRR                 !!!!\n" + 
			"EEEEEEEEEEEEEEEEEEEEEEEEEEE     RRRRRRRRRRRRRRR                 RRRRRRRRRRRRRRR                 OO                       OO    RRRRRRRRRRRRRRR                 !!!!\n" + 
			"EE                              RR           RRRR               RR           RRRR               OO                       OO    RR           RRRR               !!!!\n" + 
			"EE                              RR            RRRR              RR            RRRR              OO                       OO    RR            RRRR              !!!!\n" + 
			"EE                              RR             RRRR             RR             RRRR             OO                       OO    RR             RRRR             !!!!\n" + 
			"EE                              RR              RRRR            RR              RRRR            OO                       OO    RR              RRRR            !!!!\n" + 
			"EE                              RR               RRRR           RR               RRRR           OO                       OO    RR               RRRR           !!!!\n" + 
			"EE                              RR                RRRR          RR                RRRR          OO                       OO    RR                RRRR          !!!!\n" + 
			"EE                              RR                 RRRR         RR                 RRRR         OO                       OO    RR                 RRRR         !!!!\n" + 
			"EE                              RR                  RRRR        RR                  RRRR        OO                       OO    RR                  RRRR        !!!!\n" + 
			"EE                              RR                   RRRR       RR                   RRRR       OO                       OO    RR                   RRRR       \n" + 
			"EE                              RR                    RRRR      RR                    RRRR       OO                     OO     RR                    RRRR      \n" + 
			"EEEEEEEEEEEEEEEEEEEEEEEEEEE     RR                     RRRR     RR                     RRRR       OOOOOOOOOOOOOOOOOOOOOOO      RR                     RRRR     !!!!\n" + 
			"EEEEEEEEEEEEEEEEEEEEEEEEEEE     RR                      RRRR    RR                      RRRR       OOOOOOOOOOOOOOOOOOOOO       RR                      RRRR    !!!!\n";
	

//LADDERS
	public static final String LADDERMESSAGE1=" landed on sq 1.\n You study for a test. \n You get an A.";
	public static final String LADDERMESSAGE4=" landed on sq 4.\n You completed your homework the day after being assigned. \n You got a good grade.";
	public static final String LADDERMESSAGE9=" landed on sq 9.\n You took summer classes. \n You were able to graduate early.";
	public static final String LADDERMESSAGE21=" landed on sq 21.\n You decided to get an Engineering Degree.\n You make more money!";
	public static final String LADDERMESSAGE28=" landed on sq 28.\n You got a child. \n Congratualtions!";
	public static final String LADDERMESSAGE36=" landed on sq 36.\n You worked hard at your job.\n You got a pay raise!!!";
	public static final String LADDERMESSAGE51=" landed on sq 51.\n Your child just got married.\n You will have grandkids soon!!!";
	public static final String LADDERMESSAGE71=" landed on sq 71.\n You just turned 65.\n You are happily retired now.";
	public static final String LADDERMESSAGE80=" landed on sq 80.\n Congratulations, You have your first grandchild.\n Because You put in the effort while you were young,\n you now have the time and money to enjoy your grandchildren. ";
	//CHUTES
	public static final String CHUTESMESSAGE98=" landed on sq 98.\n You put off your homework until the day before the test. \n You almost FAIL the test.";
	public static final String CHUTESMESSAGE95=" landed on sq 95.\n You studied for the test the night of the test.\n You Overslept and missed the test.";
	public static final String CHUTESMESSAGE93=" landed on sq 93.\n You partied with your friends last night. \n You fell asleep during class.";
	public static final String CHUTESMESSAGE87=" landed on sq 87.\n You decided to get a Psychology degree.\n You make an average of $20,500 per year.";
	public static final String CHUTESMESSAGE64=" landed on sq 64.\n You committed a crime to help pay for your bills.\n You must now go to prison:( .";
	public static final String CHUTESMESSAGE62=" landed on sq 62.\n You have been late to your job for the past week.\n You have been fired.";
	public static final String CHUTESMESSAGE56=" landed on sq 56.\n You won the lottery.\n Statistically Speaking, there is a 70% chance you will be bankrupt in 5 years";
	public static final String CHUTESMESSAGE49=" landed on sq 49.\n Your Parents died.\n Sorry for your loss.";
	public static final String CHUTESMESSAGE47=" landed on sq 47.\n You smoked cigarettes.\n You have Lung cancer.";
	public static final String CHUTESMESSAGE16=" landed on sq 16.\n You never wanted to work with teams or make friends. \n You unfortunately died alone.";
	
	//INTEGERS
	public static final int INTEGER1=1;
	public static final int INTEGER4=4;
	public static final int INTEGER9=9;
	public static final int INTEGER21=21;
	public static final int INTEGER28=28;
	public static final int INTEGER36=36;
	public static final int INTEGER51=51;
	public static final int INTEGER71=71;
	public static final int INTEGER80=80;
	public static final int INTEGER98=98;
	public static final int INTEGER95=95;
	public static final int INTEGER93=93;
	public static final int INTEGER87=87;
	public static final int INTEGER64=64;
	public static final int INTEGER62=62;
	public static final int INTEGER56=56;
	public static final int INTEGER49=49;
	public static final int INTEGER47=47;
	public static final int INTEGER16=16;
	public static final int INTEGER38=38;
	public static final int INTEGER14=14;
	public static final int INTEGER31=31;
	public static final int INTEGER42=42;
	public static final int INTEGER84=84;
	public static final int INTEGER44=44;
	public static final int INTEGER67=67;
	public static final int INTEGER91=91;
	public static final int INTEGER100=100;
	public static final int INTEGER78=78;
	public static final int INTEGER75=75;
	public static final int INTEGER73=73;
	public static final int INTEGER24=24;
	public static final int INTEGER60=60;
	public static final int INTEGER19=19;
	public static final int INTEGER53=53;
	public static final int INTEGER11=11;
	public static final int INTEGER26=26;
	public static final int INTEGER6=6;
	
	public static void main(String[] args) {
		//prepare
		Scanner keyboard=new Scanner(System.in);
		Project09Spinner ssd = new Project09Spinner();
		Project09Player p1, p2;
		int spin;
		
		//input
		System.out.println("Welcome to Chutes and Ladders: Life edition.");
		System.out.println("You will run through different life scenarios.");
		System.out.println();
		System.out.println("Enter name of Player #1");
		p1= new Project09Player(keyboard.next());
		
		System.out.print("Enter Name Of Player #2");
		p2 = new Project09Player(keyboard.next());
	 //keyboard.next() goes up here^^^
		//process&output
		boolean isGameStillPlaying = true;
		do {
			spin = ssd.spin();
			p1.updateCurrentSquareNumber(spin);
			printSpin(p1, spin);
			int previousSquarep1=p1.getCurrentSquareNumber()-spin;
			ladderAndChutesDeterminant(p1, previousSquarep1, spin);
			isGameStillPlaying =printGame(p1);
			
			
			if(isGameStillPlaying) {
				spin = ssd.spin();
				p2.updateCurrentSquareNumber(spin);
				printSpin(p2, spin);
				int previousSquarep2=p2.getCurrentSquareNumber()-spin;
				ladderAndChutesDeterminant(p2, previousSquarep2, spin);
				isGameStillPlaying = printGame(p2);
			}
			
		}while(isGameStillPlaying);
		keyboard.close();
	}//ending bracket of method main
	
	//prints your spin.
	private static void printSpin( Project09Player game, int spin) {
		System.out.println();
			System.out.println(game.getName()+" got a "+spin);
			}

	//Determines if you won.
	private static boolean printGame(Project09Player game) {
	
		boolean wonYet = true;
	System.out.println(game.getName()+" is now  on Square "+game.getCurrentSquareNumber());
		if(game.getCurrentSquareNumber()==Project09.FINAL_SQUARE) {
			System.out.println(game.getName()+" Won!!");
			wonYet=false;
		}else if(game.getCurrentSquareNumber()>=Project09.FINAL_SQUARE+6)
		{
			//TESTING ERROR MESSAGE. MIGHT NOT BE NEEDED ANYMORE
			System.out.println(ERROR_MESSAGE
					+ "\n\nOther Method was supposed to prevent any number over 100 from getting to this point.");
			wonYet=false;
		}
		
		return wonYet;
	}
	// says sorry for landing on a square over 100.
	private static void ladderAndChutesDeterminant( Project09Player game, int previousSquare, int spin) {
		if(game.getCurrentSquareNumber()>Project09.FINAL_SQUARE) {
			game.updateCurrentSquareNumber(-spin);
			System.out.println("You have rolled more than "+(Project09.FINAL_SQUARE-previousSquare)+", hence you got a number larger than "+Project09.FINAL_SQUARE+"\nand you have lost your turn.");
		}
		
		else if(game.getCurrentSquareNumber()<=Project09.FINAL_SQUARE) {
			printLadderandChutesMessage(game, game.getCurrentSquareNumber());
		}
			previousSquare=game.getCurrentSquareNumber();
		}// end bracket of ladderAndChutesDeterminant
	
	//determines if person landed on special square
	private static void printLadderandChutesMessage(Project09Player game, int currentNumber) {
		
		switch(currentNumber) 
		{
		
		case INTEGER1: 
			System.out.println(game.getName()+LADDERMESSAGE1);
			game.updateCurrentSquareNumber(INTEGER38-INTEGER1);
			break;
		case INTEGER4: 
			System.out.println(game.getName()+LADDERMESSAGE4);
			game.updateCurrentSquareNumber(INTEGER14-INTEGER4);
			break;
		case INTEGER9: 
			System.out.println(game.getName()+LADDERMESSAGE9);
			game.updateCurrentSquareNumber(INTEGER31-INTEGER9);
			break;
		case INTEGER21:
			System.out.println(game.getName()+LADDERMESSAGE21);
			game.updateCurrentSquareNumber(INTEGER42-INTEGER21);
			break;
		case INTEGER28:
			System.out.println(game.getName()+LADDERMESSAGE28);
			game.updateCurrentSquareNumber(INTEGER84-INTEGER28);
			break;
		case INTEGER36:
			System.out.println(game.getName()+LADDERMESSAGE36);
			game.updateCurrentSquareNumber(INTEGER44-INTEGER36);
			break;
		case INTEGER51:
			System.out.println(game.getName()+LADDERMESSAGE51);
			game.updateCurrentSquareNumber(INTEGER67-INTEGER51);
			break;
		case INTEGER71:
			System.out.println(game.getName()+LADDERMESSAGE71);
			game.updateCurrentSquareNumber(INTEGER91-INTEGER71);
			break;
		case INTEGER80:
			System.out.println(game.getName()+LADDERMESSAGE80);
			game.updateCurrentSquareNumber(INTEGER100-INTEGER80);
			break;
		
			//CHUTES
		case INTEGER98: 
			System.out.println(game.getName()+CHUTESMESSAGE98);
			game.updateCurrentSquareNumber(INTEGER78-INTEGER98);
			break;
		case INTEGER95: 
			System.out.println(game.getName()+CHUTESMESSAGE95);
			game.updateCurrentSquareNumber(INTEGER75-INTEGER95);
			break;
		case INTEGER93: 
			System.out.println(game.getName()+CHUTESMESSAGE93);
			game.updateCurrentSquareNumber(INTEGER73-INTEGER93);
			break;
		case INTEGER87:
			System.out.println(game.getName()+CHUTESMESSAGE87);
			game.updateCurrentSquareNumber(INTEGER24-INTEGER87);
			break;
		case INTEGER64:
			System.out.println(game.getName()+CHUTESMESSAGE64);
			game.updateCurrentSquareNumber(INTEGER60-INTEGER64);
			break;
		case INTEGER62:
			System.out.println(game.getName()+CHUTESMESSAGE62);
			game.updateCurrentSquareNumber(INTEGER19-INTEGER62);
			break;
		case INTEGER56:
			System.out.println(game.getName()+CHUTESMESSAGE56);
			game.updateCurrentSquareNumber(INTEGER53-INTEGER56);
			break;
		case INTEGER49:
			System.out.println(game.getName()+CHUTESMESSAGE49);
			game.updateCurrentSquareNumber(INTEGER11-INTEGER49);
			break;
		case INTEGER47:
			System.out.println(game.getName()+CHUTESMESSAGE47);
			game.updateCurrentSquareNumber(INTEGER26-INTEGER47);
			break;
		case INTEGER16:
			System.out.println(game.getName()+CHUTESMESSAGE16);
			game.updateCurrentSquareNumber(INTEGER6-INTEGER16);
			break;
		default:
			break;
		}
		
	}//ending bracket of printLadderandChutesMessage
	

	
} //ending bracket of class HorseRace
