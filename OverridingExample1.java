class animal {
public void move(){
		System.out.println("\n The Class Animal  Move function is called.\n ");
}
}
class dog extends animal{
@Override
public void move(){
//super.move(); this is used to call the function that is getting overrided at the runtime.
System.out.println("\n The Class Dog Move function is called. \n ");
}
}
 class OverridingExample1{
	public static void main(String arg[]){
	animal a1 = new animal();
System.out.println("\n Calling move function through the Object of Animal Class:  ");
a1.move();
	dog d1 = new dog();
System.out.println("\n Calling move function through the Object of Dog Class:");
d1.move();
}
}
