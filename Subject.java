import java.util.Scanner;
class Student{
	Scanner sc=new Scanner(System.in);
	private 
	String student_name;
	int student_id;
	public void StudentGetdata(){
		System.out.print("\n Enter the Student Name : ");
		student_name =sc.nextLine();
		System.out.print("\n Enter the Student Id : ");
		student_id =sc.nextInt();
		
	}
	public void StudentPutdata(){
		System.out.print("\n Enter the Student Name : "+student_name);
		System.out.print("\n Enter the Student Id : "+student_id);
	}
}
class Department extends Student{
private
	String DepartmentName;
	int DepartmentId;
	
	public void DepartmentGetdata(){	
		System.out.print("\n Enter the Department Name : ");
		DepartmentName =sc.next();
		System.out.print("\n Enter the Department Id : ");
		DepartmentId =sc.nextInt();
		
	}
	public void DepartmentPutdata(){
		System.out.print("\n Department Name : "+DepartmentName);
		System.out.print("\n Department Id : "+DepartmentId);		
	}
}
class Subject extends Department{
	private float English,Maths,SocialStudies,Science,result;
	
	public static void main(String[] args){
		Subject student1 =new Subject();
		student1.StudentGetdata();
		student1.DepartmentGetdata();
		student1.SubjectGetdata();
		
		student1.StudentPutdata();
		student1.DepartmentPutdata();
		student1.SubjectPutdata();
		student1.SubjectCalculate();
		
	}
	public void SubjectGetdata(){
		System.out.print("\n Enter the marks of English: ");
		English=sc.nextFloat();
		System.out.print("\n Enter the marks of Maths: ");
		Maths=sc.nextFloat();
		System.out.print("\n Enter the marks of SocialStudies: ");
		SocialStudies=sc.nextFloat();
		System.out.print("\n Enter the marks of Science: ");
		Science=sc.nextFloat();
	}
	public void SubjectPutdata(){
		System.out.print("\n Marks in English : "+English);
		System.out.print("\n Marks in Maths : "+Maths);
		System.out.print("\n Marks in SocialStudies : "+SocialStudies);
		System.out.print("\n Marks in Science : "+Science);
	}
	
	public void SubjectCalculate(){
		result=(((English+Maths+SocialStudies+Science)/400)*100);
		System.out.print("\n  Percentage : "+result+"%");
	}
	
}