import java.util.Scanner;
public class Addition {
	
 public static void main(String[] args) {
	 int number1;
	 int number2;
	 int sum;
	 Scanner input = new Scanner(System.in);
	 
	 
	 System.out.print("Give the first number:");
	 number1 = input.nextInt();
	 System.out.print("Give the second number:");
	 number2 = input.nextInt();
	 
	 sum = number1 + number2;
	 
	 System.out.printf("The sum is %d\n",sum);
	 
	 
	 
	 
	 
	 
 }
}
