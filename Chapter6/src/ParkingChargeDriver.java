import java.util.Scanner;

public class ParkingChargeDriver {
	
	public static void main(String[] args)
	{
		ParkingAccount account1 = new ParkingAccount("Alan",0);
		ParkingAccount account2 = new ParkingAccount("Paul",0);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Give the parking hour for account1:");
		double hour1 = input.nextDouble();
		
		if(hour1 > 0)
		{
				double charges1 = ParkingChargeCalculator(hour1);
			account1.setCharges(charges1);
		}
		
		else 
			System.out.println("Check your parking hour.");
		
		
		System.out.println("Give the parking hour for account2:");
		double hour2 = input.nextDouble();
		
		if(hour2 > 0)
		{
			double charges2 = ParkingChargeCalculator(hour2);
			account2.setCharges(charges2);
		}
		
		else 
			System.out.println("Check your parking hour.");
		
		
		System.out.printf("%20s%18s%n","Account","Charges");
		System.out.printf("%20s%18s","=======","=======");
		System.out.println();
		System.out.printf("%20s%18f%n",account1.getAccountName(),account1.getCharges());
		System.out.printf("%20s%18f%n",account2.getAccountName(),account2.getCharges());			
				
	}
	public static double ParkingChargeCalculator(double hour)
	{
		double minCharges = 2;
		double maxCharges = 10;
		if (hour>3)
		{
			double additionalCharges = 0.5*(hour -3);
			double totalCharges = minCharges + additionalCharges;
			if (totalCharges > maxCharges)
				totalCharges = maxCharges;
			return totalCharges;
		}
		
		else 
			return minCharges;
	}
}
