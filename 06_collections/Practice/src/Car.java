/**
 * 
 * @author Kami
 *
 */
public class Car {

	private int time;
	private String type;
	
	public Car(String type) {
		this.type = type;
	}
	
	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return type;
	}
	
}
