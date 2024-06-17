import java.util.Scanner;
class College{
	int code;
	String name;
	void getdata1(){
		Scanner sc=new Scanner(System.in);
		System.out.print(" \n Enter the College code: ");
		code=sc.nextInt();
		System.out.print(" \n Enter the College Name: ");
		sc.nextLine();
		name=sc.nextLine();
		
	}
	void putdata1(){
		System.out.println("College Code: "+code);
		System.out.println("College Name: "+name);
	}
}
class Employee extends College{
	int empid;
	String empname;
	void getdata2(){
				Scanner sc=new Scanner(System.in);

	System.out.print(" \n Enter the Employee Id:");
		empid=sc.nextInt();
		System.out.print(" \n Enter the Empployee Name: ");
		sc.nextLine();
		empname=sc.nextLine();	
		
	}
	void putdata2(){
		System.out.println("Employee Id: "+empid);
		System.out.println("Employee Name: "+empname);
	}
}
class Student extends College{
	int studentId;
	String studentName;
	void getdata3(){
				Scanner sc=new Scanner(System.in);

		System.out.print(" \n Enter the Student Id:");
		studentId=sc.nextInt();
		System.out.print(" \n Enter the Student Name: ");
		sc.nextLine();
		studentName=sc.nextLine();	
		
	}
	void putdata3(){
		System.out.println("Student Id: "+studentId);
		System.out.println("Student Name: "+studentName);		
	}
}	
class practical15{
	public static void main(String arg[]){
		Employee e1=new Employee();
		Student s1=new Student();
		System.out.println("Enter the details of the Employee: ");
		e1.getdata1();
		e1.getdata2();
		System.out.println("Enter the details of the Student: ");
		s1.getdata1();
		s1.getdata3();
		System.out.println("Details of the Employee: ");
		e1.putdata1();
		e1.putdata2();
		System.out.println("Details of the Student: ");
		s1.putdata1();
		s1.putdata3();
	}
}