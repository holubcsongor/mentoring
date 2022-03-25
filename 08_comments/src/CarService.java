import java.util.ArrayList;
import java.util.Random;

public class CarService {
//TODO
	//FIXME
	//XXX
	
	
	private static ArrayList<Car> customers;
	
	public static Boolean damageAssessmentSuccessful(Car car) {
		if ((new Random().nextInt(100)) % 5 == 0) {
			return false;
		}
		return true;

	}

	/** 
	 * The function decides if a car is repairable or not
	 * @param car The car of the customer
	 * @throws MechanicUnableToFixIt Exception is thrown if the mechanic can't fix the car
	 * @implNote A random generator is used for selecting if the car is repairable
	 */
	public static void isItPreparable(Car car) throws MechanicUnableToFixIt {
		if ((new Random().nextInt(100)) % 7 == 0) {
			throw new MechanicUnableToFixIt();
		}
	}
	
}
