
public class Enum_int_converter {
	public static void main(String[] args) {

		try {
			System.out.println(getEnumFromNumber(7));
		} catch (InvalidArgumentException e) {
			e.printStackTrace();
		}
		System.out.println(getNumberFromEnum(Days.MONDAY));
	}

	public static int getNumberFromEnum(Days day) {
		switch (day) {
		case MONDAY:
			return 1;
		case TUESDAY:
			return 2;
		case WEDNESDAY:
			return 3;
		case THURSDAY:
			return 4;
		case FRIDAY:
			return 5;
		case SATURDAY:
			return 6;
		case SUNDAY:
			return 7;
		default:
			return 0;
		}
	}

	public static Days getEnumFromNumber(int number) throws InvalidArgumentException {
		switch (number) {
		case 1:
			return Days.MONDAY;
		case 2:
			return Days.TUESDAY;
		case 3:
			return Days.WEDNESDAY;
		case 4:
			return Days.THURSDAY;
		case 5:
			return Days.FRIDAY;
		case 6:
			return Days.SATURDAY;
		case 7:
			return Days.SUNDAY;
		default:
			throw new InvalidArgumentException("Stupid.");
		}
	}
}
