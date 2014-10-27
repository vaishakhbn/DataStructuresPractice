import java.util.Arrays;

public class FindNumberOfAnagrams {

	public static void main(String[] args) {
		String[] inputArray = {"dog","cat","god","ogd","tac"};
		String[] outputArray = new String[inputArray.length];
		for(int i = 0; i<inputArray.length; i++)
		{
			
			char[] a = inputArray[i].toCharArray();
			Arrays.sort(a);
			outputArray[i] = String.valueOf(a);
		}
		Arrays.sort(outputArray);
		for(int i = 0;i < outputArray.length-1; i++)
		{
			if(outputArray[i].equalsIgnoreCase(outputArray[i+1]))
			{
				System.out.println(" Anagram : "+outputArray[i]);
			}
		}

	}

}
