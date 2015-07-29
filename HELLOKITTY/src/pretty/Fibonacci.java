package pretty;


public class Fibonacci {
	public static int getFibonacci(int n){
		int f1 = 1, f2 = 1;
		int result = 0;
		//The first and second element of fib.
		if(n == 1 || n == 2) return 1;
		//Use result to store the middle result.
		for(int i=3; i <= n; i++){
		result = f1 + f2;
		f2 = f1;
		f1 = result;
		}
		return result;
	}

	  public static void main(String[] args) {  
	        System.out.println(Fibonacci.getFibonacci(255));
	        
	    }  
}
