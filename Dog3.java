interface Pet
{
public void test();
}
class Dog3 implements Pet {
public void test()
{
System.out.println("Interface Method Implemented");
}
public static void main(String args[]) {
Pet p = new Dog3();
p.test();
}
}
