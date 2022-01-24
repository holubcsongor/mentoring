package Practice.endian;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Correct_endianness {

	private static String finalResult = "";
	
	public static void main(String[] args) {
		String text = getInput();
		bigOrLittleEndian(text.substring(0, 5));
		swapForInput(text);
		setInput(finalResult);
	}

	static void swapForInput(String text) {
		String[] parts = text.split(" ");
		finalResult = "FF FE ";
		for (int i=2; i<parts.length-1; i+=2) {
				finalResult += parts[i+1] + " ";
				finalResult += parts[i] + " ";
		}
	}

	public static void bigOrLittleEndian(String text) {
		String printConsole = "Yo, watcha doing?";
		String[] parts = text.split("\\s+");
		if (parts[0].equals("FE") && parts[1].equals("FF")) {
			printConsole = "The input was in Big Endian format";
		} else if (parts[0].equals("FF") && parts[1].equals("FE")) {
			printConsole = "The input was in Little Endian format";
		}
		finalResult = printConsole + "\n";
		System.out.println(printConsole);
	}
	
	static void setInput(String text) {	
		try (BufferedWriter br = new BufferedWriter(new FileWriter("C:\\Users\\Kami\\eclipse-workspace\\csongmep\\mentoring\\01_basic_types\\Practice\\endian\\output.txt"))) {
			br.write(text);
		}
		catch (IOException e) {
			System.out.println("File not found.\n" + e.getMessage());
		}
	}

	public static String getInput() {
		String line = "";
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Kami\\eclipse-workspace\\csongmep\\mentoring\\01_basic_types\\Practice\\endian\\input.txt"))) {
			line = br.readLine();		
		}
		catch (IOException e) {
			System.out.println("File not found.\n" + e.getMessage());
		}
		return line;
	}

}
