interface One 
{
	void demo();
}

interface Two extends One
{
	void display();
}

class Inter implements Two
{
	public void demo()
	{
		System.out.println("first interface..");
	}
	public void display()
	{
		System.out.println("second interface..");
	}
	public static void main(String[] args)
	{
		Inter i=new Inter();
		i.demo();
		i.display();
	}
}