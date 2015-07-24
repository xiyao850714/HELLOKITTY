package pretty;
public class Power {
	public static double myPower(double base, int e) {
		double result = 0.0d;
		if (e == 0) // use e == 0, as e is int.
			return 1.0d;
		if (e == 1)
			return base;
		if (e > 1){
			result = myPower(base, e >> 1);
		    result *= result;			
		}
		if ((e & 1) == 1.0d)
			result *= base;
		if (e < 0 ) 
			if (equal(base,0.0))
				return 0.0d;
			else
				result = 1.0d / myPower(base, -e);			
		return result;
	}

	public static boolean equal(double a, double b){
		if((a-b) < 0.000001 && (a-b) > -0.000001)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		System.out.println(Power.myPower(5, 2));
		//this use case not pass, as you are not dealing with the negative number, you can tryPower.myPower(0.5, -1)
		System.out.println(Power.myPower(5, 3));
		System.out.println(Power.myPower(5, -2));
		System.out.println(Power.myPower(0.0000000001, 2));
		System.out.println(Power.myPower(0.0000000001, -2));
		System.out.println(Power.myPower(0.5, -1));

	}

}
