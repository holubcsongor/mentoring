/**
 * This is the entry point for the application.
 * This application request a valid url from the user, than connect to the Internet and read the given website's body content to a file.
 * @author Kami
 */
public class App {
	
	public static void main(String[] args) {
			
		//init the url and the file class
		Url urlClass = new Url();
		File fileClass = new File();
		Console consoleClass = new Console();
		
		//read url from the user via console
		consoleClass.readURL();
		//write the website body content to a file
		urlClass.connectToURL(urlClass.getUrl());
		fileClass.writeToFile(fileClass.script, urlClass.url);		
	}
}
