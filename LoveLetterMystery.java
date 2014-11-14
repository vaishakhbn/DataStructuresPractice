/*
 * James found a love letter his friend Harry has written for his girlfriend. James is a prankster, so he decides to meddle with the letter. He changes all the words in the letter into palindromes.

To do this, he follows 2 rules:

(a) He can reduce the value of a letter, e.g. he can change 'd' to 'c', but he cannot change 'c' to 'd'. 
(b) In order to form a palindrome, if he has to repeatedly reduce the value of a letter, he can do it until the letter becomes 'a'. Once a letter has been changed to 'a', it can no longer be changed.

Each reduction in the value of any letter is counted as a single operation. Find the minimum number of operations required to convert a given string into a palindrome. 


Input Format 
The first line contains an integer T, i.e., the number of test cases. 
The next T lines will contain a string each. The strings do not contain any spaces.

Output Format 
A single line containing the number of minimum operations corresponding to each test case.
 */

package in.vaishakh.one;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LoveLetterMystery {

    public static void main(String[] args) 
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
			System.out.println(getNumberOfConversions(inputStrings[i]));
		}
		
	}

	private static int getNumberOfConversions(String inputString) 
	{
		int numberOfConversions = 0;
       char[] leftArray = new char[inputString.length()/2];
        char[] rightArray = new char[inputString.length()/2];
            for(int i = 0; i<inputString.length()/2; i++)
            {
                leftArray[i] = inputString.charAt(i);
                rightArray[i] = inputString.charAt(inputString.length()-1-i);
            }
            for(int i = 0; i < leftArray.length; i++)
            {
            	if(leftArray[i]==rightArray[i])
            		continue;
            	else if(leftArray[i]<rightArray[i])
            	{
            				numberOfConversions+=(rightArray[i]-leftArray[i]);
            				
            	}
            	else if(rightArray[i]<leftArray[i])
            	{
            		numberOfConversions+=(leftArray[i]-rightArray[i]);
            	}
            }
            
			return numberOfConversions;
        
	}

}
