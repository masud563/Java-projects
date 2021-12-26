
public class MaxspanOfElementOfArray {
	public static int maxSpan(int[] nums) {
		int maxSpan = 0, temp =0, count;
		if (nums.length == 0) {
			return 0;
		}
		else {
		for(int i = 0; i < nums.length; i++) {
			count =0;
			temp = nums[i];
			for(int j =i+1; j < nums.length; j++) {
				++count;
				if(temp == nums[j] && count > maxSpan) {
					maxSpan = count;
				}
			}
		}
		return maxSpan + 1 ;
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] numArray = {1,2,1,1,3};
		int res = maxSpan(numArray);
		System.out.println(res);
	}

}
