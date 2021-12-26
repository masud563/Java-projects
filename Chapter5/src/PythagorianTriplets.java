
public class PythagorianTriplets {
	public static void main(String[] args)
	{
		for (int side1 = 1; side1 <= 500; side1++)
		{
			
			for (int side2 = 1; side2 <=500; side2++)
			{
				for (int hypotenuse =1; hypotenuse <=500; hypotenuse++)
				{
					
					if((hypotenuse*hypotenuse)==(side1*side1+side2*side2))
					{
						System.out.printf("%8d%8d%8d%n",side1,side2,hypotenuse);
					}
				}
			}
		}
		
		
		
	}
}
