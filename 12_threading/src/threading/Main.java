package threading;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<BigDecimal> s = Collections.synchronizedList(new ArrayList<BigDecimal>());
		
		Thread t1 = new Szal1(s);
		Thread t2 = new Thread(new Szal2(s));
	
		t1.setPriority(Thread.MAX_PRIORITY);

		t2.start();

		synchronized (t1) {

			try {
				t1.wait(1); // [ms]
				t1.start();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("finished");
		}

	}
}