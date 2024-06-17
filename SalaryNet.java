class salary{
	int empid;
	String name;
	double bs;
	salary(int i,String n,double b){
		empid=i;
		n=name;
		bs=b;
	}
}
interface Allowance{
	double da=0.9;
	double hra=0.1;
	double pf=0.0833;
	void netsalary();
	
}
class SalaryNet extends salary implements Allowance{
	public static void main(String arg[]){
		SalaryNet s1=new SalaryNet(44,"vinay",30000);
		s1.netsalary();
	}
	SalaryNet(int i,String n,double b){
		super(i,n,b);
	}
	public void netsalary(){
		
				double ns=bs+(da*bs)+(hra*bs)+(bs*pf);
				System.out.println("Net Salary"+ns);
			}				
	}
	
