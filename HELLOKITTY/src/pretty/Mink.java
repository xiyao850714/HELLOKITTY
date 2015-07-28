package pretty;

public class Mink {
	public static void getMink(int[] n){
		
	}
	public static void quickSort(int[] a, int lo0, int hi0) throws Myexception {
	    int lo = lo0;
	    int hi = hi0;

	    if (lo >= hi)
	      {throw new Myexception("j0 should be greater than i0");}
	    boolean transfer=true;

	    while (lo != hi) {
	      if (a[lo] > a[hi]) {
	        int temp = a[lo];
	        a[lo] = a[hi];
	        a[hi] = temp;
	        transfer = (transfer == true) ? false : true;
	      }

	      if(transfer)
	        hi--;
	      else
	        lo++;
	    }
	    lo--;
	    hi++;
	    quickSort(a, lo0, lo);
	    quickSort(a, hi, hi0);
	} 
	public static void main(String[] args) {
		   int[] nums = {27, 8, 57, 9, 23, 41, 65, 19, 0, 1, 2, 4, 5};
		   try {
			Mink.quickSort(nums, 0, nums.length-1);
		} catch (Myexception e) {
			System.out.println(e.getMessage());
		}
		    for(int i = 0; i < nums.length; ++i) {
		      System.out.print(nums[i] + ",");
		    }
		    System.out.println(""); 
	}

}
