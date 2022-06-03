package threading;

import java.math.BigDecimal;
import java.util.List;

public class Szal1 extends Thread {

	private Object syncobject = new Object();
	private List<BigDecimal> s;

	public Szal1(List<BigDecimal> s) {
		super();
		this.s = s;
	}

	@Override
	public void run() {
		int c = 0;
		while (c<1000) {
			synchronized (syncobject) { //nem kéne nekünk, ez csak példa
				if (!s.isEmpty()) {
					c = s.get(0).intValue();
					s.remove(0);
					System.out.println(c + " removed from list");
				}
			}
		}
	}

}
