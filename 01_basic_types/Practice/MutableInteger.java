package Practice;

public class MutableInteger {

	private int num;
	
	public MutableInteger(int num) {
		this.num = num;
	}
	
	public void increment() {
		num++;
	}
	
	public int getNum() {
		return num;
	}

	@Override
	public String toString() {
		return String.valueOf(num);
	}
	
}