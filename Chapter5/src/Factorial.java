
public class Factorial {
	public static void main(String[] args)
	{
		long factorial = 1;
		System.out.printf("%s%40s%n","Number","Factorial");
		for (int i = 1; i <= 20 ; i++)
		{
			factorial = factorial*i;
			System.out.printf("%s%40d%n",i,factorial);
		}
		
	}
}
