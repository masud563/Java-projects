
public class CardDriver {
	public static void main(String[] args)
	{
		DeckOfCard myDeckOfCard = new DeckOfCard();
		myDeckOfCard.shuffle();
		
		for (int i = 1; i <=52 ; i++)
		{
			System.out.printf("%-20s",myDeckOfCard.deal());
			
			if (i % 4 == 0)
			{
				System.out.println();
			}
		}
	}

}
