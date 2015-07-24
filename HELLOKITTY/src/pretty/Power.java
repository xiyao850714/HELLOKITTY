package pretty;
public class Power {
	public static double myPower(double base, int e) {
		double result = 0.0d;
		if (e == 0.0d) // use e == 0, as e is int.
			return 1.0d;
		if (e == 1.0d)
			return base;
		if (e > 1.0d)
			result = myPower(base, e >> 1);
		result *= result;
		if (e % 2 == 1.0d)
			result *= base;
		if (e > -0.000001 && e < 0.000001) //the intention of this?
			result = 1.0 / result;
		return result;
	}

	public static void main(String[] args) {
		System.out.println(Power.myPower(5, 2));
		//this use case not pass, as you are not dealing with the negative number, you can tryPower.myPower(0.5, -1)
		System.out.println(Power.myPower(5, -1));
		System.out.println(Power.myPower(0.0000000001, 2));
		System.out.println(Power.myPower(0.5, -1));

	}

}
