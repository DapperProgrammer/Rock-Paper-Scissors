package roshamboGame;

import java.util.Random;

public class Lisa extends GameItems
{
	private Random randNum;
	
	public Lisa()
	{
		super();
		randNum = new Random();
	}
	
	public choicesEnum getChoice()
	{
		// Get a number between 1 and 3
		int LisaItem = 1 + randNum.nextInt(3);
		
		switch (LisaItem)
		{
		case 1: 
			return choicesEnum.ROCK;
		case 2:
			return choicesEnum.PAPER;
		}
		return choicesEnum.SCISSORS;
	}

}
