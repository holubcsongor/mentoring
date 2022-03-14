import java.util.Random;

public class CarService {

	public static Boolean damageAssessmentSuccessful(String car) {
		if ((new Random().nextInt(100)) % 5 == 0) {
			return false;
		}
		return true;
	}
	
	
}
