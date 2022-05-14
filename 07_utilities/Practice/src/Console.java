import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Console {
	
	/**
	 * This method request an uri from the user through the console until that is appropriate to the criterias.
	 * The user get 'Invalid uri.' message, if the uri does not meet the conditions. 
	 * If it does but there are other problems like 403 forbidden, or 5xx server error problems, 
	 * than the user receives an 'The webpage does not exist' message.
	 * @return none
	 */
	public static void readURL() {
		//initializing two auxiliary variable
		String untestedURI = "";
		boolean success = false;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//Reading from console until 1 correct uri.
		do {
			//request a line from console
			try { //TODO rakjam 1 try-ba, vagy jó így külön?
				System.out.println("Please write the uri: ");
				untestedURI = br.readLine();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}

			//testing the input
			try {
				if (test(untestedURI)) {
					success = true;
				} else {
					System.out.println("Invalid uri.");
				}
			} catch (MalformedURLException e) {
				System.out.println("The webpage does not exist.");
			}

		} while (!(success));
	}
	
	/**
	 * This method check the uri if it is a correct url.
	 * @param uri The uri, which needed to test before using it.
	 * @return Whether the uri is passed all the criterias or not.
	 * @throws MalformedURLException
	 */
	public static boolean test(String uri) throws MalformedURLException {	
		Url.url = new URL(uri);
		if (isStartsWithHttpOrHttps(uri)) {
			return true;
		}
		return false;
	}
	
	/**
	 * Check if the uri start one of the given parameter (in this case 'http' and 'https') or not.
	 * @param uri The uri that needed to test.
	 * @return True, if the uri starts with 'http' or 'https', false otherwise.
	 */
	public static boolean isStartsWithHttpOrHttps(String uri) {
		uri = formatInput(uri);
		return Url.url.getProtocol().equals("http") || Url.url.getProtocol().equals("https");
	}
	
	/**
	 * Convert the input to upper case.
	 * @param input This string needed to convert.
	 * @return With the converted string.
	 */
	public static String formatInput(String input) {
		return input.toUpperCase();
	}							
	
}
