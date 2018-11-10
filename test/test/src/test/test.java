package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		Scanner fileIn = null;
		
		try {
			fileIn = new Scanner(
					new FileInputStream("test.txt"));
		} catch (FileNotFoundException e){ 
			System.out.println("File not found.");
			System.exit(0);
		}
	
	
	
	
	
	}

}
