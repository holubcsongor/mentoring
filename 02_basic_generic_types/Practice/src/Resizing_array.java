import java.util.Arrays;

public class Resizing_array {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5};
		int[] newNumbers = resizingArray(numbers, 3);
		System.out.println(Arrays.toString(newNumbers));
	}
	
	public static int[] resizingArray(int[] oldArray, int newArraySize) {
		int[] newArray = new int[newArraySize];
		int index = 0;
		for (int i : oldArray) {
			newArray[index] = i;
			index ++;
			if (index >= newArraySize) {
				break;
			}
		}
		return newArray;
	}
	
}