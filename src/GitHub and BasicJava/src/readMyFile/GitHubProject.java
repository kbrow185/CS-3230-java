/*Kenyon Brown
 *CS#3230 Java
 * 
 */


package readMyFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class GitHubProject {

	//got reader information from: http://www.codejava.net/java-se/file-io/how-to-read-and-write-text-file-in-java
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Scanner wait = new Scanner();
		try
		{
		FileReader theReader = new FileReader("../../about_me.txt");
		int line;
			do
			{
				line= theReader.read();
				System.out.print((char)line);
			
			}while(line != -1);
			theReader.close();
			System.in.read();
			
		}
		
		catch (FileNotFoundException e)
		{
			System.out.println("File Not Found");
		}
		catch (IOException e)
		{
			System.out.println("File Not Found");
		}
		

	}

}
