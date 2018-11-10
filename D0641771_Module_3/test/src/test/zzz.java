package test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;


public class zzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Get keyboard input */
		Scanner keyboardInput;
		keyboardInput = new Scanner(System.in);
		
		/* Read your input file path from keyboard*/
		System.out.println("Please input your input file path: ");
		String inputFilePath = keyboardInput.nextLine();
		System.out.println("Input file path: " + inputFilePath);
		
		/* Read your output file path from keyboard*/
		System.out.println("Please input your output file path: ");
		String outputFilePath = keyboardInput.nextLine();
		System.out.println("Output file path: " + outputFilePath);
		System.out.println("*************************************");

	}

}
