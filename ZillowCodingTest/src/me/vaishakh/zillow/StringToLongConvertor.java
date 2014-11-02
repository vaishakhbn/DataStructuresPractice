package me.vaishakh.zillow;

import java.util.Scanner;

public class StringToLongConvertor 
{
	final static String LONG_MAX = "9223372036854775807";

	public static void main(String[] args) 
	{
		String inputString = getInputString();
		try 
		{
			System.out.println(stringToLong(inputString));
		}
		
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	private static long stringToLong(String inputString) throws Exception
	{
		//Condition to check if the input string is negative
		boolean negateOutPutLong = false;
		if(inputString.contains("-"))
		{
			negateOutPutLong = true;
			inputString = inputString.replace("-", "");
		}
		//Condition to check if long will overflow
		if(inputString.compareTo(LONG_MAX)>0 || inputString.length()>LONG_MAX.length())
		{
			//Throw an exception here
			throw new Exception("The Number is greater than the LONG_MAX");
		}
		char[] inputCharArray = inputString.toCharArray();
		long[] convertedIntArray = new long[inputCharArray.length];
		long outputLong = 0;
		for(int i = inputCharArray.length-1; i>=0; i--)
		{
			convertedIntArray[i] = (long) ((inputCharArray[i]-'0')*Math.pow(10, inputCharArray.length-1-i));
			outputLong += convertedIntArray[i];
		}
		if(negateOutPutLong)
			outputLong*=-1;
			
		return outputLong;
	}

	private static String getInputString() 
	{
		Scanner s = new Scanner(System.in);
		String inputString =  s.nextLine();
		return inputString;
	}
}
