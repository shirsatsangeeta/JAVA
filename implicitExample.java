import java.util.Scanner;
class implicitExample{
	public static void main(String arg[]){
	Scanner sc = new Scanner(System.in);
	byte a;
	System.out.print("Enter the no:");
	a=sc.nextByte();
	System.out.println("Byte value ="+a);
	 short b=a;
	System.out.println("Short value ="+b);
	int c=b;
		System.out.println("Int value ="+c);
	long d=c;
	System.out.println("Long value ="+d);

	float e=d;
	System.out.println("Float value ="+e);
	double f=d;
	System.out.println("Double value ="+f);


	}
}