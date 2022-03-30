import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * This is the main class (entry point) of the application
 * The application describes an auto-repair shop with 2 mechanic
 * @author kocskam
 */

public class App {
	// The service that runs the operation
	private static final CarService CARSERVICE = new CarService();
	
	// 2 instance of mechanic class: the mans who works on the car
	private static final Mechanic FRANK = new Mechanic("Frank", false);
	private static final Mechanic BOB = new Mechanic("Bob", false);

	
	/**
	 * The main entry point of the application
	 * @param args the command-line arguments of the program
	 * @return none
	 */
	public static void main(String[] args) {

		// initialize some data, which represent the customers (fifo)
		ArrayList<Car> cars = new ArrayList<Car>();
		cars.addAll(Arrays.asList(new Car("Mazda"), new Car("Fiat"), new Car("Volvo"), new Car("Volkswagen"),
				new Car("Opel"), new Car("Audi"), new Car("Opel"), new Car("Alfa Romeo")));

		while (true) {

			if (!(cars.isEmpty())) { // there are at least 1 car waiting

				Car car1 = nextCar(cars);

				// 1. and 2. stage: recording data and damage assessment
				reception(car1);

				// 3. stage: repairing the car(s)

				// FRANK
				repair(car1, FRANK);

//				//BOB
//				Car car2 = cars.get(0);
//				cars.remove(0);
//				repair(car2, BOB);

				// 4. stage: paying
				int amount = pay(car1);

				// 5. stage: complaint
				if (complaint()) {
					repairAfterComplaint(car1, BOB, amount);
				}
				System.out.println("The " + car1 + " is ready to go.\n");
			} else { // finished
				System.out.println("There are no customers here, the shop is closing.");
				break;
			}
		}
	}

	/**
	 * Get the next customer from the waiting list.
	 * 
	 * @param The list of the waiting cars.
	 * @return Car
	 */
	private static Car nextCar(ArrayList<Car> cars) {
		Car car = cars.get(0);
		cars.remove(0);
		return car;
	}

	/**
	 * Return whether the customer wants to complaint.
	 * 
	 * @return Boolean
	 */
	private static Boolean complaint() {
		if (new Random().nextInt(500) % 13 == 0) {
			System.out.println("The customer want to complain about the car.");
			return true;
		}
		return false;
	}

	/**
	 * After the complaint is made, print out the new prize of the work.
	 * @param int
	 * @return none
	 */
	public static void payAfterComplaint(int prize) {
		System.out.println("The final prize after the complaint is " + prize + " CsongForint.");
	}

	/**
	 * Calculate and print out the prize of the work.
	 * @param The car they were working on.
	 * @return The prize (int)
	 */
	private static int pay(Car car) {
		int prize = car.getTime() * new Random().nextInt(5);
		System.out.println("The final prize is " + prize + " CsongForint.");
		return prize;
	}

	/**
	 * Calls the repair and payAfterComplaint methods. Only used when the customer make a complaint.
	 * @return none
	 * @param car
	 * @param mechanic 
	 * @param int prize
	 */
	private static void repairAfterComplaint(Car car, Mechanic mechanic, int prize) {
		repair(car, mechanic);
		payAfterComplaint(prize);
	}

	// TODO
	/**
	 * Repair the car, which is given. Calculate, then set the time needed for the repairing. If it is not prepa 
	 * @throws MechanicUnableToFixIt //TODO - is it right?
	 * @return none
	 * @param car
	 * @param mechanic
	 */
	private static void repair(Car car, Mechanic mechanic) {
		try {
			CARSERVICE.isItRepairable(car);
			int time2Repair = mechanic.repair(car);
			car.setTime(car.getTime() + time2Repair);

		} catch (MechanicUnableToFixIt e) {
			System.out.println(e.getMessage());
			car.setTime(0);
		}
	}
	/**
	 * Measering the damage on the car. If the measering is unsuccessful sets the car's time to 0. Otherwise add 3 to the car's repairing's time.
	 * @return none
	 * @param car
	 */
	private static void reception(Car car) {
		int numberOfResends = 0;
		Boolean measeringSuccessful = null;
		do {
			dataSurvey(car);
			measeringSuccessful = CARSERVICE.damageAssessmentSuccessful(car);
			if (measeringSuccessful == false) {
				numberOfResends++;
				System.out.println("Damage assessment was unsuccessful with the " + car);
				car.setTime(0);
				System.out.println("We sending back the " + car);
			} else {
				break;
			}
		} while (numberOfResends < 1 && measeringSuccessful == false);

		System.out.println("Damage assessment was successful with the " + car + ".");
		final int DMG_ASSESSMENT_TIME = 3;
		car.setTime(car.getTime() + DMG_ASSESSMENT_TIME);
	}

	/**
	 * Recording the car's data. Also add 2 to the car's time.
	 * @return none
	 * @param car
	 */
	public static void dataSurvey(Car car) {
		final int DATASURVEY_TIME = 2;
		car.setTime(car.getTime() + DATASURVEY_TIME);
		System.out.println("The data of the " + car + " car has been recorded.");
	}

}
