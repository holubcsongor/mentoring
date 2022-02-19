package memory;

import java.util.ArrayList;

public class Main {

	static int i = 0;
	static int s_int[];
	ArrayList<Integer> al = new ArrayList();
	
	public static void main(String[] args) {
		int i = 1;
		
		int j[] = new int[5];
		String s = "teszt";
		s = null;
		
		System.out.println(foo());
		System.out.println(foo()); 
		System.out.println(foo());
		System.out.println(foo());
		System.out.println(foo());
		System.out.println("Teszt");
		
		if("Teszt".equals(s))
		{
			
		}
		
		System.gc();
	}
	
	static int foo() 
	{
		i++;
		
		s_int = new int[5];
		
		return i;
	}

	
}
