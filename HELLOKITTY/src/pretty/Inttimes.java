package pretty;

public class Inttimes {
	public static int getIntTimes(int[] n, int target){
		int middle = 0;
		int start = 0;
		int end = n.length - 1;
		while(end > start){
			middle = start + ((end - start) >>> 1);
			if(n[middle] >= target){
				end = middle - 1;
			}
			if(n[middle] < target) {
				start = middle + 1;
			}
		}                                                                                                                     
		int k = 0;
		for(int i=start; i < n.length - 1; i++){
			if(n[i] == target){
				k++;
			}				
		}
		System.out.print(k);
		return k;
	}

	public static void main(String[] args) {
		int[] n = new int[]{1,2,3,4,5,6,6,6,6,6,6,6,6,6,6,6,8,9,12,40,80};
		Inttimes.getIntTimes(n, 6);
	}

}
