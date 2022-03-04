import java.math.BigDecimal;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		//Vector
		//ArrayList
		//LinkedList
		//Map
		//Tree
		//FIFO
		//Ringbuffer
		//Stack

		Vector<BigDecimal> v = new Vector<BigDecimal>();
		v.add(new BigDecimal(3));
		v.add(new BigDecimal(3));
		v.remove(0);
		v.get(0);
		v.clear();
		
		List<BigDecimal> list = new ArrayList<BigDecimal>();
		
		List<BigDecimal> ll = new LinkedList<BigDecimal>();
		
		Map<BigDecimal, Integer> myMap = new HashMap<BigDecimal, Integer>();
		
		myMap.put(new BigDecimal(25), new Integer(0));
		
		myMap.put(new BigDecimal(25), new Integer(1));
		
		myMap.put(new BigDecimal(25), myMap.get(new BigDecimal(25))+1); // not sure
		
		List<BigDecimal> fifo = new ArrayList<BigDecimal>();
		fifo.add(new BigDecimal(6));
		fifo.add(new BigDecimal(26));
		fifo.add(new BigDecimal(1456546));
		
		fifo.get(0);
		fifo.remove(0);
		fifo.add(new BigDecimal(5));
		
		Stack<BigDecimal> s = new Stack<>();
		
		
	}

}
