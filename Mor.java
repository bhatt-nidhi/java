class Animal
{
	void move()
	{
		System.out.println("parent class..");
	}
}
class Dog extends Animal
{
	void move()
	{
		System.out.println("child class..");
	}

}
class Mor
{
	public static void main(String[] args)
	 {
		Animal a=new Animal();
		Dog d = new Dog();
		d.move();
		Animal a = new Dog();
		a.move();

		//Dog d=new Animal();

	}
}