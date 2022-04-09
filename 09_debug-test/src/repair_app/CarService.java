package repair_app;
import java.util.Random;
/**
 * 
 * @author Kami
 * The service for the application.
 */
public class CarService {
	/**
	 * Returns whether the damage assessment was successful.
	 * @param car
	 * @return Boolean
	 */
	public boolean damageAssessmentSuccessful(Car car) {
		return (new Random().nextInt(100) % 5 != 0);
	}
	/**
	 * Returns whether the car is repairable.
	 * @param car
	 * @throws MechanicUnableToFixIt
	 */
	public void isItRepairable(Car car) throws MechanicUnableToFixIt {
		if ((new Random().nextInt(100)) % 7 == 0) {
			throw new MechanicUnableToFixIt();
		}
	}
	
}
