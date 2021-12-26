import java.util.Scanner;
public class HangmanGame {
	
	
	private int guessLeft = 8;
	private int correctAns = 0;
	
	
	public void play() {
		
		
		HangmanLexicon lexicon = new HangmanLexicon();
		int numberOfWords = lexicon.getWordCount();
		int choosedSerial = (int)(Math.random()*numberOfWords);
		String secretWord = lexicon.getWord(choosedSerial); //selecting the word from the list
		
		//System.out.println(word);
		
		StringBuilder dash = new StringBuilder(secretWord.length());
		Scanner input = new Scanner(System.in);
		String userGuessedLetter = new String();
		String tempString = "";
		char tempChar ;
		int position;
		boolean flag = true;
		
		for(int i = 0; i < secretWord.length(); i++) {
			dash.insert(i, '-');
		}
		System.out.println(secretWord);
		
		
		while(guessLeft > 0 || correctAns != secretWord.length()) {
			
			
			System.out.printf("The word look like this:%s\n", dash);
			System.out.printf("You have %d guesses left\n", guessLeft);
			
			
			do {
			System.out.print("Your guess:");
			userGuessedLetter = input.nextLine();
			}while(userGuessedLetter.length() != 1); //when user give more than one character then we should ask him again.
			
						
			for(int j = 0; j < secretWord.length(); j++) {
				tempChar = secretWord.charAt(j);
				tempString += tempChar;
				System.out.println(tempChar);
				if( tempString.toUpperCase() == userGuessedLetter.toUpperCase() ) {
					correctAns++;
					dash.replace(j, j+1, userGuessedLetter);
					position = j;
					flag = false;
					System.out.println("for loop");
				}
				
			}
				if(flag) {
					guessLeft--;
					
				}
			
		}
	}

}
