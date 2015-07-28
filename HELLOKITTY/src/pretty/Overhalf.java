package pretty;

public class Overhalf {
	public static int getOverhalfelement(int[] n){
		int start = 0;
		int end = n.length - 1;
		boolean trans = true;
		while(start != end){
			if(n[start] > n[end]){
				int temp = n[start];
				n[start] = n[end];
				n[end] = temp;
				trans = !trans;
			}
			if(trans == true){
				end--;
			}else{
				start++;
			}
		}	
//		System.out.println(n[start]);
//		System.out.println(n[end]);
		return n[start];
	}

	public static void main(String[] args) {
		int[] s = {1, 1, 8, 1, 1, 1,10, 5, 2};
		Overhalf.getOverhalfelement(s);
	}
}
