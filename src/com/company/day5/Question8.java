package com.company.day5;
import java.io.*;

public class Question8 {
	public static void main(String[] args) throws IOException {
//BufferedInputStream
		{                        // reading-side
			FileInputStream fistream = new FileInputStream("pqr.txt"); // a low-level stream
			BufferedInputStream bistream = new BufferedInputStream(fistream); // a high-level stream
			// wriring-side
			FileOutputStream fostream = new FileOutputStream("xyz.txt"); // a low-level stream
			BufferedOutputStream bostream = new BufferedOutputStream(fostream);  // a high-level stream

			int temp;
			while ((temp = bistream.read()) != -1) {
				bostream.write(temp);
				System.out.print((char) temp);
			}
			bostream.close();
			fostream.close();
			bistream.close();
			fistream.close();
		}
	}
}
