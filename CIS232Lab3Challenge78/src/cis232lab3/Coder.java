package cis232lab3;

import java.io.File;
import java.io.FileNotFoundException;
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
	
	public Coder(String fileName, String outputFile)
	{
		this.fileName = fileName;
		outputFileName = outputFile;
	}
	
	public void encode()
	{
		File file = new File(fileName);
		File outputFile = new File(outputFileName);
		Scanner inputFile;
		try {
			inputFile = new Scanner(file);
			PrintWriter output = new PrintWriter(outputFile);
			
			while(inputFile.hasNextLine())
			{
				message += inputFile.nextLine();
			}
			
			for (int i = 0; i < message.length(); i++)
			{
				letter = message.charAt(i);
				
				letter = (char) (letter + 2);
				
				codedMessage += letter;
			}
			
			System.out.println(message);
			System.out.println(codedMessage);
			output.println(codedMessage);
			
			inputFile.close();
			output.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found, please try again");
		}
		
	}
	
	public void decode() throws FileNotFoundException
	{
		File file = new File(fileName);
		File outputFile = new File(outputFileName);
		Scanner inputFile = new Scanner(file);
		PrintWriter output = new PrintWriter(outputFile);
		message = "";
		
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
	}
}
