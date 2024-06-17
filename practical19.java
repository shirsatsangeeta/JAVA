class salary{
	int empid;
	String name;
	double basicSalary;
	salary(int empid,String name,double basicSalary){
		this.empid=empid;
		this.name=name;
		this.basicSalary=basicSalary;
	}
}
interface Allowance{
	double da=0.9;
	double hra=0.1;
	double pf=0.0833;
	void display();
}
class practical19 extends salary implements Allowance{
	practical19(int empid,String name,double basicSalary){
		super(empid,name,basicSalary);
	}
	public void display(){
		double netSalary=basicSalary+(da*basicSalary)+(hra*basicSalary)+(pf*basicSalary);
		System.out.println("Employee Id:"+empid);
		System.out.println("Employee Name:"+name);
		System.out.println("Basic Salary:"+basicSalary);

		System.out.println("Net Salary:"+netSalary);
	}
	public static void main(String arg[]){
		
		practical19 p1=new practical19(44,"vinay",30000);
		p1.display();
	}
}