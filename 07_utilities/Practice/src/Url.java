import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Kami
 * The URL class for the application. This class contains the necessary methods to verify a valid URL and than connect the right website according to the url.
 */
public class Url {

	//creating the url variable
	static URL url;
	//an instance of the File class
	final File FILE = new File();
	
	public static URL getUrl() {
		return url;
	}

	/**
	 * This method connect to the Internet with the given url in the parameter. If it was successful, than uses the File class's methods to save the necessary html content.
	 * @param inputURL The previously checked url, where we want to connect.
	 * @return none
	 */
	public void connectToURL(URL inputURL) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(inputURL.openStream()));
			String line;
			while ((line = reader.readLine()) != null) {
				FILE.writeToFile(line, url);
			}
			reader.close();
		} catch (Exception ex) {
			System.out.println("Unknown webpage error"); // TODO
		}
	}
	
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
		if (isStartsWithHttpOrHttps(uri)) {
			url = new URL(uri); 
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
		if (uri.length() > 4) { //http, https
		
			if (isHttp(uri) || isHttps(uri)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Check the given uri if it is begin with 'http'.
	 * @param uri The string needed to check.
	 * @return True if the parameter begin with 'http', otherwise returns with false.
	 */
	public static boolean isHttp(String uri) {
		return Protocols.HTTP.name().equals(uri.substring(0, 4));
	}
	
	/**
	 * Check the given uri if it is begin with 'https'.
	 * @param uri The string needed to checked.
	 * @return True if the parameter begin with 'https', otherwise returns with false.
	 */
	public static boolean isHttps(String uri) {
		return Protocols.HTTPS.name().equals(uri.substring(0, 5));
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
