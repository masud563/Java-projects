
public class Diamond {
	public static void main(String[] args)
	{
		for (int i = 1; i<=5; i++)
		{
			
			for (int first = 4; first >= i; first--)
			{
				System.out.print(' ');
			}
			
			for (int second = 1; second <= 2*i-1; second++)
			{
				System.out.print('*');
			}
			
			
			System.out.println();
			
		}
		
		for (int j = 1; j <= 4; j++)
		{
			for (int third =1; third <= j; third++)
			{
				System.out.print(' ');
			}
			for (int forth =7; forth >= 2*j-1; forth--)
			{
				System.out.print('*');
			}
			System.out.println();
		}
		
	}
}
