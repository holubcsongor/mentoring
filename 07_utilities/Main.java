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
		
		String array[] = { "alma", "k�rte", "citrom" };
		// Comparable interf�sz
		array[0].compareTo(array[1]);  // 0: tot�l megegyezik
									   // -1: els� tag el�r�bb van a list�ban
									   // +1: h�tr�bb van
		Arrays.sort(array, null);  //null hely�re menne a saj�t interf�szed
		
		// BufferedReader, InputStreamReader, FileReader, Scanner
		// BufferedWriter, OutputStreamWriter, FileWriter
		// Stream: 1 dolog tudja nyitva tartani; nem tudtad �jranyitni h�ziban a System.In-t
		// Streamet valami bufferrel kell kezelni
		// stdin, stdout, stderr		
		// EOF (end of file) 
		
		// Buffer: fix m�ret� szelet, stream: folyamatos ismeretlen hossz�
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
		} // sorbufferelt: 1 karakter is csak enter ut�n !!oper�ci�s rendszer f�gg�!
		
		// Resources:
		// Neked kell megnyitni, �s neked is kell bez�rni
		//    Ezt akkor is, ha hiba van, be kell z�rni -- finally blokk	
		// Mi�rt z�rjuk: mert er�forr�st fogyaszt? 1 dolog tudja nyitva tartani: vagyis nem tudod �jranyitni, �s elv�sz
        // hogyan? close f�ggv�ny szokott lenni: dispose() - Dispose minta �ltal�ban:
		//                            Jav�ban Closeable interf�sz, close f�ggv�ny
		//  Le kell kezelni a hib�kat inicializ�l�skor: nem tudod megnyitni, nem l�tezik...
		
		
		//sb: arra j�, immutable objektumod m�gis m�dos�that� lesz; wrapper oszt�ly az objektum k�r�l
		StringBuilder sb = new StringBuilder("alma");
		sb.setCharAt(2, 'M');
		System.out.println(sb.toString());
		// Builder t�bb oszt�lynak is van, de �ltal�ban Stringre haszn�ljuk
		
		String f = String.format("%1.8f kil� alm�m van %s v�rosban", 5.023452, "Debrecen" ); // c-ben printf
		
		System.out.println(f);
		/* %d: integer (decimal)
		 * %u: unsigned integer
		 * %c karakter
		 * %s sztring
		 * %e %f �s %g float/double : %e: 12e-1 | %f hossz� verzi� (0.120000000) | %g generaliz�lt 0.12
		 */
		
	}
}
