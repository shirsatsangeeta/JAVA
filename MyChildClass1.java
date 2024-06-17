class MyBaseClass
{
protected void disp()
{
	System.out.println("Parent class method");
}
}

class MyChildClass1 extends MyBaseClass
{
public void disp()
{
System.out.println("Child class method");
}
public static void main (String args[])
{
MyChildClass obj = new MyChildClass();
obj.disp(); 
}
}