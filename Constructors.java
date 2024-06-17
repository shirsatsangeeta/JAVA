class Student{
	int RollNo;
	String name;
		public void studentInfo(){
		System.out.println(this.RollNo);
		System.out.println(this.name);
			}
}
public class Constructors{
	public static void main(String arg[]){
		Student s1=new Student();	/* Hear there is no constructor then also 
									the the further code is been Executed.*/
		s1.RollNo=44;
		s1.name="Vinay Prakash More";
		s1.studentInfo();
	}
}