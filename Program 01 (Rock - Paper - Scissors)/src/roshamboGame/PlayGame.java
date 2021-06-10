package roshamboGame;

public class PlayGame extends GameItems
{
	// Creates an object called "userPlayer" of the "Player" Class
	private Player userPlayer;
	// Creates an object called "Lisa" of the "Lisa" Class
	private Lisa Lisa;
	private Bart Bart;
	private choicesEnum userPlayerChoice;
	private choicesEnum lisaChoice;
	private choicesEnum bartChoice;
	private resultEnum gameResult;
	private int wins, loses, ties;
	
	public PlayGame()
	{
		super();
		userPlayer = new Player();
		Lisa = new Lisa();
		Bart = new Bart();	
	}
	
	public void playLisa()
	{
		userPlayerChoice = userPlayer.getChoice();
		lisaChoice = Lisa.getChoice();
		gameResult = getLisaResults();
		displayLisaResults();
		gameStats();
		
	}
	
	public void playBart()
	{
		userPlayerChoice = userPlayer.getChoice();
		bartChoice = Bart.getChoice();
		gameResult = getBartResults();
		displayBartResults();
		gameStats();
	}
	
	public void displayGameStats()
	{
		System.out.println("You have played" + (wins + loses + ties) + "times.");
		System.out.println("You won:" + " "+ wins + " " + "times.");
		System.out.println("You lose:" + " " + loses + " " + "times.");
		System.out.println("You tied:" + " " + ties + " " + "times. Good Day!");
		
	}
	
	public void gameStats()
	{
		if (gameResult == resultEnum.WIN)
		{
			wins = wins + 1;
		}
			
		else if (gameResult == resultEnum.LOSE)
		{
			loses = loses + 1;
		}
		else
			ties = ties + 1;
	}
	

	
	private void displayLisaResults()
	{
		switch(gameResult)
		{
		case WIN:
			System.out.println("Your" + " " + userPlayerChoice + " " + "beats" + " "+ "Lisa's" + " " 
			+ lisaChoice + " " + "you win!");
			break;
		case LOSE:
			System.out.println("Lisa's" + " " + lisaChoice + " " + "beats" + " " + "your" + " " 
			+ userPlayerChoice + " "+ "you lose!");
			break;
		case TIE:
			System.out.println("Your" + " " + userPlayerChoice + " " + "ties with" + " " 
			+ "Lisa's" + " "+ lisaChoice + " " + "it's a tie!");
			break;
		}
		
	}
	
	private void displayBartResults()
	{
		switch(gameResult)
		{
		case WIN:
			System.out.println("Your" + " " + userPlayerChoice + " " + "beats" + " "+ "Bart's" + " " 
			+ bartChoice + " " + "you win!");
			break;
		case LOSE:
			System.out.println("Bart's" + " " + bartChoice + " " + "beats" + " " + "your" + " " 
			+ userPlayerChoice + " "+ "you lose!");
			break;
		case TIE:
			System.out.println("Your" + " " + userPlayerChoice + " " + "ties with" + " " 
			+ "Bart's" + " "+ bartChoice + " " + "it's a tie!");
			break;
		}
		
	}
	
	public resultEnum getLisaResults()
	{
		if (userPlayerChoice == lisaChoice)
		{
			return resultEnum.TIE;
		}
		
		switch(userPlayerChoice)
		{
		case ROCK:
			return (lisaChoice == choicesEnum.SCISSORS ? resultEnum.WIN : resultEnum.LOSE);
		case PAPER:
			return (lisaChoice == choicesEnum.ROCK ? resultEnum.WIN : resultEnum.LOSE);
		case SCISSORS:
			return (lisaChoice == choicesEnum.PAPER ? resultEnum.WIN : resultEnum.LOSE);
		}
		return resultEnum.LOSE;
	}
	
	public resultEnum getBartResults()
	{
		if (userPlayerChoice == bartChoice)
		{
			return resultEnum.TIE;
		}
		
		switch(userPlayerChoice)
		{
		case ROCK:
			return (bartChoice == choicesEnum.SCISSORS ? resultEnum.WIN : resultEnum.LOSE);
		case PAPER:
			return (bartChoice == choicesEnum.ROCK ? resultEnum.WIN : resultEnum.LOSE);
		case SCISSORS:
			return (bartChoice == choicesEnum.PAPER ? resultEnum.WIN : resultEnum.LOSE);
		}
		return resultEnum.LOSE;
	}

}
