package cis232lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Coder 
{
	private String fileName;
	private char letter;
	private String message = "";
	private String outputFileName;
	private String codedMessage = "";
	private String decodedMessage = "";
	
	//Creates object
	public Coder(String fileName, String outputFile)
	{
		this.fileName = fileName;
		outputFileName = outputFile;
	}
	
	//Adds two to each characters unicode value
	public void encode()
	{
		File file = new File(fileName);
		File outputFile = new File(outputFileName);
		Scanner inputFile;
		
		//Try catch for if the file isn't found
		try {
			inputFile = new Scanner(file);
			PrintWriter output = new PrintWriter(outputFile);
			message = "";
			codedMessage = "";
			
			//Reads through the entire text file
			while(inputFile.hasNextLine())
			{
				message += inputFile.nextLine();
			}
			
			//Goes through the string character by character, adding two to each letters unicode value
			for (int i = 0; i < message.length(); i++)
			{
				letter = message.charAt(i);
				
				letter = (char) (letter + 2);
				
				codedMessage += letter;
			}
			
			//Test message for if it worked
			System.out.println(message);
			System.out.println(codedMessage);
			output.println(codedMessage);
			
			//Closing the files so it works
			inputFile.close();
			output.close();
		} catch (FileNotFoundException e) 
		{
			System.out.println("File not found, please try again");
		}
		
	}
	
	//Goes through an encoded file and decodes it, subtracting two from a letter's unicode value
	public void decode()
	{
		File file = new File(fileName);
		File outputFile = new File(outputFileName);
		Scanner inputFile;
		
		//Mostly the same as encode, but with different variable names and instead subtracts two
		try 
		{
			inputFile = new Scanner(file);
			PrintWriter output = new PrintWriter(outputFile);
			message = "";
			decodedMessage = "";
			
			while(inputFile.hasNextLine())
			{
				message += inputFile.nextLine();
			}
			
			for (int i = 0; i < message.length(); i++)
			{
				letter = message.charAt(i);
				
				letter = (char) (letter - 2);
				
				decodedMessage += letter;
			}
			
			System.out.println(message);
			System.out.println(decodedMessage);
			output.println(decodedMessage);
			
			inputFile.close();
			output.close();
		} catch (FileNotFoundException e) 
		{
			System.out.println("File not found");
		}
		
		
	}
}
