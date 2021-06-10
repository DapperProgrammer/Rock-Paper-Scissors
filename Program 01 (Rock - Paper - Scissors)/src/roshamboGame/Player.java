package roshamboGame;

import java.util.Scanner;


public class Player extends GameItems
{
	Scanner print;
	
	public Player()
	{
		super();
		print = new Scanner(System.in);
	}
	
	public choicesEnum getChoice()
	{
		System.out.println("Please enter your choice: R = Rock P = Paper S = Scissors");
		// Prints out the first letter (at index 0) of the word the player enters
		// In case the player enters "Rock" only the "R" will be printed
		// Also forces the letter to be uppercase
		// Sets "char" equal to whatever the user has entered
		char playerChoice = print.nextLine().toUpperCase().charAt(0);
		
		switch(playerChoice)
		{
		case 'R':
			return choicesEnum.ROCK;
		case 'P':
			return choicesEnum.PAPER;
		case 'S':
			return choicesEnum.SCISSORS;
		}
		
		// If neither of the options are entered
		System.out.println("Error! Invalid Choice");
		// Call the "getChoice" method again. 
		return getChoice();
	
	}

}
