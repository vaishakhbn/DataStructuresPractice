/*
 * The Utopian tree goes through 2 cycles of growth every year. The first growth cycle occurs during the spring, when it doubles in height. The second growth cycle occurs during the summer, when its height increases by 1 meter. 
Now, a new Utopian tree sapling is planted at the onset of the spring. Its height is 1 meter. Can you find the height of the tree after N growth cycles?

Input Format 
The first line contains an integer, T, the number of test cases. 
T lines follow. Each line contains an integer, N, that denotes the number of cycles for that test case.
 */
package in.vaishakh.one;

import java.io.*;
import java.util.*;
public class UtopianTree {

    private static Scanner s;
	public static void main(String[] args) {
        s = new Scanner(System.in);
        int numTestCases  = s.nextInt();
        int[] inputArray = new int[numTestCases];
        for(int i = 0; i<inputArray.length; i++)
            {
            inputArray[i] = s.nextInt();
        }
        
        for(int i = 0; i < numTestCases; i++)
            {
            
             System.out.println(getGrowthOfTree(inputArray[i]));
            
        }
        
    }
    public static int getGrowthOfTree(int numberOfCycles)
    {
    	int totalSize = 1;
    	for(int i = 1; i<=numberOfCycles; i++)
    	{
    		if(i%2 != 0)
    			totalSize = totalSize*2;
    		else
    			totalSize+=1;
    	}
            return totalSize;
    }
}