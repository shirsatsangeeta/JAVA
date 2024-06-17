class A
{
	int a;
	A()
	{
		a = 10;
	}
	void display()
	{
		System.out.println("The value of variable in class A is : "+a);
	}
}

class B extends A
{
	int b;
	B()
	{
		b = 20;
	}
	@Override
	void display()
	{
			System.out.println("The value of variable in class B is : "+b);
	}
}
class MethodOverride
{
	public static void main(String args[])
	{
		A a = new A();  //Creating Object of class A to call the display method.
		B b = new B();  //Creating Object of class B to call the display method.
		a.display();
		b.display();   
	}
}