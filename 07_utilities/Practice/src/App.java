import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class App {

	static boolean isInBody = false;

	public static void main(String[] args) throws MalformedURLException {

		validURL(new URL("https://moly.hu/"));
//		URL url = readURL();
//		validURL(url);

	}

	public static URL readURL() {
		String rawURI = "";
		URL url = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean success = false;
		do {
			try {
				System.out.println("Please write the uri: ");
				rawURI = br.readLine();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}

			try {
				if (test(rawURI)) {
					url = new URL(rawURI);
					success = true;
				} else {
					System.out.println("Invalid uri.");
				}
			} catch (MalformedURLException e) {
				System.out.println("The webpage does not exist");
			}

		} while (!(success));

		return url;
	}

	public static boolean test(String uri) throws MalformedURLException {
		uri = formatInput(uri);
		if (isStartsWithHttpOrHttps(uri)) {
			URL url = new URL(uri); // az baj, hogy itt már létrehoztam egy URL típust, de nem használom fel, és
									// késõbb a validURL methodban meg újra létrehozok egy újat?
		} else {
			return false;
		}
		return true;
	}

	public static boolean isStartsWithHttpOrHttps(String uri) {
		if (uri.length() > 4) { // http, https
			if (uri.substring(0, 4).equals("http") || uri.substring(0, 5).equals("https")) {
				return true;
			}
		}
		return false;
	}

	public static String formatInput(String input) {
		return input.toLowerCase();
	}

	public static void validURL(URL inputURL) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(inputURL.openStream()));
			String line;
			while ((line = reader.readLine()) != null) {
				writeToFile(line);
			}
			reader.close();
		} catch (Exception ex) {
			System.out.println("Unknown webpage error"); // TODO
		}
	}

	public static void writeToFile(String line) {

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("content.txt", true)); //TODO újrafuttatásnál törölje a tartalmat, megoldás: eltárolom majd utoljára írom ki

			if (line.contains("<body")) {
				isInBody = true;
				line = readUntil(line, "<body");
			}

			if (isInBody) {
				if (line.contains("</body>")) {
					isInBody = false;
					line = readUntil(line, "</body>");
				}
				writer.append(line + "\n" + "\n"); // ? nem megterhelõ így, h mindig megnyitja és bemásolja?
				writer.close();
			}


		} catch (IOException e) {
			System.out.println("File reading failed.");
		}
	}

	public static String readUntil(String text, String keyword) {
		String cleanLine = "";

		if (keyword.equals("<body")) {
			for (int i = text.indexOf(keyword); i <= text.length() - 1; i++) {
				cleanLine += text.charAt(i);
			}
		} else if (keyword.equals("</body>")) {
			for (int i = 0; i <= text.indexOf(keyword)+6; i++) {
				cleanLine += text.charAt(i);
			}
		}
		
		return cleanLine;
	}
}
