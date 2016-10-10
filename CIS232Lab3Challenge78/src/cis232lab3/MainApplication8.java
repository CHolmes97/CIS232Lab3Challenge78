package cis232lab3;

import java.util.Scanner;

public class MainApplication8 {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the name of the file where to message is coded: ");
		String fileName = keyboard.nextLine();
		
		System.out.println("Where would you like the decoded message to go: ");
		String outputFileName = keyboard.nextLine();
		
		Coder decoder = new Coder(fileName, outputFileName);
		
		
		decoder.decode();
		keyboard.close();
	}

}
