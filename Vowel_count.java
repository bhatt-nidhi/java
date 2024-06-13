import java.util.*;
class Vowel
{
	public static void main(String[] args) 
	{
		String s=new String();
		Scanner sc=new Scanner(System.in);
		System.out.print("enter string..");
		s=sc.nextLine();
		s=s.toUpperCase();

		String[] word=s.split(" ");
		for(String words: word)
		{
			int count=0;
			for(int i=0;i<words.length();i++)
			{
				char c=words.charAt(i);
                if(c=='A'|| c=='I'||c=='O'||c=='U'||c=='E')
                {
                	count++;
                }

			}
			System.out.println(words + count);

		}

	}
}