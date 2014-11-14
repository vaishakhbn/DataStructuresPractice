/*
 * Your task is to find the minimum number of required deletions.

Input Format 
The first line contains an integer T i.e. the number of test cases. 
Next T lines contain a string each.

Output Format 
Print minimum number of required steps for each test case.
 */

package in.vaishakh.one;

import java.util.Scanner;

public class AlternatingCharacters {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int numberOfStrings =  Integer.parseInt(s.nextLine());
		String[] inputStrings = new String[numberOfStrings];
		for(int i = 0 ; i < numberOfStrings ; i++)
		{
			inputStrings[i] = s.nextLine();
		}
		for(int i = 0 ; i < inputStrings.length; i++)
		{
			System.out.println(getNumberOfDeletions(inputStrings[i]));
		}
		
	}

	private static int getNumberOfDeletions(String inputString) 
	{
		int numberOfDeletions = 0;
		for(int i = 0; i< inputString.length()-1; i++)
				if(inputString.charAt(i)==inputString.charAt(i+1))
					numberOfDeletions++;
					
				
			
		
		return numberOfDeletions;
	}

}
