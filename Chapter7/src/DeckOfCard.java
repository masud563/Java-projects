import java.security.SecureRandom;


public class DeckOfCard {

	
	
	private Card[] deck;
	private int currentCard;
	private final int NUMBER_OF_CARDS = 52;
	private static final SecureRandom randomNumber = new SecureRandom();
	
	
	public DeckOfCard()
	{
		String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
		String[] faces = {"Ace","Duece","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
		deck = new Card[NUMBER_OF_CARDS];
		for (int counter = 0; counter < deck.length; counter++ )
		{
			deck[counter] = new Card(faces[counter%13],suits[counter/13]);
		}
		
	}
	
	
	public void shuffle()
	{
		currentCard = 0;
		for (int first = 0; first < deck.length; first++)
		{
			int second = randomNumber.nextInt(NUMBER_OF_CARDS);
			
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
						
		}
	}
	
	
	public Card deal()
	{
		if (currentCard < deck.length)
		{
			return deck[currentCard++];
		}
		
		else 
			return null;
	}
	

}
