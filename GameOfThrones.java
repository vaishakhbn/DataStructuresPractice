
/*
 * King Robert has 7 kingdoms under his rule. He finds out from a raven that the Dothraki are soon going to wage a war against him. But, he knows the Dothraki need to cross the Narrow River to enter his realm. There is only one bridge that connects both banks of the river which is sealed by a huge door.

door

The king wants to lock the door so that the Dothraki can't enter. But, to lock the door he needs a key that is an anagram of a certain palindrome string.

The king has a string composed of lowercase English letters. Help him figure out if any anagram of the string can be a palindrome or not.

Input Format 
A single line which contains the input string

Constraints 
1<=length of string <= 10^5 
Each character of the string is a lowercase English letter.

Output Format 
A single line which contains YES or NO in uppercase.
 */

package in.vaishakh.one;

import java.util.Arrays;
import java.util.Scanner;

public class GameOfThrones {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int count = 0;
		String inputString = s.nextLine();
		char[] inputCharArray = new char[inputString.length()];
		inputCharArray = inputString.toCharArray();
		Arrays.sort(inputCharArray);
		if(inputCharArray.length%2==0)
		{
			for(int i = 0 ; i < inputCharArray.length-1; i+=2)
			{
				if(inputCharArray[i]!=inputCharArray[i+1])
				{
					System.out.println("NO");
					return;
				}
			
			}
			System.out.println("YES");
		}
		else 
		{
			for(int i = 0 ; i < inputCharArray.length-1; i+=2)
			{
				if(inputCharArray[i]!=inputCharArray[i+1])
				{
					i =i -1;
					count = count +1;
				}
			}
			if(count>1)
			{
				System.out.println("NO");
			}
			else
			{
				System.out.println("YES");
			}
		}
	}
}
