
public class ProductOfOdd {
	public static void  main(String[] args)
	{
		int product=1;
		for (int i = 1; i<=15 ; i=i+2)
		{
			
			product = product*i;
			
		}
		System.out.printf("The product of odd number is =%d",product);
	}
}
