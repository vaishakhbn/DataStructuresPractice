/*
 * Given two integers: L and R,

find the maximal values of A xor B given, L ≤ A ≤ B ≤ R

Input Format 
The input contains two lines, L is present in the first line. 
R in the second line.
*/
package in.vaishakh.one;

import java.util.Scanner;

public class MaximiseXor {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int leftBoundary = s.nextInt();
		int rightBoundary = s. nextInt();
		System.out.println(getMaximisedXor(leftBoundary, rightBoundary));
				
	}

	private static int getMaximisedXor(int leftBoundary, int rightBoundary) {
		
		int maximumXorValue = 0;
		for(int i = leftBoundary; i< rightBoundary ; i++)
		{
			for(int j = leftBoundary; j< rightBoundary; j++)
	
			{
				if(maximumXorValue<(i^j))
					maximumXorValue = i^j;
			}
		}
		
		return maximumXorValue;
		
		
	}

}
