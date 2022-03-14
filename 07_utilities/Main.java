import java.util.Arrays;
import java.io.*; // file/streams
import java.net.*; //network

public class Main {

	public static void main(String[] args) {
		
		String s = "alma".toLowerCase(); //Object

		s.toString();
		s.equals("alma");
		s.hashCode();
		
		double x = Math.abs(0.4);
		
		String array[] = { "alma", "körte", "citrom" };
		// Comparable interfész
		array[0].compareTo(array[1]);  // 0: totál megegyezik
									   // -1: elsõ tag elõrébb van a listában
									   // +1: hátrébb van
		Arrays.sort(array, null);  //null helyére menne a saját interfészed
		
		// BufferedReader, InputStreamReader, FileReader, Scanner
		// BufferedWriter, OutputStreamWriter, FileWriter
		// Stream: 1 dolog tudja nyitva tartani; nem tudtad újranyitni háziban a System.In-t
		// Streamet valami bufferrel kell kezelni
		// stdin, stdout, stderr		
		// EOF (end of file) 
		
		// Buffer: fix méretû szelet, stream: folyamatos ismeretlen hosszú
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			char c= (char) br.read();
			System.out.println(c); 
			// a b c d enter
			// b c d
			char d= (char) br.read();
			// c d maradt a streamen
			System.out.println(d); 
		} catch (IOException e) {
			e.printStackTrace();
		} // sorbufferelt: 1 karakter is csak enter után !!operációs rendszer függõ!
		
		// Resources:
		// Neked kell megnyitni, és neked is kell bezárni
		//    Ezt akkor is, ha hiba van, be kell zárni -- finally blokk	
		// Miért zárjuk: mert erõforrást fogyaszt? 1 dolog tudja nyitva tartani: vagyis nem tudod újranyitni, és elvész
        // hogyan? close függvény szokott lenni: dispose() - Dispose minta általában:
		//                            Javában Closeable interfész, close függvény
		//  Le kell kezelni a hibákat inicializáláskor: nem tudod megnyitni, nem létezik...
		
		
		//sb: arra jó, immutable objektumod mégis módosítható lesz; wrapper osztály az objektum körül
		StringBuilder sb = new StringBuilder("alma");
		sb.setCharAt(2, 'M');
		System.out.println(sb.toString());
		// Builder több osztálynak is van, de általában Stringre használjuk
		
		String f = String.format("%1.8f kiló almám van %s városban", 5.023452, "Debrecen" ); // c-ben printf
		
		System.out.println(f);
		/* %d: integer (decimal)
		 * %u: unsigned integer
		 * %c karakter
		 * %s sztring
		 * %e %f és %g float/double : %e: 12e-1 | %f hosszú verzió (0.120000000) | %g generalizált 0.12
		 */
		
	}
}
