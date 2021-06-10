package roshamboGame;
import java.util.Scanner;

public class RoshamboTesterApp 
{
	//String opponentChoice;

	public static void main(String[] args) 
	{
		Scanner print = new Scanner(System.in);
		// Creates an obj called "gameStart" of the "PlayGame" Class
		PlayGame gameStart = new PlayGame();
		char gameQuit = ' ';
		
		while (gameQuit != 'N')
		{
			System.out.println("Who would you like to play? Bart or Lisa?: ");
			String opponentChoice = print.nextLine();
			if (opponentChoice.equalsIgnoreCase("Bart"))
			{
				gameStart.playBart();
				System.out.println("Continue? Press any key or 'N' to quit.");
				gameQuit = print.nextLine().toUpperCase().charAt(0);
			}
			
			else if (opponentChoice.equalsIgnoreCase("Lisa"))
			{
				gameStart.playLisa();
				
				System.out.println("Continue? Press any key or 'N' to quit.");
				gameQuit = print.nextLine().toUpperCase().charAt(0);	
			}
			
		}
		
		print.close();
		gameStart.displayGameStats();

	}

}
