import java.util.Scanner;
public class PerfectNumber {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Give a number:");
		int number = input.nextInt();
		isPerfect(number);
		
	}

	public static void isPerfect(int number)
	{
		int c = 0, sum = 0;
		
		while(c <= number/2)
		{
			c++;
			
			if(number%c == 0)
			{
				sum += c;
			}
		}
		
		if (number != sum)
		{
			System.out.println("The given number is not perfect");
		}
		else
			System.out.println("The given number is perfect");
	}
	
}
