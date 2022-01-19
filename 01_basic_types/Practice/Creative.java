package Practice;

public class Creative {

	public static void main(String[] args) {
		
		Integer in = new Integer(0);
		int in_old = 0;
		
		// value-based parameter passing
		increment(in_old);
		
		// reference-based parameter passing
		increment(in);
		
		//multable integer parameter passing
		MutableInteger in_new = new MutableInteger(0);
		increment(in_new);
		
		System.out.println(in);
		System.out.println(in_old);
		System.out.println(in_new);
		
	}
	
	public static void increment(Integer i) {
		i++;
	}

	public static void increment(MutableInteger i) {
		i.increment();
	}
	
}
