import java.util.*;
class vowel2
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the lines to check vowels");
		String line=sc.nextLine();

		String[] words=line.split("\\s+");

		for( String word : words)
		{
			int vowelcount=countsvol(word);
			System.out.println(word + " has " + vowelcount + " vowel ");
		}
	}
	public static int countsvol(String word)
	{
		int count=0;
		String vowels="aeiouAEIOU";
		for(char ch : word.toCharArray())
		{
			if (vowels.indexOf(ch)!=-1) 
			{
				count++;
				
			}
		}
		return count++;
	}
}