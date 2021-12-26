import java.security.SecureRandom;
import java.util.Scanner;

public class CrapsWithWager {
	
	
	
	private static  double bankBalance = 1000;
	private static  SecureRandom randomNumber = new SecureRandom();  
	private enum Status{WON,CONTINUE,LOSE};
	
	
	
	public static void main(String[] args)
	{
		
		
		Scanner input = new Scanner(System.in);
		Status gameStatus;
		int myPoint=0;
		double wager;
		
		
	do
	{
		chatterBox();
		System.out.printf("Your balance is >>> %8.2f $%n",getBankBalance());
		do
		{
			System.out.print("Enter wager:");
		    wager = input.nextDouble();
		    if (wager <= 0 )
		    {
		    	System.out.println("Wager can't be negetive.");
		    }
		    if (wager > getBankBalance())
		    {
		    	System.out.println("Wager exceeds your balance.");
		    }
		    
		}while(wager <= 0 || wager > getBankBalance());
		
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
			System.out.println("Congratulation!!! You have won.\n\n\n\n");
			depositBankBalance(wager);
		}
		else 
		{
			System.out.println("You lose.\n\n\n\n");
			withdrawBankBalance(wager);
		}
	}while(getBankBalance() > 0 );
		
		
	}
	
	public static int rollDice()
	{
		int dice1 = 1 + randomNumber.nextInt(6);	
		int dice2 = 1 + randomNumber.nextInt(6);
		int sum = dice1 + dice2;
		
		System.out.printf("Player rolled :%d + %d = %d%n",dice1,dice2,sum);
		return sum;
	}
	
	public static void depositBankBalance(double depsoitAmount)
	{
		bankBalance += depsoitAmount;
	}
	public static void withdrawBankBalance(double withdrawAmount)
	{
		if (bankBalance >= withdrawAmount)
		{
			bankBalance -= withdrawAmount;
		}
		else 
			System.out.println("Sorry!You busted!");
	}
	
	public static double  getBankBalance()
	{
		return bankBalance ;
	}
	
	public static void chatterBox()
	{
		int chatterChoice = randomNumber.nextInt(2);
		
		switch(chatterChoice)
		{
		case 0:
			System.out.println("Oh! You're going for broke,huh?");
			break;
		case 1:
			System.out.println("Aw c'mon take a chance !");
			break;	
		case 2:
			System.out.println("You're up big. Now's the time to cash in your chips!");
				
		}
	}
	
}


