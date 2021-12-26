import java.security.SecureRandom;
public class Craps {
	private static  SecureRandom randomNumber = new SecureRandom();  
	private enum Status{WON,CONTINUE,LOSE};
	public static void main(String[] args)
	{
		Status gameStatus;
		int myPoint=0;
		int sumOfDice = rollDice();
		
		switch(sumOfDice)
		{
		case 7:
		case 11:
			gameStatus = Status.WON;
			break;
		case 2:
		case 3: 
		case 12:
			gameStatus = Status.LOSE;
			break;
			
		default:
			gameStatus = Status.CONTINUE;
		    myPoint = sumOfDice;
			break;
					
		}
		
		
		while(gameStatus == Status.CONTINUE)
		{
			sumOfDice = rollDice();
			
			if(sumOfDice == myPoint)
			{
				gameStatus = Status.WON;
			}
			
			if(sumOfDice == 7)
			{
				gameStatus = Status.LOSE;
			}
		 	
		}
		
		if (gameStatus == Status.WON)
		{
			System.out.println("Congratulation!!! You have won.");
		}
		else 
			System.out.println("You lose.");
		
		
	}
	
	public static int rollDice()
	{
		int dice1 = 1 + randomNumber.nextInt(6);	
		int dice2 = 1 + randomNumber.nextInt(6);
		int sum = dice1 + dice2;
		
		System.out.printf("Player rolled :%d%n",sum);
		return sum;
	}
}
