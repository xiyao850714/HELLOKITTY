package pretty;

public class DMatrix {
	    public static boolean searchMatrix(int[][] matrix, int target) {
	        int i =matrix.length-1; int j=0;  
	        int n = matrix.length; int m = matrix[0].length;  
	        while(i>=0&&j<m)  
	        {  
	            if(matrix[i][j]==target)  
	            {  
	            	System.out.println(true);
	                return true;  
	            }  
	            else if(matrix[i][j]<target)  
	            {  
	                j++;  
	            }  
	            else  
	            {  
	                i--;  
	            }  
	        }  
	        System.out.println(false);
	        return false;  
	    }   

	public static void main(String[] args) {
		int[][] m = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
		DMatrix.searchMatrix(m, 5);
	}

}
