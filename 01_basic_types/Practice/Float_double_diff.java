package Practice;

public class Float_double_diff {

	public static void main(String[] args) {
		
		final double PI = Math.PI;
		
		float float_pi = (float) PI;
		
		double result = float_pi - Math.PI;

		System.out.println(result);
		
//		System.out.println(diffBetweenFloatAndDouble(PI));
		
		//Less simple way to solve Csongi's practice ;)
//		System.out.println((float)Math.PI - Math.PI);
		
	}
	
	//Unatkozok, úgyhogy csinálok hozzá egy metódust xd
	public static double diffBetweenFloatAndDouble(double double_num) {
		return (float) double_num - double_num;
	}
	
}
