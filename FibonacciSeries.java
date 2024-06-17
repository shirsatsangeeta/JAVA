import java.util.Scanner;

class FibonacciSeries{
	public static void main(String arg[]){
		int n1=0,n2=1,n,result;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the range of Fibonacci Series :");
			n=sc.nextInt();
			System.out.print("the Fibonacci Serries is :");
			System.out.print(n1);
			System.out.print(","+n2);
			for(int i=1;i<=n;i++){
				result=n1+n2;
				System.out.print(","+result);
					n1=n2;
					n2=result;
			}

	}
}