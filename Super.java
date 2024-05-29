class A
{
	int x;
	A(int x)
	{
		System.out.println("super class constructor");
		this.x=x;
	}
	void show()
	{
		System.out.println("the value of x= " + x);
	}
}
class B extends A
{
	int y;
	B(int x,int y)
	{
		super(x);
		this.y=y;
		System.out.println("child class constructor");
		
	}
	void dis()
	{
		super.show();
		System.out.println("the value of x =" +x);
		System.out.println("the value of y = "+y);
	}
}
class Super
{
	public static void main(String[] args) {
		B b=new B(10,5);
		b.dis();
	}
}