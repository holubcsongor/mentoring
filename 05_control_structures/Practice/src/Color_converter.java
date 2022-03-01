import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Color_converter {

	public static void main(String[] args) throws Exception {

		 List<String> colors = readConsole();
		 System.out.println(colors);

		List<String> mensColors = null;
		
		try {
			mensColors = mensColors(colors);
			
		} catch (NoRecordFoundException e) {
			System.out.println("Empty table. I should write some kind of user-friendly message, but Im already in late from school xd");
		}
		
		System.out.println(mensColors);
	}

	public static List<String> readConsole() {
		List<String> colors = new ArrayList<String>();
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String color;
			System.out.println("Give me the damn colors, otherwise write quit:");
			do {
				color = reader.readLine();
				if (!(color.equals("quit"))) { // hogy orvosoljam, hogy ne mentse el a listába a quit-ot. De nekem ez a
												// megoldás csúnya, h ezt a feltételt kétszer is vizsgálom
					colors.add(color);
				}
			} while (!(color.equals("quit")));
		} catch (IOException e) {
			System.out.println("Error with the reading.");
		}
		return colors;
	}

	public static List<String> mensColors(List<String> colors) throws NoRecordFoundException { // amúgy van vmi különbség, hogy én a paraméterben megadom a listát, vagy csak simán hivatkozok rá paraméterátadás nélkül?
		List<String> dummyColors = new ArrayList<String>();

		if (colors.isEmpty()) {
			throw NoRecordFoundException;
		}
		
		for (var color : colors) {
			
			switch (String.valueOf(color)) {
			case "cherry":
			case "cinammon":
				dummyColors.add("red");
				break;
			case "wine":
			case "plum":
			case "eggplant":
			case "grape":
			case "orchid":
				dummyColors.add("purple");
				break;
			case "lavender":
			case "gillyflower":
			case "pink":
			case "baby":
			case "violet":
			case "salmon":
				dummyColors.add("pink");
				break;
			case "tangerine":
			case "melon":
				dummyColors.add("orange");
				break;
			case "gold":
			case "sunflower":
				dummyColors.add("yellow");
				break;
			case "lime":
			case "avocado":
			case "limon":
			case "laurel":
			case "chiorophyll":
			case "moss":
			case "mint":
			case "emerald":
				dummyColors.add("green");
				break;
			case "pool":
			case "petroleum":
			case "sky":
			case "torquolse":
				dummyColors.add("blue");
				break;	
			default:  //kötelezõ amúgy a def, mert ilyen esetben nem tudok mit írni bele?			
			}
		}

		return dummyColors;
	}

}
