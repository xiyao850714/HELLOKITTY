package pretty;

public class Postorder {
	public static boolean isPostorder(int[] n) throws Myexception{
		if(null == n){
		    return false;
		}
		if(n.length <= 2){
			return true;
		}
		return Postorder.isPostordersub(n, 0, n.length - 1);
	}
	public static boolean isPostordersub(int[] n, int start, int end) throws Myexception{
		int length = n.length - 1;
		if(start < 0){
			throw new Myexception("start should be great than 0");
		}
		if(end > length){
			throw new Myexception("end should be less than the length of the array");
		}
		
		int middle = 0;		
		for(int i = start; i < end; i++){
			if(n[i] > n[end]){
				middle = i;
				break;
			}
		} 
		
		for(int i = middle + 1; i < end; i++){
			if(n[i] < n[end]){
				System.out.println(false);
				return false;
			}
		}
		boolean before = false;
		boolean after = false;
		if(start <= middle - 1 || middle <= end - 1){
			return Postorder.isPostordersub(n,start, middle-1)&&Postorder.isPostordersub(n, middle, end -1);
		}
		return after;
	}

	public static void main(String[] args) {
	   int[] a = new int[]{5,7,6,9,11,10,8};
	   int[] a1 = new int[]{7,4,6,5};
	   try {
		Postorder.isPostorder(a);
		Postorder.isPostorder(a1);
	} catch (Myexception e) {
		System.out.print(e.getMessage());
	}
	   
	}
}
