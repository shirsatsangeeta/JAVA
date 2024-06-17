import java.util.Scanner;
interface Interest{
	double rate=0.25;
	void simpleIntrest(double principal,double time);
	void compoundIntrest(double principal,double time);
}
class practical16 implements Interest{
@Override
public void simpleIntrest(double principal,double time){
	double si=(principal*time*rate)/100;
	System.out.println(" Simple Intrest: "+si);
}
@Override
public void compoundIntrest(double principal,double time){
	double ci=principal*(Math.pow((1+rate),time))-principal;
	System.out.println(" Compound Intrest: "+ci);
}
	public static void main(String arg[]){
		double principal=0, time=0;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the principal Amount: ");
		principal=sc.nextDouble();
		System.out.println(" Enter the time period: ");
		time=sc.nextDouble();
		practical16 p1=new practical16();
		
		p1.simpleIntrest(principal,time);
		p1.compoundIntrest(principal,time);
	}
}