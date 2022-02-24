
public class Main {

	public static void main(String[] args) {

		System.out.println(args.length);
		
		System.out.println(Math.PI);
		
		int a = 3, b = a+1;
		
		int h = 3;
		int i = h++; //4
		int array[] = new int[] { i++, 2};
		
		if(i++ == 4)
		{
			System.out.println("4"); //1
		}
		else if(h < 2)
		{
			//2
			//goto label1; ha lenne ilyen
		}
		else
		{
			//3
		}
		System.out.println(i);
		
		
		label1 :
		if(i++ == 4)
		{
			 //1
		}
		else
		{
			if(h < 2) {
				//2
			}
			else {
				//3
			}
		}
		
		for( int x = 0; (x<5 && (h>2 || Math.PI>3)); x++) {
			System.out.println("cycle");
		}
		
//		int x = 0;
//		cycle_label:
//		if(x<5 && (h>2 || Math.PI>3))
//		{
//			System.out.println("cycle");
//			
//			x++;
//			goto cycle_label;
//		}
		
		
		for(;;)  // always true
		{
			break;
		}
		
		while(true)
		{
			break;
		}
		
		do {
			
		}while(false);
		
		for (int j : array) { //foreach
			
		}
		
		for(int col=0; col<8; col++)
		{
			for(int row=0; row<8; row++)
			{
				break;
			}
			continue;
		}
		
		int ar[] = { 0, 4, 2, 12, 24 };
		TestClass t = new TestClass(ar);
		
		switch(ar[2]){ // int, char, string, enum
		
		case 1 : System.out.println("case1");
		case 2 : 
		{ 
			System.out.println("case2");
			break;
		}
		case 3 :
		case 4 : 
		default: System.out.println("other"); break;
		
		}

		
	}

}
