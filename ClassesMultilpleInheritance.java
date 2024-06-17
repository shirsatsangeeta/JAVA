interface Animal{
	
	void eat();
	void sleep();
	
}
interface Flyer{
	
	void eat();
	void fly();
	
}
class Bird implements Animal,Flyer{
	
	public void eat(){
	
		System.out.println("Bird is eating:");

	}
	public void sleep(){
	
		System.out.println("Bird is sleeping:");
		
	}
	public void fly(){
		
		System.out.println("Bird is flying:");
		
	}

}
class ClassesMultilpleInheritance{
	public static void main(String arg[]){
			Bird bird=new Bird();
			bird.eat();
			bird.sleep();
			bird.fly();
	}
}