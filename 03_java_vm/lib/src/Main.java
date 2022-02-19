import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		Alma a = new Alma();
		System.out.println(a.getPi());
		
		try {
			String s = new BufferedReader(new InputStreamReader(System.in)).readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
