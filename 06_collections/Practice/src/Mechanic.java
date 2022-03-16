import java.util.Random;

public class Mechanic {

	private static String name;
	
	public Mechanic(String name) {
		this.name = name;
	}
	
	public static int timeToRepair() {
		return new Random().nextInt(30);
	}
	
	public static void repair(Car car) {
		System.out.println(name + " started to work.");
	}
	
}
