import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Color_converter {

	public static void main(String[] args) {
		readConsole();
	}

	public static void readConsole() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String color;
			System.out.println("Give me the damn colors, otherwise write quit:");
			
			do {
				color = reader.readLine();
				try {
					System.out.println(mensColors(color));
		
				} catch (NoRecordFoundException e) {
					System.out.println(e.getMessage());
				}
				catch (IllegalArgumentException e) {
					System.out.println(e.getMessage());
				}
			} while (!(color.equals("quit")));
		
		
		} catch (IOException e) {
			System.out.println("Error with the reading.");
		}
	}

	public static Enum mensColors(String color) throws NoRecordFoundException {

		color = color.toUpperCase();
		if (color.isEmpty()) {
			throw new NoRecordFoundException();
		}
		
		switch (Enum.valueOf(Colors.class, color)) {
			case CHERRY:
			case CINAMMON:
				return Colors.RED;
			case WINE:
			case PLUM:
			case EGGPLANT:
			case GRAPE:
			case ORCHID:
				return Colors.PURPLE;
			case LAVENDER:
			case GILLYFLOWER:
			case PINK:
			case BABY:
			case VIOLET:
			case SALMON:
				return Colors.PINK;
			case TANGERINE:
			case MELON:
				return Colors.ORANGE;
			case GOLD:
			case SUNFLOWER:
				return Colors.YELLOW;
			case LIME:
			case AVOCADO:
			case LIMON:
			case LAUREL:
			case CHIOROPHYLL:
			case MOSS:
			case MINT:
			case EMERALD:
				return Colors.GREEN;
			case POOL:
			case PETROLEUM:
			case SKY:
			case TORQUOLSE:
				return Colors.BLUE;
			default:
				throw new NoRecordFoundException();
		}
	}
}
