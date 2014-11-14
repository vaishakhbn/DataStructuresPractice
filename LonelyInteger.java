/*
 * There are N integers in an array A. All but one integer occur in pairs. Your task is to find out the number that occurs only once.

Input Format

The first line of the input contains an integer N indicating number of integers. 
The next line contains N space separated integers that form the array A.

Output Format

Output S, the number that occurs only once.
 */
package in.vaishakh.one;

import java.util.Scanner;

public class LonelyInteger 
{
	public static void main(String args[])
	{
	Scanner s = new Scanner(System.in);
	int arrayLength =  s.nextInt();
	int[] inputArray = new int[arrayLength];
	for(int i = 0 ; i < arrayLength; i++)
	{
		inputArray[i] = s.nextInt();
	}
	System.out.println(getLonelyInteger(inputArray));

	}

	private static int getLonelyInteger(int[] inputArray) {
		int lonelyInteger = inputArray[0];
		for(int i = 1 ; i < inputArray.length; i++)
		{
			lonelyInteger = lonelyInteger^inputArray[i];
		}
		return lonelyInteger;
	}
}
