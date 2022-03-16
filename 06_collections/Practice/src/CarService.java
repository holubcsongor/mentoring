import java.util.ArrayList;
import java.util.Random;

public class CarService {
//TODO
	private static ArrayList<Car> customers;
	
	public static Boolean damageAssessmentSuccessful(Car car) {
		if ((new Random().nextInt(100)) % 5 == 0) {
			return false;
		}
		return true;

	}

	public static void isItPreparable(Car car) throws MechanicUnableToFixIt {
		if ((new Random().nextInt(100)) % 7 == 0) {
			throw new MechanicUnableToFixIt();
		}
	}
	
}
