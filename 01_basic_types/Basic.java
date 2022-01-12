public class Basic {

	// class-level variable. Only 1 exist in the program
	static int static_int = 0; 

	// class-level function. You can call it without an Object instance
	static void increment(Integer i) {
		i = new Integer(i + 1);
	}

	public static void main(String[] args) {
//**********************
// Type definitions
//**********************	
		
		// the boolean is an integer in lower level languages. 
		// 0 = false, all other means true
		boolean a = true;
		
		// 1 byte integer type. Mostly used for array, and conversion utilities.
		// In C and C++ instead of byte the type is called char. It can store integers
		// ranging from 0 to 255. It was enough for english alphabet and common symbols,
		// but nothing else.
		byte b;
		
		// 2 byte integer type. It is used for character-handling. 
		// It represents a Unicode character (character-encodings are subject to a later lecture)
		// The endianness of the "integer" may depend on the CPU-architecture, if the language
		// does not define it otherwise.
		// Range: 0-65536
		char c;
		
		// 4 byte integer type. It is the most commonly used type for storing numbers.
		// Range: 0-(2^32-1)
		int d;
		
		// 8-byte integer type. Used for extreme big numbers.
		// Range: 0-(2^64-1)
		long e;

		// 4 byte floating point number.
		float f;
		
		// 8-byte floating point number
		double g;

		// Giving value for character type ...
		c = 'A';
		
		// ..., or the same works for integer types as well, because a character is an integer
		d = 'A'; 
		
		// Giving value for a string. It has no other way!
		String st = "hello";

		// Integer: positive number
		d = 234;
		
		// Integer: negative number
		d = -265;
		
		// Integer in hexadecimal format (base 16): starts with 0x
		d = 0xf45f3e24;
		
		// Integer in binary format (base 2): starts with 0b
		d = 0b0101100;
		
		// Integer in octal format (base 8): starts with 0
		// Rarely used, but often makes problems.
		d = 055635; // 0val kezdõdik, ne használd
		
		// Integer with 32 byte long modifier
		d = 52486l;
		
		// Floating point modifier in a float number
		f = 0.01f;
		
		// Double-precision floating point. There is no need for modifier
		g = 3.42;

//*************
// Example for floating point "equalness"
//*************		
		
		//this variable contains an operation, so the result may not be correct
		f = 0.3f * 0.1f;
		
		// this is the expected result
		float x = 0.03f;
		
		// the maximal acceptable difference from the expected result
		// this number is represented in this way: 10 on the power of minus 4
		float epsilon = 1e-4f;

		// if the difference between the calculation and the expected result is
		// smaller than the limit, then it is viewed as correct
		if ((Math.abs(f - x)) < epsilon) {
			System.out.println("accurate");
		} else {
			System.out.println("inaccurate");
		}

		
		// making 2 integer: 1 object, and 1 base type
		Integer in = new Integer(0);
		int in_old = 0;

		// value-based parameter passing
		increment(in_old);
		
		// reference-based parameter passing
		increment(in);

		System.out.println(in);

		System.out.println(in_old);

		// Note: this example does not work as expected, because the Integer object is immutable,
		// cannot be changed. A new object is created, but the reference for the new object
		// does not come back to the caller.

//************
// Modifiers
//************		

		// final object is a const, cannot be changed after value-giving
		final Integer i;
		
	//// Good to know:	
		// In other languages the modifier const is used instead of final.
		// In C# for value-types const are used, for reference-types readonly is used
		/// const int constint = 0; // not in java
		
		// static:
		// Mentioned above: only 1 exists in the program, if that changes, 
		// every occurence changes as well.
		
		
		// volatile variables are always read out from the memory, cannot be cached.
		// used for variables which are used in more threads, 
		// or in variables that do not change its value often (e.g. an application-termination signal)
		volatile bool v_bool;

		// this "d" bool is not volatile, so it is cached. If we change its value directly, 
		// the cycle will continue as its value is still true. 
		while (d == true) {
		}

	}

}
