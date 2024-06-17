/*Write a program, to create a class “Salary” with data members “empid”, “name” and 
“basicsalary”. Write an interface “Allowance” which stores rates of calculation for da 90% of 
basic salary, hra as 10% of basic salary and pf as 8.33% of basic salary. Include a method to 
calculate net salary and display it.
*/

class Salary{
	int empid;
	String name;
	double basicsalary;
	Salary(int empid,String name,double basicsalary){
		this.empid=empid;
		this.name=name;
		this.basicsalary=basicsalary;
	}
}
interface Allowance{
	double da=0.9;
	double hra=0.1;
	double pf=0.0833;
	void display();
}

class netSalary extends Salary implements Allowance{
	
	netSalary(int id,String name,double basicsalary){
		
		super(id,name,basicsalary);
	}
	@Override
	public void display(){
		System.out.println("Name: "+name);
		System.out.println("Id: "+id);
		System.out.println("Basic Salary: "+basicsalary);
		double net= basicsalary+(da*basicsalary)+(hra*basicsalary)+(pf*basicsalary);
		System.out.println("Net Salary: "+net);
	}
	public static void main(String arg[]){
		netSalary n1= new netSalary(44,"Vinay",30000);
		n1.display();
	}
}