import java.util.ArrayList;
public class DotCom {
	
	private ArrayList<String> locOfCells;
	
	
	public void setLocation(ArrayList<String> loc) {
		locOfCells = loc;
	}
	
	
	public String checkYourself(String userguess) {
		
		String result = "miss";
		int index =locOfCells.indexOf(userguess);
		
		if (index >= 0) {
			locOfCells.remove(index);
		}
		
		if(locOfCells.isEmpty()) {
			result = "kill";
		}
		
		else {
			result = "hit";
		}
		
		return result;
	}

}
