
public class Car {

	private static int time;
	private static String type;
	
	public Car(String type) {
		this.type = type;
	}
	
	public static int getTime() {
		return time;
	}

	public void setTime(int time) {
		Car.time = time;
	}

	public static String getType() {
		return type;
	}

	public static void setType(String type) {
		Car.type = type;
	}

	@Override
	public String toString() {
		return type;
	}
	
	
	
}
