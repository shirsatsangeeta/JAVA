import java.util.Scanner;
class employee1{
	int empid;
	String name;
	double salary;
	void acceptData(){
		Scanner sc=new Scanner(System.in);
		System.out.print(" \n Enter the Employee ID: ");
			empid=sc.nextInt();
		sc.nextLine();
		System.out.print(" \n Enter the Employee Name: ");
			name=sc.nextLine();
		System.out.print(" \n Enter the Employee Salary: ");
			salary=sc.nextDouble();
	}
	void display(){
		System.out.println(" Employee ID: "+empid);
		System.out.println(" Employee name: "+name);
		System.out.println(" Employee Salary: "+salary);
	}
	public static void main(String arg[]){
		employee1 e[]=new employee1[3];
		for(int i=0; i<3; i++){
			System.out.println("Enter the Data of "+(i+1)+" Employee: \n ");
			e[i]=new employee1();
			e[i].acceptData();
		}
		for(int i=0;i<3;i++){
			System.out.println("Employeee: "+(i+1)+"\n");
			e[i].display();
		}
	}
}