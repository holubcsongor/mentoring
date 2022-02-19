package memory;

import java.util.ArrayList;

public class Copy_Methods {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(3);
		int a[] = new int[5];
		
		ArrayList<Integer> x = al; // shallow copy
		
		x.add(5);    // because shallow copy, "al" will also be modified
		int b[] = a; // shallow copy
		
		int c[] = new int[a.length];
		for(int i=0; i<c.length; i++)
		{
			c[i] = a[i];	// deep copy
		}
		
		ArrayList<Integer> y = (ArrayList<Integer>)al.clone(); // deep copy

	}

}
