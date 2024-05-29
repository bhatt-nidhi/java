abstract class Rbi
{
	void display()
	{
		System.out.println("this is Rbi");
	}

	abstract double getRate();
	abstract void getName();
}
class Sbi extends Rbi
{
	double getRate()
	{
		return 9.7;
	}

	void getName()
	{
		System.out.println("SBI BANK");
	}
}
final class Axis extends Rbi
{
	double getRate()
	{
		return 7.6;
	}
	 void getName()
	{
		System.out.println();
	}
}

class Abst
{
	public static void main(String[] args) 
	{
		Rbi r=new Sbi();
		r.display();
		System.out.println(r.getRate());
		// System.out.println(r.getName());
		r.getName();
		Rbi ri=new Axis();
		System.out.println(ri.getRate());
		//System.out.println(ri.getName());

	}
}