
public class HangmanLexicon {
	
	
	public int getWordCount() {
		return 10;
	}
	
	
	public String getWord(int index) {
		switch(index) {
		case 0: return "BUOY";
		case 1: return "COMPUTER";
		case 2: return "CONNOISSEUR";
		case 3: return "DEHYDRATE";
		case 4: return "FUZZY";
		case 5: return "HUBBUB";
		case 6: return "KEYHOLE";
		case 7: return "QUAGMIRE";
		case 8: return "SLITHER";
		case 9: return "ZIRCON";
		default: return "getWord:Illegal index";
		}
	}

}
