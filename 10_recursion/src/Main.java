
public class Main {

	static final int max_depth = 1000000;
	
	static int[] cache = new int[20000];
	
	public static void main(String[] args) {
		
		int i=5000;
		
		System.out.println(i + ". fibonacci szám = " + fibonacci(i));

//		for(char c = 'A'; c<='Z'; c++)
//		{
//			System.out.println(c);
//		}
		
	    print_abc_to('E');
		
	}
	
	public static int fibonacci(int n)
	{
		if(n<=0)
			return 0;
		
		if(n<=2)
		{
			cache[n] = 1;
			return 1;
		}
		
		if(cache[n] != 0)
		{
			return cache[n];
		}
		
		int fib = fibonacci(n-2) + fibonacci(n-1);
		cache[n] = fib;
		
		return fib;
	}
	
	// A B C D .... W X Y Z
	public static void print_abc_to(char c) {
		if(c <'A' || c>'Z')
		{
			return;
		}
		
		print_abc_to((char)(c-1));
		System.out.println(c);
		
	}
	
//	public static int fibonacci(int n)
//	{
//		if(n==1 || n == 2)
//		{
//			return 1;
//		}
//		
//		if(n <= 0 || n > max_depth) //stack-overflow ellen
//		{
//			return 0;
//		}
//		
//		int prev_prev = fibonacci(n-2);
//		int prev = fibonacci(n-1);
//		
//		//integer_overflow ellen
//		if(prev_prev <0 || prev<0)
//			return 0;
//		
//		return prev_prev + prev;
//	}

}


// 1 1 2 3 5 8 13 21 34 55 ...
