import java.util.*;
class Ne
{
	static Scanner sc=new Scanner(System.in);

}

class Neon extends Ne
{
	public static void main(String[] args) 
	{
		System.out.println("enter a number");
		int no=sc.nextInt();
		int sum=0;
		int square=no*no;
		while(square!=0)
		{
			int digit=square%10;

			sum=digit+sum;

			square=square/10;

		}
		if(sum==no)
		{
			System.out.println("this is neon no.");
		}
		else 
		{
			System.out.println("this is not neon no");
		}
	}
}