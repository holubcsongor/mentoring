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
				FILE.saveToArray(line);
			}
			reader.close();
		} catch (Exception ex) {
			System.out.println("Unknown webpage error"); // TODO
		}
	}
		
}
