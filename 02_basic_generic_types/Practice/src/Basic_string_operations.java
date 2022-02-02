
public class Basic_string_operations {

	public static void main(String[] args) {

		byte[] array1 = { 1, 2, 3, 4, '\0' };
		byte[] array2 = { 5, 6, 7, 8, '\0' };

		byte[] copyArray = copyString(array1);
//		for (byte b : copyArray) {
//			System.out.println(b);
//		}

		byte[] concArray = concString(array1, array2);
//		for (byte b : concArray) {
//			System.out.println(b);
//		}

	}

	public static byte[] copyString(byte[] array) {
		int arrayLength = getArrayLength(array);

		byte[] newByte = new byte[arrayLength + 1];

		for (int i = 0; i <= arrayLength - 1; i++) {
			newByte[i] = array[i];
		}
		newByte[arrayLength] = '\0';
		return newByte;
	}

	public static byte[] concString(byte[] array1, byte[] array2) {
		int arrayLength1 = getArrayLength(array1);
		int arrayLength2 = getArrayLength(array2);

		byte[] newByte = new byte[arrayLength1 + arrayLength2 + 1];

		for (int i = 0; i <= arrayLength1 - 1; i++) {
			newByte[i] = array1[i];
		}

		for (int i = arrayLength1; i <= arrayLength1 + arrayLength2 - 1; i++) {
			newByte[i] = array2[i - arrayLength1];
		}

		newByte[arrayLength1 + arrayLength2] = '\0';

		return newByte;
	}

	public static int getArrayLength(byte[] array) {
		int count = 0;
		while (array[count] != '\0') {
			count++;
		}
		return count;
	}
}
