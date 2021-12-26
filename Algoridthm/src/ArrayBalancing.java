
public class ArrayBalancing {
	
	public static void main(String[] args) {
		int[] a = {3,1,1,1,1,1,1,1};
		boolean result = arrayBalance(a);
		System.out.println(result);
	}
	
	public static boolean arrayBalance(int[] nums) {
		if(nums.length <= 1) {
			return false;
		}
		
		else {
			for(int i = 0; i <= nums.length-2; i++) {
				int res1 = 0;
				int res2 = 0;
				
				for(int j = 0; j <= i; j++) {
					res1 += nums[j];
				}
				
				for(int k = i+1; k<= nums.length-1; k++) {
					res2 += nums[k];
				}
				
				if(res1 == res2) {
					return true;
				}
			}
			return false;
		}
	}

}
