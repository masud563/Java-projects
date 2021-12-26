import java.util.Scanner;
public class GreatestCommonDivisor {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please give the first number:");
		int number1 = input.nextInt();
		System.out.println("Please give the second number:");
		int number2 = input.nextInt();
		GreatestCommonDivisor.gcd(number1,number2);
	}
	
	public static  void gcd(int number1, int number2)
	{
		int a = 1,b = 1;
		while(number1 !=0 && number2 != 0)
		{
			if (number1 < number2)
			{
				a =number1;
				number1 = number2%number1;
				
			}
			else
			{
				b = number2;
				number2 = number1%number2;
			}
		}
		if (number1 == 0)
		{
			System.out.printf("The gcd of given numbers is:%dA",a);
		}
		
		else
		{
			System.out.printf("The gcd of given numbers is:%dB",b);
		}
	}
}
