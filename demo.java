import java.util.*;
class arm
{
	
		static Scanner sc=new Scanner(System.in);
}

class Armstrong extends arm
{

		public static void main(String[] args) 

{

		arm a=new arm();
		System.out.print("please enter the no.");
		int no=sc.nextInt();

		// int num=257;
		int sum=0;
		int m;
		int number=no;

	while(no>0)
		{
			m=no%10;
			no=no/10;
			sum= sum+(m*m*m);
		}

	if(number==sum)
	{
		        System.out.println(sum +"  is armstong number");

	}
	else
		{
				System.out.println(sum +"  is not armstrong number");
		}

	}


}
