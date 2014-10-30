import java.util.Scanner;

public class StringToLongConvertor 
{

	public static void main(String[] args) 
	{
		String inputString = getInputString();
		System.out.println(stringToLong(inputString));
	}

	private static long stringToLong(String inputString) 
	{
		
		char[] inputCharArray = inputString.toCharArray();
		long[] convertedIntArray = new long[inputCharArray.length];
		long outputLong = 0;
		for(int i = inputCharArray.length-1; i>=0; i--)
		{
			convertedIntArray[i] = (long) ((inputCharArray[i]-'0')*Math.pow(10, inputCharArray.length-1-i));
			outputLong += convertedIntArray[i];
		}
		return outputLong;
	}

	private static String getInputString() 
	{
		Scanner s = new Scanner(System.in);
		String inputString =  s.nextLine();
		return inputString;
	}
}
