package threading;

import java.math.BigDecimal;
import java.util.*;

public class Szal2 implements Runnable{
	private int counter = 0;

	private List<BigDecimal> s;
	
	public Szal2(List<BigDecimal> s) {
		super();
		this.s = s;
	}

	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			s.add(new BigDecimal(getNext()));
			System.out.println(counter + " added to list");
		}
	}
	
	public synchronized int getNext() {
		return counter++;
	}

}
