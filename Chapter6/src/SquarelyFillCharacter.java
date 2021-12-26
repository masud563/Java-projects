import java.util.Scanner;
public class SquarelyFillCharacter {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Give a character :");
		char fill = input.next().charAt(0);
		System.out.println("Give the size of the square");
		int size = input.nextInt();
		squarelyFillCharacter(fill,size);
		
	}
	
	public static void squarelyFillCharacter(char fill,int size)
	{
		for (int i = 1; i <= size; i++)
		{
			for (int j = 1; j <= size; j++)
			{
				System.out.print(fill);
			}
			System.out.println();
		}
		
	}

}
