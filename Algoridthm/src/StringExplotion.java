
public class StringExplotion {
	public static String stringExp(String str) {
		
		char[] charArray = str.toCharArray();
		String res = new String() ;
		
		for(int i = 0; i < str.length(); i++) {
			
			for(int j = 0; j <= i; j++ ) {
				res += charArray[j];
			}
		}
		
		return res;
		
	}
	
	public static void main(String[] args) {
		String st = "Code";
		String result = stringExp(st);
		System.out.println(result);
	}

}
