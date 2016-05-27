package reg.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FirstName
{
	public boolean firstNameAnalyzer(String firstName)
	{
		
		String [] specialCharArray;
		Scanner wordFile;
		int wordCount = 0;
		try
		{	//First time through the list to get its size.
			wordFile = new Scanner(new File("SpecialCharecters.txt"));
			while (wordFile.hasNext())
			{
				wordCount++;
				wordFile.next();
			}
			wordFile.close();
			
			wordFile = new Scanner(new File("SpecialCharecters.txt"));
			//creates an array with the number we got on the first list loop.
			specialCharArray = new String[wordCount];
			wordCount = 0;
			//Second list iteration to add the words to an array.
			while (wordFile.hasNext())
			{
				specialCharArray[wordCount] = wordFile.next();
				wordCount++;
			}
			wordFile.close();
			
			for(int index = 0; index < specialCharArray.length; index++)
			{
				if(firstName.contains(specialCharArray[index]))
				{
					System.out.println("wrong");
					return false;
				}
				
			}
			
			
		}
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("good");
		return true;
	}

}
