package cis232lab3;

import java.io.IOException;
import java.util.Scanner;

public class MainApplication7 {

	public static void main(String[] args) throws IOException 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the name of the file where to message is located: ");
		String fileName = keyboard.nextLine();
		
		System.out.println("Where would you like the coded message to go: ");
		String outputFileName = keyboard.nextLine();
		
		Coder coder = new Coder(fileName, outputFileName);
		
		coder.encode();
	}

}
