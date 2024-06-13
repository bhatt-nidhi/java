import java.util.*;
class Substring extends Sub
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
		String str1=sc.nextLine();
		System.out.println("enter substring");
		String str2=sc.nextLine();
		 str1=str1.toLowerCase();
		 str2=str2.toLowerCase();

		 String[] words=str1.split(" ");

		 int count=0;
		 for(String word : words)
		 {
		 	if(word.equals(str2))
		 	{
		 		count++;
		 	}
		 }

		System.out.println("substring " + str2 + " is repeating "+ count +" times");
	}
}