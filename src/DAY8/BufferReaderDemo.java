package DAY8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderDemo {
	
	//example of Check Exception
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
		System.out.println("Enter your name: ");
		String name = br.readLine(); //throw IOException
		}
		catch(IOException ex) {}
	}
	
}
