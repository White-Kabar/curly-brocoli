
public class curly_brocoli {

	public static void main(String[] args) {
		// (6|2+8|2)1/2
		double a = 6.0, b = 8.0, z;
		z = f(a, b);
		System.out.println(z);
	}
	public static double f(double x, double y) {
		double an, ab, ac, result;
		an = Math.pow(x, 2);
		ab = Math.pow(y, 2);
		ac = an + ab;
		System.out.println(ac);
		result = Math.pow(ac ,  1.0/2);
		return result;
	}

}
