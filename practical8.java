class copyConstructor{
	int rollno;
	String name;
	String Address;
	copyConstructor(int rollno, String name, String Address){
		this.rollno=rollno;
		this.name=name; 
		this.Address=Address;
	}
	copyConstructor(copyConstructor c1){
		this.rollno=c1.rollno;
		this.name=c1.name;
		this.Address=c1.Address;
	}
	void display(){
		System.out.println("Roll no: "+rollno);
		System.out.println("Name: "+name);
		System.out.println("Address: "+Address);
	}
}
class practical8{
	public static void main(String arg[]){
	copyConstructor c1=new copyConstructor(44,"vinay","Santacruz West Mumbai 400-049");
	copyConstructor c2=new copyConstructor(c1);
	System.out.println("\n Calling the display function of object c1. \n");
	c1.display();
	System.out.println("\n Passing the valuse of c1 object in c2 object  by using the concep of Copy constructor. \n");
	c2.display();
	}
}