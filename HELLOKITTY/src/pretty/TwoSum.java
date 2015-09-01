package pretty;

public class TwoSum {
	public static int[] twoSum(int[] nums, int target){
		int length = nums.length;			
		int[] indices ={0,0};
		if(length == 0 || length == 1){return indices;}
		for(int i=0; i<length; i++){
			int leave = target - nums[i];
			for(int j=i+1; j<length; j++){
				if(leave == nums[j]){
					indices[0] = i+1;
					System.out.println(indices[0]);
					indices[1] = j+1;
					System.out.println(indices[1]);
				}
			}
		}
		return indices;
		
	}

	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 26;
		twoSum(nums, target);
	}

}
