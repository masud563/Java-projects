import java.util.Scanner;
public class BiggestAndSmallest {

	public static void main(String[] args) {
		int number1;
		int number2;
		int number3;
		int number4;
		int number5;
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Give the first number:");
		number1=input.nextInt();
		System.out.print("Give the second number:");
		number2=input.nextInt();
		System.out.print("Give the third number:");
		number3=input.nextInt();
		System.out.print("Give the forth number:");
		number4=input.nextInt();
		System.out.print("Give the fifth number:");
		number5=input.nextInt();
		
		
		
		if (number1>number2)
			if (number1>number3)
				if (number1>number4)
					if (number1>number5)
						System.out.printf(" %d is the biggest number",number1);
		
		
		
		if (number2>number1)
			if (number2>number3)
				if (number2>number4)
					if (number2>number5)
						System.out.printf(" %d is the biggest number",number2);
		
		
		if (number3>number2)
			if (number3>number1)
				if (number3>number4)
					if (number3>number5)
						System.out.printf(" %d is the biggest number",number3);
		
		
		if (number4>number2)
			if (number4>number3)
				if (number4>number1)
					if (number4>number5)
						System.out.printf(" %d is the biggest number",number4);
		if (number5>number2)
			if (number5>number3)
				if (number5>number4)
					if (number5>number1)
						System.out.printf(" %d is the biggest number",number5);
	}

}
