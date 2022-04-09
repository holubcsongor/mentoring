import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * @author Kami
 * The FILE class for the application. This contains the necessary methods to write properly in the txt file.
 */

public class File {

	//init auxiliary variable for the file reading
	static boolean isInBody = false;
	//2 final variable which given the starting and ending tag for the file reading
	final static String BEGINS_WITH = "<body";
	final static String ENDS_WITH = "</body>";
	
	/**
	 * This method creates a defined txt, contains the html content in range of the begin and ending parameter.
	 * @param line The line from the reading.
	 * @param url This parameter contains the name of the txt file.
	 */
	public void writeToFile(String line, URL url) {

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(txtName(url), true)); // TODO újrafuttatásnál törölje a tartalmat, megoldás: eltárolom majd utoljára írom ki

			//starts reading if <body tag is in the line
			if (line.contains(BEGINS_WITH)) {
				isInBody = true;
				line = readUntil(line, BEGINS_WITH);
			}

			if (isInBody) {
				//stop reading after </body> tag is in the line
				if (line.contains(ENDS_WITH)) {
					isInBody = false;
					line = readUntil(line, ENDS_WITH);
				}
				//append the lines that are in the body tag
				writer.append(line + "\n"); // ? nem megterhelõ így, h mindig megnyitja és bemásolja?
				writer.close();
			}

		} catch (IOException e) {
			System.out.println("File reading failed.");
		}
	}

	/**
	 * This method delete the unnecessary data after or before the given keyword.
	 * @param text The line that needed to cut.
	 * @param keyword This variable defines whether the unnecessary part is before or after the keyword. BEGINS_WITH means before, and ENDS_WITH means after the keyword.
	 * @return Return the new line without the unnessecary parts.
	 */
	public static String readUntil(String text, String keyword) {
		int index = text.indexOf(keyword);
		if (keyword.equals(BEGINS_WITH)) {
			//deleting useless data from the beginning
			return (text.substring(index, text.length()));
		} 			
		//deleting useless data from the ending
		return (text.substring(0, lastIndex(index)));
	}
	
	/**
	 * This method calculate the last index of a keyword from a line.
	 * The indexOf method only gives the first letter of the keyword, this method add 7 to the index to get the final index.
	 * @param index The index of the keyword's first letter in the line.
	 * @return The index of the keyword's last letter in the line.
	 */
	public static int lastIndex(int index) {
		//</body> = 7
		return index+7;
	}
	
	/**
	 * This method gives the txt name.
	 * @param url The txt name will be named after this url.
	 * @return The host name of the url.
	 */
	public static String txtName(URL url) {	//TODO: last component 
		return url.getHost() + ".txt";
	}
	
}
