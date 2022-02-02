import java.util.Arrays;

public class XOR_cypher {

	public static void main(String[] args) {

		String secret = "secret";
		char[] chars = secret.toCharArray();

		char[] k = encrypt(chars, 5);
		System.out.println(Arrays.toString(k));

		char[] kk = decrypt(k, 5);
		System.out.println(Arrays.toString(kk));

//		System.out.println('f'^5);		//99
//		System.out.println(99^5);		//102
//		System.out.println((char) 102);	//f

	}

	public static char[] encrypt(char[] chars, int pwdNum) {
		int flag;
		char[] encCh = new char[chars.length];
		for (int i = 0; i <= chars.length - 1; i++) {
			flag = chars[i] ^ pwdNum;
			encCh[i] = (char) flag;
		}
		return encCh;
	}

	public static char[] decrypt(char[] chars, int pwdNum) {
		int flag;
		char[] decCh = new char[chars.length];
		for (int i = 0; i <= chars.length - 1; i++) {
			flag = (int) chars[i];
			flag = flag ^ pwdNum;
			decCh[i] = (char) flag;
		}
		return decCh;
	}

}
