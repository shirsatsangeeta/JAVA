interface Exam{
	int sport=20;
	
}
class student{
	int roll;
	double m1,m2,m3;
	String name;
	student(int roll,String name,double m1,double m2, double m3){
		this.roll=roll;
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
}
class result extends student implements Exam{
	result(int roll,String name,double m1,double m2, double m3){
		super(roll,name,m1,m2,m3);
	}
	void display(){
		Double total=m1+m2+m3+sport;
		System.out.println("Name:"+name);
		System.out.println("Roll no:"+roll);
		System.out.println("Total: "+total);
	}
	public static void main(String arg[]){
		result r1=new result(44,"vinay",56,56,56);
		r1.display();
	}
}
