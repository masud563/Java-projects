import java.security.SecureRandom;
public class RollDie {
	public static void main(String[] args)
	{
		
		
		
		SecureRandom randomNumbers = new SecureRandom();
		int[] frequency = new int[7];
		
		
		for (int roll = 1; roll <= 6000000; roll++)
		{
			++frequency[ 1 + randomNumbers.nextInt(6)];
		}
		System.out.printf("%s\t%s%n","face","frequency");
		for (int face = 1; face <=6; face++)
		{
			System.out.printf("%d\t%d%n",face,frequency[face]);
		}
	}
	

}
