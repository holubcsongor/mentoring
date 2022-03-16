import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class App {

	private static final CarService CARSERVICE = new CarService();
	private static final Mechanic FRANK = new Mechanic("Frank");
	private static final Mechanic BOB = new Mechanic("Bob");

	public static void main(String[] args) {

		ArrayList<Car> cars = new ArrayList<Car>();
		cars.addAll(Arrays.asList(new Car("Mazda"), new Car("Fiat"), new Car("Volvo"), new Car("Volkswagen"),
				new Car("Opel"), new Car("Audi"), new Car("Opel"), new Car("Alfa Romeo")));

//		System.out.println(cars);

		for (Car car : cars) {

			// 1. stage: adatfelvétel és kárfelmérés
			damageAssessment(car);

			// 3. stage: szerelés
			repair(cars);

			// 4. stage: fizetés
			pay(car);

			// 5. stage: reklamálás - tudom, tudom, kasszától való távozás után reklamációt
			// nem fogadunk el... :D
			complaint();

			System.out.println();
		}
	}

	private static void complaint() {
		if (new Random().nextInt(500) % 13 == 0) {
			System.out.println("The customer want to complain about the car.");

			// TODO visszaküldés
		}
	}

	private static void pay(Car car) {
		int prize = car.getTime() * new Random().nextInt(5);
		System.out.println("The final prize is " + prize + " CsongForint.");
	}

	// TODO egyszerre többen dolgoznak rajta
	private static void repair(ArrayList cars) {

		for (int i = 0; i <= cars.size(); i++) {

			Car car = cars[i];

			try {

				CARSERVICE.isItPreparable(car);
				FRANK.repair(car);
				
				System.out.println("The mechanic(s) started to repair your car.");
				car.setTime(car.getTime() + Mechanic.timeToRepair());

			} catch (MechanicUnableToFixIt e) {
				System.out.println(e.getMessage());
				car.setTime(0);
			}
		}
	}

	private static void damageAssessment(Car car) {
		int numberOfResends = 0;
		do {
			dataSurvey(car);
			Boolean measeringSuccessful = CARSERVICE.damageAssessmentSuccessful(car);
			if (measeringSuccessful == false) {
				numberOfResends++;
				System.out.println("Damage assessment was unsuccessful with the " + car);
				car.setTime(0);
				System.out.println("We sending back the " + car);
			} else {
				break; // TODO csúnya break menj innen
			}
		} while (numberOfResends < 1);

		if (numberOfResends == 1) { // ezt azért kellett, h még egyszer lefusson az adatfelvétel, de én csúnyának
									// tartom.
			dataSurvey(car);
		}

		System.out.println("Damage assessment was successful with the " + car + ".");
		final int DMG_ASSESSMENT_TIME = 3;
		car.setTime(car.getTime() + DMG_ASSESSMENT_TIME);
	}

	public static void dataSurvey(Car car) {
		final int DATASURVEY_TIME = 2;
		car.setTime(car.getTime() + DATASURVEY_TIME);
		System.out.println("The data of the " + car + " car has been recorded.");
	}

}
