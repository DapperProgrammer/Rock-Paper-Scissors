package roshamboGame;

import java.util.Random;

public class Bart extends GameItems
{
	private Random randNum;
	
	public Bart()
	{
		super();
		randNum = new Random();
	}
	
	public choicesEnum getChoice()
	{
		// Gets 1
		int bartItem = 1 + randNum.nextInt(1);
		
		switch (bartItem)
		{
		case 1: 
			return choicesEnum.ROCK;
		case 2:
			return choicesEnum.PAPER;
		}
		return choicesEnum.SCISSORS;
	}

}
