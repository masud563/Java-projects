
public class AsteriskChallenge {
	public static void main(String[] args)
	{
		
		for (int i = 1; i <=10; i++)
		{
			for (int first = 1; first <= i; first++)
			{
				System.out.print('*');
			}
			
			for (int second = 1; second <= 10-i; second++)
			{
				System.out.print(' ');
			}
			for (int third = 0; third <=10-i; third++)
			{
				System.out.print('*');
			}
			
			for (int forth = 1; forth <=i-1; forth++)
			{
				System.out.print(' ');
			}
			for (int fifth = 1; fifth <=i-1; fifth++)
			{
				System.out.print(' ');
			}
			for (int sixth = 0; sixth <=10-i; sixth++)
			{
				System.out.print('*');
			}
			for (int seventh = 1; seventh <=10-i; seventh++)
			{
				System.out.print(' ');
			}
			for (int eighth = 1; eighth <=i; eighth++)
			{
				System.out.print('*');
			}
			System.out.println();
			
			
		}
		
		
		
		
		
		
	}
}
