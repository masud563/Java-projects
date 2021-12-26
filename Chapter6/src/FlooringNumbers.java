import java.util.Scanner;
public class FlooringNumbers {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double givenValue = 0;
		double modifiedValue = 0;
		
		
		while(givenValue != 'z')
		{
			System.out.print("Give a number:");
			givenValue = input.nextDouble();
			modifiedValue = Math.floor(givenValue);
			System.out.printf("%25s%35s%n","Given Value","Modified Value");
			System.out.printf("%25f%35f%n",givenValue,modifiedValue);
			
			
		}
	}
}
