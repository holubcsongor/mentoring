public class Basic {
	
	public static void main(String[] args) {
		Lamp l;
		
		l = Lamp.Lamp_off;
		
		Police p = Police.RedYellow;
		
		State state = State.error;
		
		while(true)
		{
			if(state == State.not_initialized)
			{
				//init();
			}
			else if(state == State.initialized)
			{
				//start();
			}
			else if(state == state.running)
			{
				// do work
			}
			else if(state == state.error)
			{
				break;
			}

		}
		
		// static - dynamic
		int array[] = { 1, 6, 8};
		// int array[65]; 
		
		int array2[] = new int[65];
		final int array_size = 3;
		array2 = new int[array_size];
		
		// 0-1-2
		for(int i=0; i<array_size; i++)
		{
			array2[i] = i+1;
		}
		
		char mystring[] = "teszt".toCharArray();
		
		// "teszt".equals(s);
		
		int size = mystring.length;
		
		// string
		// mystring = new char[5]
		// teSzt\0 nullterminated string
		int j=0;
		while(mystring[j]!='\0')
		{
			j++;
		}
		// stringbuilder for mutable changes

		// character encodings
		// ASCII windows1250
		// Unicode: 2 bytes - 65536 -- lower byte (upper = 0) == ASCII
		
		// UTF-8 : mostly used on web
		// 0123457 01234567 
		// 1010101 01010101
		
		// Endianness
		
		// bitwise operations
		// not, xor, or, and, shr (shift right), shl
		byte myInt = 68; // 0100 0100
		
		// not:
		// change all bit
		
		// xor (exclusive or)
		// true (1) if exactly is 1
		
		// a  b    || res (a^b)
		// 0  0        0
		// 0  1        1
		// 1  0        1
		// 1  1        0
		
		// or
		// 1 if any equals 1
		// a  b    || res (a|b)
		// 0  0        0
		// 0  1        1
		// 1  0        1
		// 1  1        1
		
		// and
		// 1 if all equals 1
		// a  b    || res (a&b)
		// 0  0        0
		// 0  1        0
		// 1  0        0
		// 1  1        1
		
		myInt = (byte) ~myInt; // 0000 0001 --> 1111 1110
		myInt ^= 35; // myInt = myInt ^ 35 : 11111110 ^ 00100011 = 11011101
		myInt |= 21; // 11011101 | 00010101 = 11011101
		myInt &= 5;  // 11011101 & 00000101 = 00000101
		
		myInt <<= 2; // 00000101 --> 00010100
		
		// mostly for space- or speed-spare
		int my32bits = 0b10001000; // = 8, but not the 8th index  
		
		// you are the 4th device (index starts from 0)
		// 1<<3 (00001000)  & 0b10001000 = 00010000
		if((my32bits&(1<<3))!=0)
		{
			// you may start
		}
		
		// shr and shl together does not give the original number
	}

}
