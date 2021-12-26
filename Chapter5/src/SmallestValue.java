import java.util.Scanner;
public class SmallestValue {
	public static void main(String[] args){
		{
			Scanner input = new Scanner(System.in);
			System.out.print("How many number =");
			float n = input.nextFloat();
			System.out.print("Give the numbers =");
			float min = input.nextFloat();
			for(int i = 0 ; i <= n-2 ; i++)
			{
				float temp = input.nextFloat();
				if (temp < min)
					min = temp;
			}
			
			System.out.printf("The smallest number is =%f",min);
			
			
		}
	}
	

}
