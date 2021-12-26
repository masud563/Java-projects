
public class RemoveString {
	public static void main(String[] args) {
		String bs = "hello" , rm = "ll";
		//System.out.println( bs.substring(4, 4));
		String res = removeString(bs,rm);
		System.out.println(res);
	}
	
	public static String removeString(String base, String remove) {
		int i = 0;
		boolean flag;
		if(base == "" || base == null || remove == "" || remove == null) {
			return base;
		}
		
		else {
			while(i <= (base.length() - remove.length())) {
				flag = (base.substring(i, i+remove.length()).equalsIgnoreCase(remove));
				if(flag == true) {
					
					base = base.substring(0,i) + base.substring(i+remove.length(), base.length()) ;
					continue;
				}
				i++;
			}
			return base;
		}
	}
		
}
