public class Smart_shift {

	public static void main(String[] args) {
		int testing = shiftIntegerLeft(123456, 5);
		System.out.println(testing);

		int testing1 = shiftIntegerRight(12345, 3);
		System.out.println(testing1);
	}

	public static int shiftIntegerLeft(int number, int shiftLeft) {

		String str = String.valueOf(number);
		String leftSide = "";
		String newNumber = "";

		for (int i = 0; i <= str.length() - 1; i++) {
			if (i < shiftLeft) {
				leftSide += str.charAt(i);
			} else {
				newNumber += str.charAt(i);
			}
		}
		newNumber += leftSide;
		return Integer.parseInt(newNumber);
	}

	public static int shiftIntegerRight(int number, int shiftRight) {

		String str = String.valueOf(number);
		String rightSide = "";
		String newNumber = "";

		for (int i = 0; i <= str.length() - 1; i++) {
			if (i < shiftRight) {
				rightSide += str.charAt(i);
			} else {
				newNumber += str.charAt(i);
			}
		}
		
		newNumber += rightSide;
		return Integer.parseInt(newNumber);
	}

}
