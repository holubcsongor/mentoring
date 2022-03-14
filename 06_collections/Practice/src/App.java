import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class App {

	public static final CarService CARSERVICE = new CarService();

	public static void main(String[] args) {

		ArrayList<String> cars = new ArrayList<>();
		String[] tempCars = { "Volvo", "Fiat", "Volkswagen", "Fiat", "Opel", "Audi", "Opel", "Mazda" };
		cars.addAll(Arrays.asList(tempCars));

		for (String car : cars) {

			// 1. stage: adatfelmérés
			dataSurvey(car);

			// 2. stage: kárfelmérés
			damageAssessment(car);

		
			
			
			
		System.out.println();
		}

	}


	private static void damageAssessment(String car) {
		int numberOfResends = 0;
		do {
			Boolean measeringSuccessful = CARSERVICE.damageAssessmentSuccessful(car);
			if (measeringSuccessful == false) {
				numberOfResends++;
				System.out.println("Damage assessment was unseccessful with the " + car);
				System.out.println("We sending back the " + car);
			}
			else {
				break; //TODO csúnya break menj innen
			}
		}
		while (numberOfResends < 1);
		System.out.println("Damage assessment was seccessful with the " + car);
	}


	public static void dataSurvey(String car) {
		System.out.println("The data of the " + car + " car has been recorded.");
	}
	

}
