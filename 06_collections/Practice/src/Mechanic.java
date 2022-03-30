import java.util.Random;
/**
 * 
 * @author Kami
 *
 */
public class Mechanic {

	private String name;
	private Boolean isWorking;
	
	public Mechanic(String name, Boolean isWorking) {
		this.name = name;
		this.isWorking = isWorking;
	}

	/***
	 * Return with the time needed to repair the car.
	 * @param car
	 * @return int
	 */
	public int repair(Car car) {
		System.out.println(name + " started to work.");
		return new Random().nextInt(5-1)+1;
	}
	
}
