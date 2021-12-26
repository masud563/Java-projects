
public class SumOfNumber {
	
	public static void main(String[] args) {
		String test = "g1aa2g5";
		int result = sumOfNumber(test);
		System.out.println(result);
	}
	
	public static int sumOfNumber(String str) {
		int res = 0;
		String temp = "0";
		if(str == null || str == "") {
			return 0;
		}
		else {
			for(int i = 0; i < str.length(); i++) {
				if(Character.isDigit(str.charAt(i))){
					 temp = temp + str.charAt(i);
					 
				}
				else {
					res = res + Integer.parseInt(temp);
					temp = "0";
				}
			}
			res = res + Integer.parseInt(temp);
			return res;
		}
	}

}
