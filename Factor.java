import java.util.*;
class fact
{	

Scanner sc=new Scanner(System.in);
	void msg()
	{
		
		System.out.print("enter number..");
		int no=sc.nextInt();
		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
			{
				System.out.println(i+" ");
			}
		}
	}
}

class Factor
{
	public static void main(String[] args) 
	{
		fact f=new fact();
		f.msg();
	}
}