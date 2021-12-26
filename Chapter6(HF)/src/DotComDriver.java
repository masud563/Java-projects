import java.util.Scanner;
import java.util.ArrayList;
public class DotComDriver {
	
	
	public static void main(String[] args) {
		
	DotCom theDotCom = new DotCom();
	Scanner input = new Scanner(System.in);
	int numOfTries = 0;
	int randomNumber = (int)(Math.random()*5);
	boolean isAlive = true;
	
	int[] locations = {randomNumber, randomNumber + 1, randomNumber + 2};
	theDotCom.setLocation(locations);
	
	while(isAlive) {
		String guess = input.next();
		String result = theDotCom.checkYourself(guess);
		numOfTries++;
		
		if(result != "kill") {
			System.out.println(result);
		}
		else {
			System.out.println("You took " + numOfTries + "guesses."  );
		}
	}
	
	
	
		
	}
	
}
